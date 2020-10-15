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
public class clsSanpham {
    int id;
    String masp;
    String tensp;
    int giasp;
    int manhom;
    String hinhanh;
    String tomtat;
    String noidung;
    int trangthai;
    
    public clsSanpham() {
        id=0;
    }

    public clsSanpham(int id, String masp, String tensp, int giasp, int manhom, String hinhanh, String tomtat, String noidung, int trangthai) {
        this.id = id;
        this.masp = masp;
        this.tensp = tensp;
        this.giasp = giasp;
        this.manhom = manhom;
        this.hinhanh = hinhanh;
        this.tomtat = tomtat;
        this.noidung = noidung;
        this.trangthai = trangthai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGiasp() {
        return giasp;
    }

    public void setGiasp(int giasp) {
        this.giasp = giasp;
    }

    public int getManhom() {
        return manhom;
    }

    public void setManhom(int manhom) {
        this.manhom = manhom;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTomtat() {
        return tomtat;
    }

    public void setTomtat(String tomtat) {
        this.tomtat = tomtat;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    
    
}
