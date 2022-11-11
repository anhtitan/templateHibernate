/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import models.CuaHang;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hibernateConfig.HibernateConfig;

/**
 *
 * @author AnhTiTan
 */
public class CuaHangRepositories {

    Session session = HibernateConfig.getFACTORY().openSession();
    private Transaction transaction = session.getTransaction();

    public List<CuaHang> getAll() {
        List<CuaHang> list = new ArrayList<>();
        Query query = session.createQuery("Select c From CuaHang c");
        list = query.getResultList();
        return list;
    }

    public List<CuaHang> search(String ten) {
        List<CuaHang> list = new ArrayList<>();
        Query query = session.createQuery("Select C From CuaHang c where c.ten like :ten");
        query.setParameter("ten", "%" + ten + "%");
        list = query.getResultList();
        return list;
    }

    public Boolean save(CuaHang ch) {
        try {
            transaction.begin();
            session.saveOrUpdate(ch);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        }
        return false;
    }

    public Boolean delete(CuaHang ch) {
        try {
            transaction.begin();
            session.delete(ch);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
            return false;
        }
    }

    public CuaHang getObjbyMa(String ma) {
        CuaHang ch = null;
        try {
            Query query = session.createQuery("Select c From CuaHang c where c.ma = :ma");
            query.setParameter("ma", ma);
            ch = (CuaHang) query.getSingleResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ch == null) {
            return null;
        } else {
            return ch;
        }
    }
}
