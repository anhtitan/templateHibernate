package repositories;

import hibernateConfig.HibernateConfig;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import models.ChucVu;
import models.NhanVien;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author AnhTiTan
 */
public class ChucVuRepositories {

    Session session = HibernateConfig.getFACTORY().openSession();
    private Transaction transaction = session.getTransaction();

    public List<ChucVu> getAll() {
        List<ChucVu> list = new ArrayList();
        Query query = session.createQuery("SELECT c From ChucVu c ");
        list = query.getResultList();
        return list;
//return session.createCriteria(NhanVien.class).list();

    }

    public Boolean save(ChucVu cv) {
        try {
            transaction.begin();
            session.saveOrUpdate(cv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }

    public Boolean delete(ChucVu cv) {
        try {
            transaction.begin();
            session.delete(cv);
            transaction.commit();
            return true;
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
    }

    public ChucVu getObjbyMa(String ma) {
        ChucVu cv = null;
        try {
            Query query = session.createQuery("select c From ChucVu c where c.ma = :ma");
            query.setParameter("ma", ma);
            cv = (ChucVu) query.getSingleResult();

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (cv == null) {
            return null;
        } else {
            return cv;
        }
    }

    public List<ChucVu> search(String ten) {
        List<ChucVu> list = new ArrayList<>();
        Query query = session.createQuery("Select c From ChucVu c where c.ten Like :ten ");
        query.setParameter("ten", "%" + ten + "%");
        list = query.getResultList();
        return list;
    }
    public static void main(String[] args) {
        ChucVuRepositories cvr = new ChucVuRepositories();
        for (ChucVu x : cvr.getAll()) {
            System.out.println(x);
        }
    }
}
