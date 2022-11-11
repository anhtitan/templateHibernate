/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import java.util.List;
import models.NhanVien;

/**
 *
 * @author AnhTiTan
 */
public interface INhanVienService {

    public List<NhanVien> getAll();

    public Boolean save(NhanVien nv);

    public Boolean delete(NhanVien nv);

    public List<NhanVien> search(String ten);

    public NhanVien getObjbyMa(String ma);

}
