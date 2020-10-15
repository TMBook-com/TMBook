/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Tran Manh Truong
 */
public class clsHoaDon {
    int mahd;
    String tennguoimua;
    String dienthoai;
    String ngaydat;
    String ngaynhan;
    int trangthai;

    public clsHoaDon() {
    }

    public clsHoaDon(int mahd, String tennguoimua, String dienthoai, String ngaydat, String ngaynhan, int trangthai) {
        this.mahd = mahd;
        this.tennguoimua = tennguoimua;
        this.dienthoai = dienthoai;
        this.ngaydat = ngaydat;
        this.ngaynhan = ngaynhan;
        this.trangthai = trangthai;
    }

    public int getMahd() {
        return mahd;
    }

    public void setMahd(int mahd) {
        this.mahd = mahd;
    }

    public String getTennguoimua() {
        return tennguoimua;
    }

    public void setTennguoimua(String tennguoimua) {
        this.tennguoimua = tennguoimua;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getNgaydat() {
        return ngaydat;
    }

    public void setNgaydat(String ngaydat) {
        this.ngaydat = ngaydat;
    }

    public String getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(String ngaynhan) {
        this.ngaynhan = ngaynhan;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    
}
