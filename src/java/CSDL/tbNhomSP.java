/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsNhomSP;
import java.sql.Connection;
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
public class tbNhomSP {
    public static Vector<clsNhomSP> TimNhomSP(String tukhoa)
    {
        Vector<clsNhomSP> dsNhomSP=new Vector<clsNhomSP>();
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return null;
        else//nếu kết nối CSDL thành công
        {
            String sql = "SELECT * FROM tbnhomsp";
            if(!tukhoa.equals(""))//nếu từ khóa khác rỗng
            {
                sql = sql + " WHERE tenhom LIKE '%" + tukhoa + "%'";
            }
            try {
                Statement stm = cnn.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                //dslop = new Vector<clsLophoc>();
                while(rs.next()){//duyệt từng bản ghi kết quả select
                    clsNhomSP nhomsp= new clsNhomSP();
                    nhomsp.setManhom(rs.getInt("manhom"));
                    nhomsp.setTenhom(rs.getString("tennhom"));
                    nhomsp.setThutu(rs.getInt("sothutu"));
                    nhomsp.setTrangthai(rs.getBoolean("trangthai"));
                    dsNhomSP.add(nhomsp);
                }
            } catch (SQLException ex) {
                Logger.getLogger(tbNhomSP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsNhomSP;
    }  
}
