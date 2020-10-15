<%-- 
    Document   : fix_user_admin
    Created on : Aug 9, 2020, 9:15:21 PM
    Author     : Admin
--%>

<%@page import="CSDL.tbChitietHoadon"%>
<%@page import="Models.clsChitietHoadon"%>
<%@page import="Models.clsNguoiDung"%>
<%@page import="CSDL.tbNguoiDung"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   
    if(request.getParameter("id")==null)
        out.println("chưa có id");
    else if(Controllers.MyClass.isInt(request.getParameter("id"))==false)
        out.println("Id phải là số");
    else{
        int id = Integer.parseInt(request.getParameter("id"));
        clsChitietHoadon cthd = new clsChitietHoadon();
        int ketqua = tbChitietHoadon.LayChiTietHoaDon(id, cthd);
        if(ketqua<=0)
            out.println("Lỗi"+ketqua);
        else{             
%>
<form class="form-add-user" method="post" action="XuLySuaCTHDAdmin">
    <input type="hidden" name="id" value="<%=cthd.getId()%>" />
    
    <div class="form-group">
      <label for="exampleInputPassword1">Mã hóa đơn </label>
      <input name="fix_mahd_admin" value="<%=cthd.getMahd()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">ID sản phẩm</label>
      <input name="fix_idsp_admin" value="<%=cthd.getIdsp()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Name">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Số lượng</label>
      <input name="fix_soluong_admin" value="<%=cthd.getSoluong()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Level">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Giá mua</label>
        <input name="fix_giamua_admin" value="<%=cthd.getGiamua()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Level">
      </div>
<!--                <div class="form-group form-check">
      <input type="checkbox" class="form-check-input" id="exampleCheck1">
      <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>-->
    <button type="submit" class="btn btn-primary">Sửa</button>
</form>
    <%
        }
}
    %>