<%-- 
    Document   : add_user_addmin
    Created on : Aug 9, 2020, 8:16:23 PM
    Author     : Admin
--%>

<%@page import="Models.clsSanpham"%>
<%@page import="CSDL.tbSanpham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div>
              <%
   
    if(request.getParameter("id")==null)
        out.println("chưa có id");
    else if(Controllers.MyClass.isInt(request.getParameter("id"))==false)
        out.println("Id phải là số");
    else{
        int id = Integer.parseInt(request.getParameter("id"));
        clsSanpham sp = new clsSanpham();
        int ketqua = tbSanpham.LaySanPham(id, sp);
        if(ketqua<=0)
            out.println("Lỗi"+ketqua);
        else{ 
            
%>
            </div>
            <form class="form-add-user" method="post" action="XuLySưaSanPhamAdmin">
                <input type="hidden" value="<%=sp.getId()%>" /> 
                <div class="form-group">
                  <label for="exampleInputPassword1">Mã sản phẩm</label>
                  <input name="fix_masp_admin" value="<%=sp.getMasp()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Mã sản phẩm">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Tên sản phẩm</label>
                  <input name="fix_tensp_admin" value="<%=sp.getTensp()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Tên sản phẩm">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Giá sản phẩm</label>
                  <input name="fix_giasp_admin" value="<%=sp.getGiasp()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Giá sản phẩm">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Mã nhóm</label>
                  <input name="fix_manhom_admin" value="<%=sp.getManhom()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Mã nhóm">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Hình ảnh</label>
                  <input name="fix_hinhanh_admin" value="<%=sp.getHinhanh()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Hình Ảnh">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Tóm tắt</label>
                  <input name="fix_tomtat_admin" value="<%=sp.getTomtat()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Tóm tắt">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Nội dung</label>
                  <input name="fix_noidung_admin" value="<%=sp.getNoidung()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Nội dung">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Trạng thái</label>
                  <input name="fix_trangthai_admin" value="<%=sp.getTrangthai()%>" type="text" class="form-control" id="exampleInputPassword1" placeholder="Trạnh thái">
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