<%-- 
    Document   : hoadon
    Created on : Aug 11, 2020, 9:17:52 AM
    Author     : Admin
--%>

<%@page import="CSDL.tbSanpham"%>
<%@page import="Models.clsSanpham"%>
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
<a href="index_admin.jsp?module=p_add_product_admin">
    <button type="button" class="btn btn-primary btn-lg">Thêm sản phẩm</button>
</a>
<table class="table">
    <thead>
      <tr>
        <th scope="col">ID</th>  
        <th scope="col">Mã sản phẩm</th>
        <th scope="col">Tên sản phẩm</th>
        <th scope="col">Giá sản phẩm</th>
        <th scope="col">Mã nhóm</th>
        <th scope="col">Hình ảnh</th>
        <th scope="col">Tóm tắt</th>
        <th scope="col">Nội dung</th>
        <th scope="col">Trạng thái</th>
        <th scope="col">Tác vụ </th>
      </tr>
    </thead>
    <tbody>
    <%
        Vector<clsSanpham> dssp = new Vector<clsSanpham>();
        int ketqua = tbSanpham.LayDSSanPham(dssp);
        for(clsSanpham sp : dssp){
    %>
      <tr>
        <th scope="row"><%=sp.getId()%></th>
        <td><%=sp.getMasp()%></td>
        <td><%=sp.getTensp()%></td>
        <td><%=sp.getGiasp()%></td>
        <td><%=sp.getManhom()%></td>
        <td><%=sp.getHinhanh()%></td>
        <td><%=sp.getTomtat()%></td>
        <td><%=sp.getNoidung()%></td>
        <td><%=sp.getTrangthai()%></td>
        <td>
            <a href="index_admin.jsp?id=<%=sp.getId()%>&module=p_fix_product_admin">Sửa</a>
            -
            <a href="XuLyXoaSanPhamAdmin?id=<%=sp.getId()%>" onclick="return confirm('Chắc chắn xóa?');">Xóa</a>
        </td>
      </tr>
      <%
          }
      %>
    </tbody>
  </table>

