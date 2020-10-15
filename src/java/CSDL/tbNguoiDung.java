/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsNguoiDung;
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
public class tbNguoiDung {
    public static int Kiemtra(String e,String p){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbnguoidung WHERE email = ? AND password=?" ;
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, e);
            stm.setString(2, p);
            ResultSet rs = stm.executeQuery();
            if(rs.next())
                return 1;
            else
                return 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }    
    }
    
    
    public static int ThemNguoiDung(clsNguoiDung user){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;  
        }
        String sql = "Insert into tbnguoidung values (NULL,?,?,?,0)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1,user.getEmail());
            stm.setString(2, user.getPassword());
            stm.setString(3, user.getName());
            //stm.setInt(4, user.getLevel());
            int ketqua = stm.executeUpdate();
            return ketqua;
                    
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public static int ThemNguoiDungAdmin(clsNguoiDung user){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;  
        }
        String sql = "Insert into tbnguoidung values (NULL,?,?,?,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1,user.getEmail());
            stm.setString(2, user.getPassword());
            stm.setString(3, user.getName());
            stm.setInt(4, user.getLevel());
            int ketqua = stm.executeUpdate();
            return ketqua;
                    
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayDSNguoiDung(Vector<clsNguoiDung> ds){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbnguoidung";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                clsNguoiDung user = new clsNguoiDung();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
                user.setLevel(rs.getInt("level"));
                ds.add(user);
            }
            return ds.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayNguoiDung(int id, clsNguoiDung user){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Select * from tbnguoidung WHERE id = ?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
                user.setLevel(rs.getInt("level"));
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }  
    }
    public static int FixUserAdmin(clsNguoiDung user){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Update tbnguoidung SET email = ?, password = ?, name = ? , level = ? WHERE id =?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, user.getEmail());
            stm.setString(2, user.getPassword());
            stm.setString(3, user.getName());
            stm.setInt(4, user.getLevel());
            stm.setInt(5, user.getId());
            int rs = stm.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(tbNguoiDung.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
                
    }
    public static int DeleteUserAdmin(int id){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Delete from tbnguoidung where id=?";
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
