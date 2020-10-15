/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsChitietHoadon;
import Models.clsHoaDon;
import static java.lang.System.out;
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
public class tbChitietHoadon {
    public static int ThemChitietHD(clsChitietHoadon cthd)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;//lỗi kết nối CSDL
        }
        String sql = "INSERT INTO tbchitiethoadon VALUES(NULL,?,?,?,?)";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql);
            smt.setInt(1, cthd.getMahd());
            smt.setInt(2, cthd.getIdsp());
            smt.setInt(3, cthd.getSoluong());
            smt.setInt(4, cthd.getGiamua());
            int ketqua = smt.executeUpdate();//trả lại số nguyên là số bản ghi được thêm/sửa/xóa
            if(ketqua<=0)
                return 0;
            else
                return 1;
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//Lỗi câu lệnh SQL
        }
    }
    
    public static int ThemCTHDAdmin(clsChitietHoadon cthd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;  
        }
        String sql = "Insert into tbchitiethoadon values (NULL,?,?,?,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1,cthd.getMahd());
            stm.setInt(2, cthd.getIdsp());
            stm.setInt(3, cthd.getSoluong());
            stm.setInt(4, cthd.getGiamua());
            int ketqua = stm.executeUpdate();
            return ketqua;
                    
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayDSCTHD(Vector<clsChitietHoadon> ds_cthd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbchitiethoadon";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                clsChitietHoadon cthd = new clsChitietHoadon();
                cthd.setId(rs.getInt("id"));
                cthd.setMahd(rs.getInt("mahd"));
                cthd.setIdsp(rs.getInt("idsp"));
                cthd.setSoluong(rs.getInt("soluong"));
                cthd.setGiamua(rs.getInt("giamua"));
                ds_cthd.add(cthd);
            }
            return ds_cthd.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayChiTietHoaDon(int id, clsChitietHoadon cthd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Select * from tbchitiethoadon WHERE id = ?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                cthd.setId(rs.getInt("id"));
                cthd.setMahd(rs.getInt("mahd"));
                cthd.setIdsp(rs.getInt("idsp"));
                cthd.setSoluong(rs.getInt("soluong"));
                cthd.setGiamua(rs.getInt("giamua"));
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }  
    }
    public static int FixCTHDAdmin(clsChitietHoadon cthd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Update tbchitiethoadon SET mahd = ?, idsp = ?, soluong = ? , giamua = ? WHERE id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, cthd.getMahd());
            stm.setInt(2, cthd.getIdsp());
            stm.setInt(3, cthd.getSoluong());
            stm.setInt(4, cthd.getGiamua());
            stm.setInt(5, cthd.getId());
            int rs = stm.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
                
    }
    public static int DeleteCTHDAdmin(int id){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Delete from tbchitiethoadon where id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            int ketqua = stm.executeUpdate();
            return ketqua;
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public static int SUM(){
        Connection cnn =  Database.KetnoiCSDL();
        if(cnn==null){
            return -1;
        }
        String sql = "Select * FROM tbchitiethoadon";
        try {
            Statement stm = cnn.createStatement();            
            ResultSet rs = stm.executeQuery(sql);
            int count = 0;
            
            while(rs.next()){              
                count++;
            }
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public static int SUM2(){
        Connection cnn =  Database.KetnoiCSDL();
        if(cnn==null){
            return -1;
        }
        String sql = "Select COUNT(*) AS 'Tong' FROM tbchitiethoadon";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            int count=0;
            if(rs.next()){
                count = rs.getInt("Tong");
            }
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public static int SUM_BUY(){
        Connection cnn =  Database.KetnoiCSDL();
        if(cnn==null){
            return -1;
        }
        String sql = "Select SUM(soluong) AS 'Tong' FROM tbchitiethoadon";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            int count=0;
            if(rs.next()){
                count = rs.getInt("Tong");
            }
            return count;
        } catch (SQLException ex) {
            Logger.getLogger(tbChitietHoadon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
            
        
}
        