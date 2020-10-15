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
            <form class="form-add-user" method="post" action="XuLyThemDanhMucAdmin">
                <div class="form-group">
                  <label for="exampleInputPassword1">Name</label>
                  <input name="add_name_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Name">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Phân cấp</label>
                  <input name="add_pid_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Phân cấp">
                </div>
                
<!--                <div class="form-group form-check">
                  <input type="checkbox" class="form-check-input" id="exampleCheck1">
                  <label class="form-check-label" for="exampleCheck1">Check me out</label>
                </div>-->
                <button type="submit" class="btn btn-primary">Thêm</button>
            </form>
