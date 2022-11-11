/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.ChucVu;

/**
 *
 * @author AnhTiTan
 */
public interface IChucVuService {

    public List<ChucVu> getAll();

    public Boolean save(ChucVu cv);

    public Boolean delete(ChucVu cv);

    public ChucVu getObjbyMa(String ma);

    public List<ChucVu> search(String ten);
}
