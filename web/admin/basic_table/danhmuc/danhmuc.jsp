

<%@page import="CSDL.tbCategory"%>
<%@page import="Models.clsCategory"%>
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
<a href="index_admin.jsp?module=p_add_list_admin">
    <button type="button" class="btn btn-primary btn-lg">Thêm danh mục</button>
</a>
<table class="table">
    <thead>
      <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Phân cấp</th>
        
        <th scope="col">Tác vụ </th>
      </tr>
    </thead>
    <tbody>
    <%
        Vector<clsCategory> dsdm = new Vector<clsCategory>();
        int ketqua = tbCategory.LayDSDanhMuc(dsdm);
        for(clsCategory dm : dsdm){
    %>
      <tr>
        <th scope="row"><%=dm.getId()%></th>
        <td><%=dm.getName()%></td>
        <td><%=dm.getPid()%></td>

        <td>
            <a href="index_admin.jsp?id=<%=dm.getId()%>&module=p_fix_list_admin">Sửa</a>
            -
            <a href="XuLyXoaDanhMucAdmin?id=<%=dm.getId()%>" onclick="return confirm('Chắc chắn xóa?');">Xóa</a>
        </td>
      </tr>
      <%
          }
      %>
    </tbody>
</table>
