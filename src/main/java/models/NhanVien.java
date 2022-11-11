package models;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author AnhTiTan
 */
@Data

@Entity
@Table(name = "NhanVien")

public class NhanVien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    
    @Column(name = "ma")
    private String ma;
    
    @Column
    private String ten;
    
    @Column
    private String tenDem;
    
    @Column
    private String ho;
    
    @Column
    private String gioiTinh;
    
    @Column
    private Date ngaySinh;
    
    @Column
    private String diaChi;
    
    @Column
    private String sdt;
    
    @Column
    private String matKhau;
    
    @ManyToOne
    @JoinColumn(name = "idCH")
    private CuaHang cuaHang;
    
    @ManyToOne
    @JoinColumn(name = "idCV")
    private ChucVu chucVu;

    @Column
    private int trangThai;
}
