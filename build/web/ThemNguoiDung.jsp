<%-- 
    Document   : ThemNguoiDung
    Created on : Aug 6, 2020, 6:30:18 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="css/admin.css"/>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous"> 
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/css/bootstrap.min.css" integrity="sha384-VCmXjywReHh4PwowAiWNagnWcLhlEJLA5buUprzK8rxFgeH0kww/aWY76TfkUoSX" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.1/js/bootstrap.min.js" integrity="sha384-XEerZL0cuoUbHE4nZReLT7nx9gQrQreJekYhJD9WNWhH8nEW+0c5qq7aIo2Wl30J" crossorigin="anonymous"></script>
    
    <title>Document</title>
</head>
<body>
    <div id="left-container">
        <div id="logo-admin-box">
            <a href="index_admin.jsp">
                <div class="login-mini-admin flex-item-logo">
                <img class="logo-page" src="./img/logo.png">
                </div>
                <div class="name-page-admin flex-item-logo"><span class="name-span">CellPhone</span></div>
            </a>   
        </div>

        <div id="action-admin-box">
            <ul class="flex-container">
                <li class="flex-item"><a href="#">Dashboard</a></li>
                <li class="flex-item"><a href="#">Profie</a></li>
                <li class="flex-item"><a href="index_admin.jsp">Basic Table</a></li>
                <li class="flex-item"><a href="#">Icons</a></li>
                <li class="flex-item"><a href="#">Google Map</a></li>
                <li class="flex-item"><a href="#">Error 404</a></li>
            </ul>
        </div>

    </div>
    <div id="right-container">
        <div id ="right-container-header">
            
            <div class="login-admin-logo">
                <div class="img-admin-box">
                    <img class="img-admin" src="./img/anh1.jpg">
                </div>
                <div class="name-admin-box">
                    Admin
                </div>
                
            </div>
            <div class="search-box-admin">
                    <input type="text" class="search-input" placeholder="Search" >
                    <i class="fas fa-search search-icon"></i>
            </div>
        </div>
        <div id="right-container-body">
            
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
            <form class="form-add-user" method="post" action="XuLyThemNguoiDungAdmin">
                <div class="form-group">
                  <label for="exampleInputPassword1">Email</label>
                  <input name="add_email_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Email">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Password</label>
                  <input name="add_pass_admin" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Name</label>
                  <input name="add_name_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Name">
                </div>
                <div class="form-group">
                  <label for="exampleInputPassword1">Level</label>
                  <input name="add_level_admin" type="text" class="form-control" id="exampleInputPassword1" placeholder="Level">
                </div>
<!--                <div class="form-group form-check">
                  <input type="checkbox" class="form-check-input" id="exampleCheck1">
                  <label class="form-check-label" for="exampleCheck1">Check me out</label>
                </div>-->
                <button type="submit" class="btn btn-primary">Thêm</button>
            </form>
        </div>


    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
</body>
</html>
