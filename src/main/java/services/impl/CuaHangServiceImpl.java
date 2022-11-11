package services.impl;

import java.util.List;
import models.CuaHang;
import repositories.CuaHangRepositories;
import services.ICuaHangService;

/**
 *
 * @author AnhTiTan
 */
public class CuaHangServiceImpl implements ICuaHangService {
    
    private CuaHangRepositories cuaHangRep = new CuaHangRepositories();
    
    @Override
    public List<CuaHang> getAll() {
        return cuaHangRep.getAll();
    }
    
    @Override
    public List<CuaHang> search(String ten) {
        return cuaHangRep.search(ten);
    }
    
    @Override
    public Boolean save(CuaHang ch) {
        return cuaHangRep.save(ch);
    }
    
    @Override
    public Boolean delete(CuaHang ch) {
        return cuaHangRep.delete(ch);
    }
    
    @Override
    public CuaHang getObjbyMa(String ma) {
        return cuaHangRep.getObjbyMa(ma);
    }
    
}
