package services.impl;

import java.util.List;
import models.NhanVien;
import repositories.NhanVienRepositories;
import services.INhanVienService;

/**
 *
 * @author AnhTiTan
 */
public class NhanVienServiceImpl implements INhanVienService {

    private NhanVienRepositories nhanVienRep = new NhanVienRepositories();

    @Override
    public List<NhanVien> getAll() {
        return nhanVienRep.getAll();
    }

    @Override
    public Boolean save(NhanVien nv) {
        return nhanVienRep.save(nv);
    }

    @Override
    public Boolean delete(NhanVien nv) {
        return nhanVienRep.delete(nv);
    }

    @Override
    public List<NhanVien> search(String ten) {
        return nhanVienRep.search(ten);
    }

    @Override
    public NhanVien getObjbyMa(String ma) {
        return nhanVienRep.getObjbyMa(ma);
    }

}
