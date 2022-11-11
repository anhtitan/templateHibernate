package repositories;

import hibernateConfig.HibernateConfig;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import models.NhanVien;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AnhTiTan
 */
public class NhanVienRepositories {

    Session session = HibernateConfig.getFACTORY().openSession();
    private Transaction transaction = session.getTransaction();

    public List<NhanVien> getAll() {
        List<NhanVien> list = new ArrayList<>();
        Query query = session.createQuery("SELECT c FROM NhanVien c");
        list = query.getResultList();
        return list;
//        return session.createCriteria(NhanVien.class).list();
    }

    public Boolean save(NhanVien nv) {
        try {
            transaction.begin();
            session.saveOrUpdate(nv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
    }

    public Boolean delete(NhanVien nv) {
        try {
            transaction.begin();
            session.delete(nv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
    }

    public List<NhanVien> search(String ten) {
        List<NhanVien> list = new ArrayList<>();
        Query query = session.createQuery("Select c From NhanVien c where c.ten like :ten");
        query.setParameter("ten", "%" + ten + "%");
        list = query.getResultList();
        return list;
    }

    public NhanVien getObjbyMa(String ma) {
        NhanVien nv = null;
        try {
            Query query = session.createQuery("Select c From NhanVien c where c.ma = :ma");
            query.setParameter("ma", ma);
            nv = (NhanVien) query.getSingleResult();
        } catch (Exception e) {
//            e.printStackTrace();
        }
        if (nv == null) {
            return null;
        } else {
            return nv;
        }
    }

    public static void main(String[] args) {
        NhanVienRepositories nhanVienRepositories = new NhanVienRepositories();
        for (NhanVien x : nhanVienRepositories.getAll()) {
            System.out.println(x.toString());
            //   nhanVienRepositories.search("f");
        }

    }
}
