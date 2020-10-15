<%-- 
    Document   : nguoidung
    Created on : Aug 2, 2020, 8:17:41 AM
    Author     : Admin
--%>

<%@page import="CSDL.tnQuanTri"%>
<%@page import="Models.clsQuanTri"%>
<%@page import="CSDL.tbNguoiDung"%>
<%@page import="java.util.Vector"%>
<%@page import="Models.clsNguoiDung"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <a href="index_admin.jsp?module=p_add_admin">
                <button type="button" class="btn btn-primary btn-lg">Thêm admin</button>
            </a>
            
            
            <table class="table">
                <thead>
                  <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Tài khoản </th>
                    <th scope="col">Mật khẩu</th>
                    <th scope="col">Loại</th>
                    <th scope="col">Trạng thái</th>
                    <th scope="col">Tác vụ </th>
                  </tr>
                </thead>
                <tbody>
                <%
                    Vector<clsQuanTri> ds_admin = new Vector<clsQuanTri>();
                    int ketqua = tnQuanTri.LayDSAdmin(ds_admin);
                    for(clsQuanTri admin : ds_admin){
                %>
                  <tr>
                    <th scope="row"><%=admin.getId()%></th>
                    <td><%=admin.getTaikhoan()%></td>
                    <td><%=admin.getMatkhau()%></td>
                    <td><%=admin.getLoai()%></td>
                    <td><%=admin.getTrangthai()%></td>
                    <td>
                        <a href="index_admin.jsp?id=<%=admin.getId()%>&module=p_fix_admin">Sửa</a>
                        -
                        <a href="XuLyXoaAdmin?id=<%=admin.getId()%>" onclick="return confirm('Chắc chắn xóa?');">Xóa</a>
                    </td>
                  </tr>
                  <%
                      }
                  %>
                </tbody>
            </table>
