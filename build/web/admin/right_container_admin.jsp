<%-- 
    Document   : right_container_admin
    Created on : Aug 9, 2020, 4:39:33 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="right-container">
        <div id ="right-container-header">
            
            <div class="login-admin-logo">
                <div class="img-admin-box">
                    <img class="img-admin" src="./img/anh1.jpg">
                </div>
                <%
                        String name = (String)session.getAttribute("taikhoan2");
                    %>
                <div class="name-admin-box">
                    <%=name%>
                </div>
                <div class="name-admin-box">
                    Đăng xuất
                </div>
            </div>
            <div class="search-box-admin">
                    <input type="text" class="search-input" placeholder="Search" >
                    <i class="fas fa-search search-icon"></i>
            </div>
        </div>
        <div id="right-container-body">
            <ul class="flex-list-table">
                <li class="flex-item-tb"><a href="#">Danh mục</a></li>
                <li class="flex-item-tb"><a href="#">Chi tiết hóa đơn</a></li>
                <li class="flex-item-tb"><a href="#">Hóa đơn</a></li>
                <li class="flex-item-tb"><a href="nguoidung.jsp">Người dùng</a></li>
                <li class="flex-item-tb"><a href="#">Quản trị</a></li>
                <li class="flex-item-tb"><a href="#">Sản phẩm</a></li>
                <li class="flex-item-tb"><a href="#">Tin tức</a></li>
            </ul>
        </div>
    </div>
