<%-- 
    Document   : fix_user_admin
    Created on : Aug 9, 2020, 9:15:21 PM
    Author     : Admin
--%>

<%@page import="CSDL.tbCategory"%>
<%@page import="Models.clsCategory"%>
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
        //clsNguoiDung user = new clsNguoiDung();
        clsCategory dm = new clsCategory();
        int ketqua = tbCategory.LayDanhMuc(id, dm);
        if(ketqua<=0)
            out.println("Lỗi"+ketqua);
        else{ 
            
%>
<form class="form-add-user" method="post" action="XuLySuaDanhMucAdmin">
    <input type="hidden" name="id" value="<%=dm.getId()%>" />
    <div class="form-group">
        <label for="exampleInputPassword1">Name</label>
        <input name="fix_name_admin" value="<%=dm.getName()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Name">
      </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Phân cấp</label>
        <input name="fix_pid_admin" value="<%=dm.getPid()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Phân cấp">
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