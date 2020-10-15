/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsNhomSP;
import Models.clsSanpham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Manh Truong
 */
public class tbSanpham {
    public static int TimDSSanpham(int manhom, Vector<clsSanpham> dsSP)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        else//nếu kết nối CSDL thành công
        {
            String sql = "SELECT * FROM tbsanpham ";
            if(manhom>0)//nếu mã nhóm > 0 => bổ sung tìm sp theo mã nhóm
            {
                sql = sql + " WHERE manhom=" + manhom;
            }
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                //dslop = new Vector<clsLophoc>();
                while(rs.next()){//duyệt từng bản ghi kết quả select
                    clsSanpham sp= new clsSanpham();
                    sp.setId(rs.getInt("id"));
                    sp.setMasp(rs.getString("masp"));
                    sp.setTensp(rs.getString("tensp"));
                    sp.setGiasp(rs.getInt("giasp"));
                    sp.setManhom(rs.getInt("manhom"));
                    sp.setHinhanh(rs.getString("hinhanh"));
                    sp.setTomtat(rs.getString("tomtat"));
                    sp.setNoidung(rs.getString("noidung"));
                    sp.setTrangthai(rs.getInt("trangthai"));
                    dsSP.add(sp);
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbSanpham.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
        return dsSP.size();
    }  
    
    public static int TimSanpham(int id, clsSanpham sp)
    {
        //clsSanpham sp=new clsSanpham();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        else//nếu kết nối CSDL thành công
        {
            String sql = "SELECT * FROM tbsanpham WHERE id="+id;
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                //dslop = new Vector<clsLophoc>();
                if(rs.next()){//nếu có kết quả select
                    sp.setId(rs.getInt("id"));
                    sp.setMasp(rs.getString("masp"));
                    sp.setTensp(rs.getString("tensp"));
                    sp.setGiasp(rs.getInt("giasp"));
                    sp.setManhom(rs.getInt("manhom"));
                    sp.setHinhanh(rs.getString("hinhanh"));
                    sp.setTomtat(rs.getString("tomtat"));
                    sp.setNoidung(rs.getString("noidung"));
                    sp.setTrangthai(rs.getInt("trangthai"));
                    return 1;
                 }
                else
                    return 0;
            } catch (SQLException ex) {
                Logger.getLogger(tbSanpham.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
    }
    public static int ThemSanPhamAdmin(clsSanpham sp){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;  
        }
        String sql = "Insert into tbsanpham values (NULL,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1,sp.getMasp());
            stm.setString(2, sp.getTensp());
            stm.setInt(3, sp.getGiasp());
            stm.setInt(4, sp.getManhom());
            stm.setString(5, sp.getHinhanh());
            stm.setString(6, sp.getTomtat());
            stm.setString(7, sp.getNoidung());
            stm.setInt(8, sp.getTrangthai());
            int ketqua = stm.executeUpdate();
            return ketqua;
                    
        } catch (SQLException ex) {
            Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayDSSanPham(Vector<clsSanpham> dssp){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbsanpham";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                clsSanpham sp = new clsSanpham();
                sp.setId(rs.getInt("id"));
                sp.setMasp(rs.getString("masp"));
                sp.setTensp(rs.getString("tensp"));
                sp.setGiasp(rs.getInt("giasp"));
                sp.setManhom(rs.getInt("manhom"));
                sp.setHinhanh(rs.getString("hinhanh"));
                sp.setTomtat(rs.getString("tomtat"));
                sp.setNoidung(rs.getString("noidung"));
                sp.setTrangthai(rs.getInt("trangthai"));
                dssp.add(sp);
            }
            return dssp.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LaySanPham(int id, clsSanpham sp){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Select * from tbsanpham WHERE id = ?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                sp.setMasp(rs.getString("masp"));
                sp.setTensp(rs.getString("tensp"));
                sp.setGiasp(rs.getInt("giasp"));
                sp.setManhom(rs.getInt("manhom"));
                sp.setHinhanh(rs.getString("hinhanh"));
                sp.setTomtat(rs.getString("tomtat"));
                sp.setNoidung(rs.getString("noidung"));
                sp.setTrangthai(rs.getInt("trangthai"));
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }  
    }
    public static int FixProductAdmin(clsSanpham sp){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Update tbsanpham SET masp = ?,"
                + "tensp = ?, giasp=? , manhom = ? , hinhanh=?, tomtat = ?, noidung=?, trangthai = ? WHERE id = ?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1,sp.getMasp());
            stm.setString(2, sp.getTensp());
            stm.setInt(3, sp.getGiasp());
            stm.setInt(4, sp.getManhom());
            stm.setString(5, sp.getHinhanh());
            stm.setString(6, sp.getTomtat());
            stm.setString(7, sp.getNoidung());
            stm.setInt(8, sp.getTrangthai());
            stm.setInt(9, sp.getId());
            int rs = stm.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }            
    }
    public static int DeleteBillAdmin(int  mahd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Delete from tbsanpham where id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, mahd);
            int ketqua = stm.executeUpdate();
            return ketqua;
        } catch (SQLException ex) {
            Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
}
