<%@page import="CSDL.tbCategory"%>
<%@page import="Models.clsCategory"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="col-lg-3">
              <!--
              *** MENUS AND FILTERS ***
              _________________________________________________________
              -->
              <div class="card sidebar-menu mb-4">
                <div class="card-header">
                  <h3 class="h4 card-title">Categories</h3>
                </div>
                <div class="card-body">
                  <ul class="nav nav-pills flex-column category-menu">
                       <%
                    Vector<clsCategory> listCate = new Vector<clsCategory>();
                    int ketqua = tbCategory.Cate_List(0, listCate);
                    for(clsCategory cate : listCate){
                        %>
                    <li><a href="category.html" class="nav-link"><%=cate.getName()%> <span class="badge badge-secondary">42</span></a>
                      <ul class="list-unstyled">
                            <%
                          Vector<clsCategory> listCate1 = new Vector<clsCategory>();
                          int ketqua2 = tbCategory.Cate_List(cate.getId(), listCate1);
                          for(clsCategory cate1 : listCate1){
                          %>
                          
                        <li><a href="index.jsp?module=p_cate&catid=<%=cate1.getPid()%>" class="nav-link"><%=cate1.getName() %></a></li>
<!--                        <li><a href="category.html" class="nav-link">Shirts</a></li>
                        <li><a href="category.html" class="nav-link">Pants</a></li>
                        <li><a href="category.html" class="nav-link">Accessories</a></li>-->

                        <%
                            }
                        %>
                      </ul>
                    </li>
                    <%
                        }
                    %>
<!--                    <li><a href="category.html" class="nav-link active">Ladies  <span class="badge badge-light">123</span></a>
                      <ul class="list-unstyled">
                        <li><a href="category.html" class="nav-link">T-shirts</a></li>
                        <li><a href="category.html" class="nav-link">Skirts</a></li>
                        <li><a href="category.html" class="nav-link">Pants</a></li>
                        <li><a href="category.html" class="nav-link">Accessories</a></li>
                      </ul>
                    </li>
                    <li><a href="category.html" class="nav-link">Kids  <span class="badge badge-secondary">11</span></a>
                      <ul class="list-unstyled">
                        <li><a href="category.html" class="nav-link">T-shirts</a></li>
                        <li><a href="category.html" class="nav-link">Skirts</a></li>
                        <li><a href="category.html" class="nav-link">Pants</a></li>
                        <li><a href="category.html" class="nav-link">Accessories</a></li>
                      </ul>
                    </li>-->
                  </ul>
                </div>
              </div>
              <div class="card sidebar-menu mb-4">
                <div class="card-header">
                  <h3 class="h4 card-title">Brands <a href="#" class="btn btn-sm btn-danger pull-right"><i class="fa fa-times-circle"></i> Clear</a></h3>
                </div>
                <div class="card-body">
                  <form>
                    <div class="form-group">
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"> Armani  (10)
                        </label>
                      </div>
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"> Versace  (12)
                        </label>
                      </div>
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"> Carlo Bruni  (15)
                        </label>
                      </div>
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"> Jack Honey  (14)
                        </label>
                      </div>
                    </div>
                    <button class="btn btn-default btn-sm btn-primary"><i class="fa fa-pencil"></i> Apply</button>
                  </form>
                </div>
              </div>
              <div class="card sidebar-menu mb-4">
                <div class="card-header">
                  <h3 class="h4 card-title">Colours <a href="#" class="btn btn-sm btn-danger pull-right"><i class="fa fa-times-circle"></i> Clear</a></h3>
                </div>
                <div class="card-body">
                  <form>
                    <div class="form-group">
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"><span class="colour white"></span> White (14)
                        </label>
                      </div>
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"><span class="colour blue"></span> Blue (10)
                        </label>
                      </div>
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"><span class="colour green"></span>  Green (20)
                        </label>
                      </div>
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"><span class="colour yellow"></span>  Yellow (13)
                        </label>
                      </div>
                      <div class="checkbox">
                        <label>
                          <input type="checkbox"><span class="colour red"></span>  Red (10)
                        </label>
                      </div>
                    </div>
                    <button class="btn btn-default btn-sm btn-primary"><i class="fa fa-pencil"></i> Apply</button>
                  </form>
                </div>
              </div>
              <!-- *** MENUS AND FILTERS END ***-->
              <div class="banner"><a href="#"><img src="img/banner.jpg" alt="sales 2014" class="img-fluid"></a></div>
            </div>