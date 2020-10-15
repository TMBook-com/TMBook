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
            <form class="form-add-user" method="post" action="XuLyThemHoaDonAdmin">
                
                <div class="form-group">
                  <label for="exampleInputPassword1">Tên người mua</label>
                  <input name="add_name_customer_admin" type="text" class="form-control" id="exampleInputPassword1">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Điện thoại</label>
                  <input name="add_phone_admin" type="text" class="form-control" id="exampleInputPassword1" >
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Ngày đặt</label>
                  <input name="add_put_day_admin" type="text" class="form-control" id="exampleInputPassword1" >
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Ngày nhận</label>
                  <input name="add_receive_day_admin" type="text" class="form-control" id="exampleInputPassword1" >
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Trạng thái</label>
                  <input name="add_status_admin" type="text" class="form-control" id="exampleInputPassword1" >
                </div>
                <button type="submit" class="btn btn-primary">Thêm</button>
            </form>
