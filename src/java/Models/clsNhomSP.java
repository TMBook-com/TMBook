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
public class clsNhomSP {
    int manhom;
    String tenhom;
    int thutu;
    boolean trangthai;

    public clsNhomSP() {
    }

    public clsNhomSP(int manhom, String tenhom, int thutu, boolean trangthai) {
        this.manhom = manhom;
        this.tenhom = tenhom;
        this.thutu = thutu;
        this.trangthai = trangthai;
    }

    public int getManhom() {
        return manhom;
    }

    public void setManhom(int manhom) {
        this.manhom = manhom;
    }

    public String getTenhom() {
        return tenhom;
    }

    public void setTenhom(String tenhom) {
        this.tenhom = tenhom;
    }

    public int getThutu() {
        return thutu;
    }

    public void setThutu(int thutu) {
        this.thutu = thutu;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
}
