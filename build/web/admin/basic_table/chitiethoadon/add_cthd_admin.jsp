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
            <form class="form-add-user" method="post" action="XuLyThemCTHDAdmin">
                
                <div class="form-group">
                  <label for="exampleInputPassword1">Mã hóa đơn</label>
                  <input name="add_mahd_admin" type="text" class="form-control" id="exampleInputPassword1">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">ID sản phẩm</label>
                  <input name="add_idsp_admin" type="text" class="form-control" id="exampleInputPassword1" >
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Số lượng</label>
                  <input name="add_soluong_admin" type="text" class="form-control" id="exampleInputPassword1" >
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Giá mua</label>
                  <input name="add_giamua_admin" type="text" class="form-control" id="exampleInputPassword1" >
                </div>
                
                <button type="submit" class="btn btn-primary">Thêm</button>
            </form>
