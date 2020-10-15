<%-- 
    Document   : fix_user_admin
    Created on : Aug 9, 2020, 9:15:21 PM
    Author     : Admin
--%>

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
        clsNguoiDung user = new clsNguoiDung();
        int ketqua = tbNguoiDung.LayNguoiDung(id, user);
        if(ketqua<=0)
            out.println("Lỗi"+ketqua);
        else{ 
            
%>
<form class="form-add-user" method="post" action="XuLySuaNguoiDungAdmin">
    <input type="hidden" name="id" value="<%=user.getId()%>" />
    <div class="form-group">
      <label for="exampleInputPassword1">Email</label>
      <input name="fix_email_admin" value="<%=user.getEmail()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Email">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Password</label>
      <input name="fix_pass_admin" value="<%=user.getPassword()%>" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Name</label>
      <input name="fix_name_admin" value="<%=user.getName()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Name">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Level</label>
      <input name="fix_level_admin" value="<%=user.getLevel()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Level">
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