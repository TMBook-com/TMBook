    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsCategory;
//import Models.clsNguoiDung;
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
public class tbCategory {

    private static String sql;
    public static int Cate_List(int  pid, Vector<clsCategory> list)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        else//nếu kết nối CSDL thành công
        {
            String sql = "SELECT * FROM tbcategory WHERE pid=?";
            try {
                PreparedStatement stm = cnn.prepareStatement(sql);
                stm.setInt(1, pid);
                ResultSet rs = stm.executeQuery();
                while(rs.next()){//duyệt từng bản ghi kết quả select
                    clsCategory cat= new clsCategory();
                    cat.setId(rs.getInt("id"));
                    cat.setName(rs.getString("name"));
                    cat.setPid(rs.getInt("pid"));
                    list.add(cat);
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbCategory.class.getName()).log(Level.SEVERE, null, ex);
                return -2;
            }
        }
        return 1;
    }
     public static int ThemDanhMucAdmin(clsCategory dm){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;  
        }
        String sql = "Insert into tbcategory values (NULL,?,?)";
        //INSERT INTO tbcategory values (NULL,'Giày',3)
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1,dm.getName());
            stm.setInt(2, dm.getPid());
            int ketqua = stm.executeUpdate();
            return ketqua;
                      
        } catch (SQLException ex) {
            Logger.getLogger(tbCategory.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    
    public static int LayDSDanhMuc(Vector<clsCategory> dsdm){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbcategory";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                clsCategory dm = new clsCategory();
                dm.setId(rs.getInt("id"));
                dm.setName(rs.getString("name"));
                dm.setPid(rs.getInt("pid"));
                dsdm.add(dm);
            }
            return dsdm.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbCategory.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayDanhMuc(int id, clsCategory dm){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Select * from tbcategory WHERE id = ?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                dm.setId(rs.getInt("id"));
                dm.setName(rs.getString("name"));
                dm.setPid(rs.getInt("pid"));
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbCategory.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }  
    }
    public static int FixListAdmin(clsCategory dm){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Update tbcategory SET name = ?, pid = ? WHERE id =?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, dm.getName());
            stm.setInt(2, dm.getPid());
            
            stm.setInt(3, dm.getId());
            int rs = stm.executeUpdate();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(tbCategory.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
                
    }
    public static int DeleteListAdmin(int id){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Delete from tbcategory where id=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            int ketqua = stm.executeUpdate();
            return ketqua;
        } catch (SQLException ex) {
            Logger.getLogger(tbCategory.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
}
