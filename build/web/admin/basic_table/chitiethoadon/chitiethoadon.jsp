<%-- 
    Document   : chitiethoadon
    Created on : Aug 11, 2020, 9:10:32 AM
    Author     : Admin
--%>

<%@page import="Models.clsChitietHoadon"%>
<%@page import="CSDL.tbChitietHoadon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : nguoidung
    Created on : Aug 2, 2020, 8:17:41 AM
    Author     : Admin
--%>

<%@page import="CSDL.tbNguoiDung"%>
<%@page import="java.util.Vector"%>
<%@page import="Models.clsNguoiDung"%>
<div>
                <%
                    String thongbao =(String) request.getAttribute("thongbao");
                    if(thongbao==null||thongbao==""){
                        
                    }else{
                    %>
                    <h3><%=thongbao%></h3>
                    <%
                    }
                %>
            </div>
            <a href="index_admin.jsp?module=p_add_cthd_admin">
                <button type="button" class="btn btn-primary btn-lg">Thêm chi tiết hóa đơn</button>
            </a>
            
            
            <table class="table">
                <thead>
                  <tr>
                    <th scope="col">Mã chi tiết hóa đơn</th>
                    <th scope="col">Mã hóa đơn</th>
                    <th scope="col">Mã sản phẩm</th>
                    <th scope="col">Số lượng</th>
                    <th scope="col">Giá mua</th>
                    <th scope="col">Tác vụ </th>
                  </tr>
                </thead>
                <tbody>
                <%
                    Vector<clsChitietHoadon> ds_cthd = new Vector<clsChitietHoadon>();
                    int ketqua = tbChitietHoadon.LayDSCTHD(ds_cthd);
                    for(clsChitietHoadon cthd : ds_cthd){
                %>
                  <tr>
                    <th scope="row"><%=cthd.getId()%></th>
                    <td><%=cthd.getMahd()%></td>
                    <td><%=cthd.getIdsp()%></td>
                    <td><%=cthd.getSoluong()%></td>
                    <td><%=cthd.getGiamua()%></td>
                    
                    <td>
                        <a href="index_admin.jsp?id=<%=cthd.getId()%>&module=p_fix_cthd_admin">Sửa</a>
                        -
                        <a href="XuLyXoaCTHDAdmin?id=<%=cthd.getId()%>" onclick="return confirm('Chắc chắn xóa?');">Xóa</a>
                    </td>
                  </tr>
                  <%
                      }
                  %>
                </tbody>
              </table>

