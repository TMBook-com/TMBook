<%-- 
    Document   : add_user_addmin
    Created on : Aug 9, 2020, 8:16:23 PM
    Author     : Admin
--%>

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
            <form class="form-add-user" method="post" action="XuLyThemSanPhamAdmin">
                <div class="form-group">
                  <label for="exampleInputPassword1">Mã sản phẩm</label>
                  <input name="add_masp_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Mã sản phẩm">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Tên sản phẩm</label>
                  <input name="add_tensp_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Tên sản phẩm">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Giá sản phẩm</label>
                  <input name="add_giasp_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Giá sản phẩm">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Mã nhóm</label>
                  <input name="add_manhom_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Mã nhóm">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Hình ảnh</label>
                  <input name="add_hinhanh_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Hình Ảnh">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Tóm tắt</label>
                  <input name="add_tomtat_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Tóm tắt">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Nội dung</label>
                  <input name="add_noidung_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Nội dung">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Trạng thái</label>
                  <input name="add_trangthai_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Trạnh thái">
                </div>
<!--                <div class="form-group form-check">
                  <input type="checkbox" class="form-check-input" id="exampleCheck1">
                  <label class="form-check-label" for="exampleCheck1">Check me out</label>
                </div>-->
                <button type="submit" class="btn btn-primary">Thêm</button>
            </form>
