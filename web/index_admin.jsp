<%-- 
    Document   : ADMIN
    Created on : Aug 2, 2020, 8:16:19 AM
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
    <script src="https://kit.fontawesome.com/5d0fd6aaa8.js" crossorigin="anonymous"></script>
    <title>Document</title>
</head>
<body>
    <%@include file="admin/left_container_admin.jsp" %>
    
    <div id="right-container">
        <div id ="right-container-header">
            <div class="search-box-admin flex-item-action">
                <input type="text" class="search-input" placeholder="Search" >
                <i class="fas fa-search search-icon"></i>
            </div>
            <div class="login-admin-logo flex-item-action">
                <div class="img-admin-box ">
                    <img class="img-admin" src="./img/anh1.jpg">
                </div>
                <%
                    String name = (String) session.getAttribute("taikhoan2");
                    %>
                <div class="name-admin-box" >
                    <a href="#"><%=name%></a>
                </div>
                <div class="log-out-admin">
                    <a href="#">Đăng xuất</a>
                </div>
                
            </div>

        </div>
        <div id="right-container-body">
           <%
               String module="";
               if(request.getParameter("module")!=null)
                module = request.getParameter("module");
            //Nguoidung    
               if(module.equalsIgnoreCase("p_basic_table")){
             %>
                    <jsp:include page="admin/basic_table/basic_table_admin.jsp"/>
                    
            <%
               }else if(module.equalsIgnoreCase("p_dashboard")){
           %>
                    <jsp:include page="admin/Dashboard/dashboard.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_add_user_admin")){
           %>
                    <jsp:include page="admin/basic_table/nguoidung/add_user_addmin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_fix_user_admin")){
           %>
                    <jsp:include page="admin/basic_table/nguoidung/fix_user_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_nguoi_dung")){
               
           %>
                    <jsp:include page="admin/basic_table/nguoidung/nguoidung.jsp"/>
           <%
               //Danh mục
               }else if(module.equalsIgnoreCase("p_add_list_admin")){
           %>
                    <jsp:include page="admin/basic_table/danhmuc/add_list_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_fix_list_admin")){
           %>
                     <jsp:include page="admin/basic_table/danhmuc/fix_list_admin.jsp"/>
           <%   
               }else if(module.equalsIgnoreCase("p_danh_muc")){

           %>
                    <jsp:include page="admin/basic_table/danhmuc/danhmuc.jsp"/>
           <%
               }
               //Hoa don
               else if(module.equalsIgnoreCase("p_add_bill_admin")){
           %>
                    <jsp:include page="admin/basic_table/hoadon/add_bill_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_fix_bill_admin")){
           %>
                    <jsp:include page="admin/basic_table/hoadon/fix_bill_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_hoa_don")){

           %>
                    <jsp:include page="admin/basic_table/hoadon/hoadon.jsp"/>
           <%
               }
               //Chi tiết hóa đơn
               else if(module.equalsIgnoreCase("p_add_cthd_admin")){
           %>
                    <jsp:include page="admin/basic_table/chitiethoadon/add_cthd_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_fix_cthd_admin")){
           %>
                    <jsp:include page="admin/basic_table/chitiethoadon/fix_cthd_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_cthd")){

           %>
                    <jsp:include page="admin/basic_table/chitiethoadon/chitiethoadon.jsp"/>
           <%
               }
               //Quan tri
                else if(module.equalsIgnoreCase("p_add_admin")){
           %>
                    <jsp:include page="admin/basic_table/quantri/add_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_fix_admin")){
           %>
                    <jsp:include page="admin/basic_table/quantri/fix_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_admin")){

           %>
                    <jsp:include page="admin/basic_table/quantri/quantri.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_add_product_admin")){
           %>
                    <jsp:include page="admin/basic_table/sanpham/add_product_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_fix_product_admin")){
           %>
                    <jsp:include page="admin/basic_table/sanpham/fix_product_admin.jsp"/>
           <%
               }else if(module.equalsIgnoreCase("p_product")){

           %>
                    <jsp:include page="admin/basic_table/sanpham/sanpham.jsp"/>
           <%
               }
           %>
           
        </div>


    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
</body>
</html>

