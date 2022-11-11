/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.List;
import models.ChucVu;
import repositories.ChucVuRepositories;
import services.IChucVuService;

/**
 *
 * @author AnhTiTan
 */
public class ChucVuServiceImpl implements IChucVuService {

    private ChucVuRepositories chucVuRep = new ChucVuRepositories();

    @Override
    public List<ChucVu> getAll() {
        return chucVuRep.getAll();
    }

    @Override
    public Boolean save(ChucVu cv) {
        return chucVuRep.save(cv);
    }

    @Override
    public Boolean delete(ChucVu cv) {
        return chucVuRep.delete(cv);
    }

    @Override
    public ChucVu getObjbyMa(String ma) {
        return chucVuRep.getObjbyMa(ma);
    }

    @Override
    public List<ChucVu> search(String ten) {
        return chucVuRep.search(ten);
    }

}
