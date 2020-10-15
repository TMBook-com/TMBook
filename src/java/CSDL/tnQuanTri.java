/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsQuanTri;
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
 * @author Admin
 */
public class tnQuanTri {
    public static int Kiemtra(String taikhoan, String matkhau){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn == null)
            return -1;
        String sql = "SELECT * FROM tbquantri WHERE taikhoan=? AND matkhau=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1,taikhoan);
            stm.setString(2,matkhau);
            ResultSet rs = stm.executeQuery();
            if(rs.next())
                return 1;
            else
                return 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(tnQuanTri.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
                
    }
    public static int ThemAdmin(clsQuanTri admin){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;  
        }
        String sql = "Insert into tbquantri values (NULL,?,?,?,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1,admin.getTaikhoan());
            stm.setString(2, admin.getMatkhau());
            stm.setInt(3, admin.getLoai());
            stm.setInt(4, admin.getTrangthai());
            int ketqua = stm.executeUpdate();
            return ketqua;                    
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayDSAdmin(Vector<clsQuanTri> ds){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbquantri";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                clsQuanTri admin = new clsQuanTri();
                admin.setId(rs.getInt("id"));
                admin.setTaikhoan(rs.getString("taikhoan"));
                admin.setMatkhau(rs.getString("matkhau"));
                admin.setLoai(rs.getInt("loai"));
                admin.setTrangthai(rs.getInt("trangthai"));
                ds.add(admin);
            }
            return ds.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayAdmin(int id, clsQuanTri admin){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Select * from tbquantri WHERE id = ?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                admin.setId(rs.getInt("id"));
                admin.setTaikhoan(rs.getString("taikhoan"));
                admin.setMatkhau(rs.getString("matkhau"));
                admin.setLoai(rs.getInt("loai"));
                admin.setTrangthai(rs.getInt("trangthai"));
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }  
    }
    public static int FixAdmin(clsQuanTri admin){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Update tbquantri SET taikhoan = ?, matkhau = ?, loai = ? , trangthai = ? WHERE id =?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, admin.getTaikhoan());
            stm.setString(2, admin.getMatkhau());
            stm.setInt(3, admin.getLoai());
            stm.setInt(4, admin.getTrangthai());
            stm.setInt(5, admin.getId());
            int rs = stm.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
                
    }
    public static int DeleteAdmin(int id){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Delete from tbquantri where id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            int ketqua = stm.executeUpdate();
            return ketqua;
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
}
