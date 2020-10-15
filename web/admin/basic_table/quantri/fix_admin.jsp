<%-- 
    Document   : fix_user_admin
    Created on : Aug 9, 2020, 9:15:21 PM
    Author     : Admin
--%>

<%@page import="CSDL.tnQuanTri"%>
<%@page import="Models.clsQuanTri"%>
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
        clsQuanTri admin = new clsQuanTri();
        int ketqua = tnQuanTri.LayAdmin(id, admin);
        if(ketqua<=0)
            out.println("Lỗi"+ketqua);
        else{ 
            
%>
<form class="form-add-user" method="post" action="XuLySuaAdmin">
    <input type="hidden" name="id" value="<%=admin.getId()%>" />
    <div class="form-group">
      <label for="exampleInputPassword1">Tài khoản</label>
      <input name="fix_taikhoan_admin" value="<%=admin.getTaikhoan()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Email">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Mật khẩu</label>
      <input name="fix_matkhau_admin" value="<%=admin.getMatkhau()%>" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Loại</label>
      <input name="fix_loai_admin" value="<%=admin.getLoai()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Name">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Trạng thái</label>
      <input name="fix_trangthai_admin" value="<%=admin.getTrangthai()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Level">
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