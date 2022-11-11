package models;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;


/**
 *
 * @author AnhTiTan
 */
@Data

@Entity
@Table(name = "CuaHang")

public class CuaHang implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column
    private String ten;

    @Column
    private String diaChi;

    @Column
    private String thanhPho;

    @Column
    private String quocGia;

    @OneToMany(mappedBy = "cuaHang", fetch = FetchType.LAZY)
    List<NhanVien> listNhanVien;

    @Override
    public String toString() {
        return ten;
    }
}
