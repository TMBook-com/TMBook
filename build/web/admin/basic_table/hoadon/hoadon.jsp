<%-- 
    Document   : hoadon
    Created on : Aug 11, 2020, 9:17:52 AM
    Author     : Admin
--%>

<%@page import="CSDL.tbHoaDon"%>
<%@page import="java.util.Vector"%>
<%@page import="Models.clsHoaDon"%>
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
            <a href="index_admin.jsp?module=p_add_bill_admin">
                <button type="button" class="btn btn-primary btn-lg">Thêm hóa đơn</button>
            </a>
            
            
            <table class="table">
                <thead>
                  <tr>
                    <th scope="col">Mã hóa đơn</th>
                    <th scope="col">Tên người mua</th>
                    <th scope="col">Điện thoại</th>
                    <th scope="col">Ngày đặt</th>
                    <th scope="col">Ngày nhận</th>
                    <th scope="col">Trạng thái</th>
                    <th scope="col">Tác vụ </th>
                  </tr>
                </thead>
                <tbody>
                <%
                    Vector<clsHoaDon> dshd = new Vector<clsHoaDon>();
                    int ketqua = tbHoaDon.LayDSHoaDon(dshd);
                    for(clsHoaDon hd : dshd){
                %>
                  <tr>
                    <th scope="row"><%=hd.getMahd()%></th>
                    <td><%=hd.getTennguoimua()%></td>
                    <td><%=hd.getDienthoai()%></td>
                    <td><%=hd.getNgaydat()%></td>
                    <td><%=hd.getNgaynhan()%></td>
                    <td><%=hd.getTrangthai()%></td>
                    <td>
                        <a href="index_admin.jsp?id=<%=hd.getMahd()%>&module=p_fix_user_admin">Sửa</a>
                        -
                        <a href="XuLyXoaNguoiDungAdmin?id=<%=hd.getMahd()%>" onclick="return confirm('Chắc chắn xóa?');">Xóa</a>
                    </td>
                  </tr>
                  <%
                      }
                  %>
                </tbody>
              </table>

