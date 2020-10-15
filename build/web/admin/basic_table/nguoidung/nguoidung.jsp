<%-- 
    Document   : nguoidung
    Created on : Aug 2, 2020, 8:17:41 AM
    Author     : Admin
--%>

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
            <a href="index_admin.jsp?module=p_add_user_admin">
                <button type="button" class="btn btn-primary btn-lg">Thêm nhân viên</button>
            </a>
            
            
            <table class="table">
                <thead>
                  <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Email</th>
                    <th scope="col">Password</th>
                    <th scope="col">Name</th>
                    <th scope="col">Level</th>
                    <th scope="col">Tác vụ </th>
                  </tr>
                </thead>
                <tbody>
                <%
                    Vector<clsNguoiDung> ds = new Vector<clsNguoiDung>();
                    int ketqua = tbNguoiDung.LayDSNguoiDung(ds);
                    for(clsNguoiDung user : ds){
                %>
                  <tr>
                    <th scope="row"><%=user.getId()%></th>
                    <td><%=user.getEmail()%></td>
                    <td><%=user.getPassword()%></td>
                    <td><%=user.getName()%></td>
                    <td><%=user.getLevel()%></td>
                    <td>
                        <a href="index_admin.jsp?id=<%=user.getId()%>&module=p_fix_user_admin">Sửa</a>
                        -
                        <a href="XuLyXoaNguoiDungAdmin?id=<%=user.getId()%>" onclick="return confirm('Chắc chắn xóa?');">Xóa</a>
                    </td>
                  </tr>
                  <%
                      }
                  %>
                </tbody>
              </table>
