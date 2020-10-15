    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsHoaDon;
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
 * @author Tran Manh Truong
 */
public class tbHoaDon {
    public static int ThemHoadon(clsHoaDon hd)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;//lỗi kết nối CSDL
        }
        String sql = "INSERT INTO tbHoadon(tennguoimua,dienthoai,ngaynhan) VALUES(?,?,?)";
        try {
            PreparedStatement smt = cnn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            smt.setString(1, hd.getTennguoimua());
            smt.setString(2, hd.getDienthoai());
            smt.setString(3,hd.getNgaynhan());
            int ketqua = smt.executeUpdate();//trả lại số nguyên là số bản ghi được thêm/sửa/xóa
            if(ketqua<=0)
                return 0;
            else{
                ResultSet rs = smt.getGeneratedKeys();
                int last_id = 0;
                if(rs.next())
                    last_id = rs.getInt(1);
                return last_id;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;//Lỗi câu lệnh SQL
        }
    }
    public static int ThemHoaDonAdmin(clsHoaDon hd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null){
            return -1;  
        }
        String sql = "Insert into tbHoadon values (NULL,?,?,?,?,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1,hd.getTennguoimua());
            stm.setString(2, hd.getDienthoai());
            stm.setString(3, hd.getNgaydat());
            stm.setString(4, hd.getNgaynhan());
            stm.setInt(5, hd.getTrangthai());
            int ketqua = stm.executeUpdate();
            return ketqua;
                    
        } catch (SQLException ex) {
            Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayDSHoaDon(Vector<clsHoaDon> dshd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbHoadon";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                clsHoaDon hd = new clsHoaDon();
                hd.setMahd(rs.getInt("mahd"));
                hd.setTennguoimua(rs.getString("tennguoimua"));
                hd.setDienthoai(rs.getString("dienthoai"));
                hd.setNgaydat(rs.getString("ngaydat"));
                hd.setNgaynhan(rs.getString("ngaynhan"));
                hd.setTrangthai(rs.getInt("trangthai"));
                dshd.add(hd);
            }
            return dshd.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
        
    public static int LayHoaDon(int id, clsHoaDon hd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Select * from tbHoadon WHERE id = ?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                hd.setMahd(rs.getInt("mahd"));
                hd.setTennguoimua(rs.getString("tennguoimua"));
                hd.setDienthoai(rs.getString("dienthoai"));
                hd.setNgaydat(rs.getString("ngaydat"));
                hd.setNgaynhan(rs.getString("ngaynhan"));
                hd.setTrangthai(rs.getInt("trangthai"));
                return 1;
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbHoaDon.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }  
    }
    public static int FixBillAdmin(clsHoaDon hd){
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "Update tbHoadon SET tennguoinhan = ?, dienthoai = ?, ngaynhan = ? , ngaydat = ?, trangthai = ? WHERE mahd=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, hd.getTennguoimua());
            stm.setString(2, hd.getDienthoai());
            stm.setString(3, hd.getNgaydat());
            stm.setString(4, hd.getNgaynhan());
            stm.setInt(5, hd.getTrangthai());
            stm.setInt(6, hd.getMahd());
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
        String sql = "Delete from tbHoadon where id=?";
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
