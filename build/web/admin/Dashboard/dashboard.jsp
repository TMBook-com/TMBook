<%-- 
    Document   : dashboard
    Created on : Aug 19, 2020, 8:51:06 PM
    Author     : Admin
--%>

<%@page import="CSDL.tbChitietHoadon"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="flex-dashload-admin">
                <%
                    int count=0;
                    count = tbChitietHoadon.SUM2();
                    int count_buy = tbChitietHoadon.SUM_BUY();
                    if(count <= 0){
                        out.println("Loi" + count);
                    }else{
                %>
                <li class="flex-dash-item">
                    <div class="name-count">Tổng số lượng hóa đơn</div>
                    <div class="value-bill"><%=count%></div>
                </li>
                <li class="flex-dash-item">
                    <div class="name-count">Tổng số lượng sản phẩm</div>
                    <div class="value-bill"><%=count_buy%></div>
                </li>
                <li class="flex-dash-item">
                    <div class="name-count">Tổng doanh thu trong năm 2020</div>
                    <div class="value-chat">200</div>
                </li>
                <%
                      }
                %>
</ul>   