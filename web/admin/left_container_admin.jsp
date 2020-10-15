<%-- 
    Document   : left_container_admin
    Created on : Aug 9, 2020, 4:38:00 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="left-container">
        <div id="logo-admin-box">
            <div class="login-mini-admin flex-item-logo">
                <img class="logo-page" src="./img/logo.png">
            </div>
            <div class="name-page-admin flex-item-logo">
                <a href="index_admin.jsp">
                     <span class="name-span">CellPhone</span>
                </a>
               
            </div>
        </div>

        <div id="action-admin-box">
            <ul class="flex-container">
                <a href="index_admin.jsp?module=p_dashboard">
                    <li class="flex-item" >
                            <i class="fas fa-qrcode"></i>
                            Dashboard
                    </li>
                </a>
                <a href="#">
                    <li class="flex-item" >
                            <i class="fas fa-id-badge"></i>
                            Profile
                    </li>
                </a>
                <a href="index_admin.jsp?module=p_basic_table">
                    <li class="flex-item" >
                            <i class="fas fa-table"></i>
                            Basic Table
                    </li>
                </a>
                <a href="#">
                    <li class="flex-item" >
                           <i class="fas fa-icons"></i>
                            Icons
                    </li>
                </a>
                <a href="#">
                    <li class="flex-item" >
                            <i class="fas fa-map-marked-alt"></i>
                            Google Map
                    </li>
                </a>
                <a href="#">
                    <li class="flex-item" >
                            <i class="fas fa-exclamation-circle"></i>
                            Error
                    </li>
                </a> 
            </ul>
        </div>

    </div>
