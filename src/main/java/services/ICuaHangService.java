/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.List;
import models.CuaHang;

/**
 *
 * @author AnhTiTan
 */
public interface ICuaHangService {

    public List<CuaHang> getAll();

    public List<CuaHang> search(String ten);

    public Boolean save(CuaHang ch);

    public Boolean delete(CuaHang ch);

    public CuaHang getObjbyMa(String ma);
}
