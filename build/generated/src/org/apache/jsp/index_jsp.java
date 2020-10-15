package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.TreeMap;
import java.util.Vector;
import Models.clsCategory;
import CSDL.tbCategory;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/inc_home/header.jsp");
    _jspx_dependants.add("/inc_home/footer.jsp");
    _jspx_dependants.add("/inc_home/copyright.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Obaju : e-commerce template</title>\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"robots\" content=\"all,follow\">\n");
      out.write("    <!-- Bootstrap CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- Font Awesome CSS-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <!-- Google fonts - Roboto -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:100,300,400,700\">\n");
      out.write("    <!-- owl carousel-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/owl.carousel/assets/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendor/owl.carousel/assets/owl.theme.default.css\">\n");
      out.write("    <!-- theme stylesheet-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.default.css\" id=\"theme-stylesheet\">\n");
      out.write("    <!-- Custom stylesheet - for your changes-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("    <!-- Favicon-->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"favicon.png\">\n");
      out.write("    <!-- Tweaks for older IEs--><!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script><![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <!-- navbar-->\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <header class=\"header mb-5\">\n");
      out.write("      <!--\n");
      out.write("      *** TOPBAR ***\n");
      out.write("      _________________________________________________________\n");
      out.write("      -->\n");
      out.write("      <div id=\"top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-6 offer mb-3 mb-lg-0\"><a href=\"#\" class=\"btn btn-success btn-sm\">Offer of the day</a><a href=\"#\" class=\"ml-1\">Get flat 35% off on orders over $50!</a></div>\n");
      out.write("            <div class=\"col-lg-6 text-center text-lg-right\">\n");
      out.write("              <ul class=\"menu list-inline mb-0\">\n");
      out.write("                 ");

                        String name =(String)session.getAttribute("taikhoan");
                        if(name==null){
                        
      out.write(" \n");
      out.write("                <li class=\"list-inline-item\"><a href=\"#\" data-toggle=\"modal\" data-target=\"#login-modal\">Login</a></li>\n");
      out.write("                <li class=\"list-inline-item\"><a href=\"register.jsp\">Đăng ký</a></li>\n");
      out.write("                ");

                        }else
                        {
                    
      out.write("\n");
      out.write("                <li class=\"list-inline-item\"><a href=\"customer-order.jsp\" data-toggle=\"\" data-target=\"\">");
      out.print(name);
      out.write("</a></li>\n");
      out.write("                ");

                    }
                    
      out.write("\n");
      out.write("                \n");
      out.write("                <li class=\"list-inline-item\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                <li class=\"list-inline-item\"><a href=\"#\">Recently viewed</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"login-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"Login\" aria-hidden=\"true\" class=\"modal fade\">\n");
      out.write("          <div class=\"modal-dialog modal-sm\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("              <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\">Customer login</h5>\n");
      out.write("                <button type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\" class=\"close\"><span aria-hidden=\"true\">×</span></button>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"modal-body\">\n");
      out.write("                <form action=\"XulyLogin\" method=\"post\">\n");
      out.write("                    \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input id=\"email-modal\" name=\"login_email\" type=\"text\" placeholder=\"email\" class=\"form-control\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input id=\"password-modal\" name=\"login_password\" type=\"password\" placeholder=\"password\" class=\"form-control\">\n");
      out.write("                  </div>\n");
      out.write("                  <p class=\"text-center\">\n");
      out.write("                    ");

                        String e1 =(String)session.getAttribute("taikhoan");
                        if(e1==null){
                        
      out.write("\n");
      out.write("                    <button class=\"btn btn-primary\"><i class=\"fa fa-sign-in\"></i> \n");
      out.write("                        \n");
      out.write("                        Log in</button>\n");
      out.write("                    ");

                        }else
                        {
                    
      out.write("\n");
      out.write("                    <button class=\"btn btn-primary\"><i class=\"fa fa-sign-in\"></i>     \n");
      out.write("                        ");
      out.print(e1);
      out.write("\n");
      out.write("                    </button>\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                  </p>\n");
      out.write("                  <input type=\"checkbox\" class=\"\" name=\"cLogin_Admin\" value=\"admin\">Admin</input>\n");
      out.write("                  \n");
      out.write("                </form>\n");
      out.write("                <p class=\"text-center text-muted\">Not registered yet?</p>\n");
      out.write("                <p class=\"text-center text-muted\"><a href=\"register.html\"><strong>Register now</strong></a>! It is easy and done in 1 minute and gives you access to special discounts and much more!</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- *** TOP BAR END ***-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("      <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("        <div class=\"container\"><a href=\"index.jsp\" class=\"navbar-brand home\"><img src=\"img/logo.png\" alt=\"Obaju logo\" class=\"d-none d-md-inline-block\"><img src=\"img/logo-small.png\" alt=\"Obaju logo\" class=\"d-inline-block d-md-none\"><span class=\"sr-only\">Obaju - go to homepage</span></a>\n");
      out.write("          <div class=\"navbar-buttons\">\n");
      out.write("            <button type=\"button\" data-toggle=\"collapse\" data-target=\"#navigation\" class=\"btn btn-outline-secondary navbar-toggler\"><span class=\"sr-only\">Toggle navigation</span><i class=\"fa fa-align-justify\"></i></button>\n");
      out.write("            <button type=\"button\" data-toggle=\"collapse\" data-target=\"#search\" class=\"btn btn-outline-secondary navbar-toggler\"><span class=\"sr-only\">Toggle search</span><i class=\"fa fa-search\"></i></button><a href=\"basket.html\" class=\"btn btn-outline-secondary navbar-toggler\"><i class=\"fa fa-shopping-cart\"></i></a>\n");
      out.write("          </div>\n");
      out.write("          <div id=\"navigation\" class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("              <li class=\"nav-item\"><a href=\"#\" class=\"nav-link active\">Trang chủ</a></li>\n");
      out.write("              <li class=\"nav-item dropdown menu-large\"><a href=\"#\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-delay=\"200\" class=\"dropdown-toggle nav-link\">SẢN PHẨM<b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu megamenu\">\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        ");

                            Vector<clsCategory> list1 = new Vector<clsCategory>();
                            int ketqua1 = tbCategory.Cate_List(0, list1);
                            //if(ketqua1<=0)
                            //    out.println("<H3>LỖI ĐỌC DỮ LIỆU " + ketqua1 + "</H3>");
                            for(clsCategory cat1 : list1)
                            {
                        
      out.write("\n");
      out.write("                      <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                        <h5>");
      out.print(cat1.getName());
      out.write("</h5>\n");
      out.write("                        <ul class=\"list-unstyled mb-3\">\n");
      out.write("                                ");

                                Vector<clsCategory> list2 = new Vector<clsCategory>();
                                int ketqua2 = tbCategory.Cate_List(cat1.getId(), list2);
                                for(clsCategory cat2 : list2)
                                {
                                
      out.write("\n");
      out.write("                            <li class=\"nav-item\"><a href=\"index.jsp?module=p_cate&catid=");
      out.print(cat2.getPid());
      out.write("\" class=\"nav-link\">");
      out.print(cat2.getName());
      out.write("</a></li>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                      </div>\n");
      out.write("                      ");

                          }//đóng for nhóm sản phẩm cấp 1
                      
      out.write("\n");
      out.write("                      <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                        <h5>Featured</h5>\n");
      out.write("                        <ul class=\"list-unstyled mb-3\">\n");
      out.write("                          <li class=\"nav-item\"><a href=\"category.html\" class=\"nav-link\">Trainers</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"category.html\" class=\"nav-link\">Sandals</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"category.html\" class=\"nav-link\">Hiking shoes</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <h5>Looks and trends</h5>\n");
      out.write("                        <ul class=\"list-unstyled mb-3\">\n");
      out.write("                          <li class=\"nav-item\"><a href=\"category.html\" class=\"nav-link\">Trainers</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"category.html\" class=\"nav-link\">Sandals</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"category.html\" class=\"nav-link\">Hiking shoes</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item dropdown menu-large\"><a href=\"#\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-delay=\"200\" class=\"dropdown-toggle nav-link\">Template<b class=\"caret\"></b></a>\n");
      out.write("                <ul class=\"dropdown-menu megamenu\">\n");
      out.write("                  <li>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                      <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                        <h5>Shop</h5>\n");
      out.write("                        <ul class=\"list-unstyled mb-3\">\n");
      out.write("                          <li class=\"nav-item\"><a href=\"index.jsp\" class=\"nav-link\">Homepage</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"category.html\" class=\"nav-link\">Category - sidebar left</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"category-right.html\" class=\"nav-link\">Category - sidebar right</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"category-full.html\" class=\"nav-link\">Category - full width</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"detail.html\" class=\"nav-link\">Product detail</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                        <h5>User</h5>\n");
      out.write("                        <ul class=\"list-unstyled mb-3\">\n");
      out.write("                          <li class=\"nav-item\"><a href=\"register.html\" class=\"nav-link\">Register / login</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"customer-orders.html\" class=\"nav-link\">Orders history</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"customer-order.html\" class=\"nav-link\">Order history detail</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"customer-wishlist.html\" class=\"nav-link\">Wishlist</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"customer-account.html\" class=\"nav-link\">Customer account / change password</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                        <h5>Order process</h5>\n");
      out.write("                        <ul class=\"list-unstyled mb-3\">\n");
      out.write("                          <li class=\"nav-item\"><a href=\"basket.html\" class=\"nav-link\">Shopping cart</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"checkout1.html\" class=\"nav-link\">Checkout - step 1</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"checkout2.html\" class=\"nav-link\">Checkout - step 2</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"checkout3.html\" class=\"nav-link\">Checkout - step 3</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"checkout4.html\" class=\"nav-link\">Checkout - step 4</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-md-6 col-lg-3\">\n");
      out.write("                        <h5>Pages and blog</h5>\n");
      out.write("                        <ul class=\"list-unstyled mb-3\">\n");
      out.write("                          <li class=\"nav-item\"><a href=\"blog.html\" class=\"nav-link\">Blog listing</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"post.html\" class=\"nav-link\">Blog Post</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"faq.html\" class=\"nav-link\">FAQ</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"text.html\" class=\"nav-link\">Text page</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"text-right.html\" class=\"nav-link\">Text page - right sidebar</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"404.html\" class=\"nav-link\">404 page</a></li>\n");
      out.write("                          <li class=\"nav-item\"><a href=\"contact.html\" class=\"nav-link\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"navbar-buttons d-flex justify-content-end\">\n");
      out.write("              <!-- /.nav-collapse-->\n");
      out.write("              <div id=\"search-not-mobile\" class=\"navbar-collapse collapse\"></div><a data-toggle=\"collapse\" href=\"#search\" class=\"btn navbar-btn btn-primary d-none d-lg-inline-block\"><span class=\"sr-only\">Toggle search</span><i class=\"fa fa-search\"></i></a>\n");
      out.write("              <div id=\"basket-overview\" class=\"navbar-collapse collapse d-none d-lg-block\">\n");
      out.write("                  <a href=\"basket.jsp\" class=\"btn btn-primary navbar-btn\"><i class=\"fa fa-shopping-cart\"></i>\n");
      out.write("                      <span>\n");
      out.write("                          \n");
      out.write("                          items in cart\n");
      out.write("                        </span>\n");
      out.write("                  </a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("      <div id=\"search\" class=\"collapse\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <form role=\"search\" class=\"ml-auto\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("              <input type=\"text\" placeholder=\"Search\" class=\"form-control\">\n");
      out.write("              <div class=\"input-group-append\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </header>");
      out.write("\n");
      out.write("    <div id=\"all\">\n");
      out.write("      <div id=\"content\">\n");
      out.write("        ");

              
              String module = "";
              if(request.getParameter("module")!=null)
                module = request.getParameter("module");
                
              if(module.equalsIgnoreCase("p_cate"))
              {
          
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc_home/module_product_category.jsp", out, false);
      out.write("\n");
      out.write("          ");

            }else if(module.equalsIgnoreCase("p_detail")){
          
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc_home/module_product_detail.jsp", out, false);
      out.write("\n");
      out.write("          ");

            }else{
          
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc_home/module_home.jsp", out, false);
      out.write("\n");
      out.write("          ");

            }
          
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!--\n");
      out.write("    *** FOOTER ***\n");
      out.write("    _________________________________________________________\n");
      out.write("    -->\n");
      out.write("    ");
      out.write("\n");
      out.write("    <div id=\"footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-3 col-md-6\">\n");
      out.write("            <h4 class=\"mb-3\">Pages</h4>\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("              <li><a href=\"text.html\">About us</a></li>\n");
      out.write("              <li><a href=\"text.html\">Terms and conditions</a></li>\n");
      out.write("              <li><a href=\"faq.html\">FAQ</a></li>\n");
      out.write("              <li><a href=\"contact.html\">Contact us</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <hr>\n");
      out.write("            <h4 class=\"mb-3\">User section</h4>\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("              <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#login-modal\">Login</a></li>\n");
      out.write("              <li><a href=\"register.html\">Regiter</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <!-- /.col-lg-3-->\n");
      out.write("          <div class=\"col-lg-3 col-md-6\">\n");
      out.write("            <h4 class=\"mb-3\">Top categories</h4>\n");
      out.write("            <h5>Men</h5>\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("              <li><a href=\"category.html\">T-shirts</a></li>\n");
      out.write("              <li><a href=\"category.html\">Shirts</a></li>\n");
      out.write("              <li><a href=\"category.html\">Accessories</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <h5>Ladies</h5>\n");
      out.write("            <ul class=\"list-unstyled\">\n");
      out.write("              <li><a href=\"category.html\">T-shirts</a></li>\n");
      out.write("              <li><a href=\"category.html\">Skirts</a></li>\n");
      out.write("              <li><a href=\"category.html\">Pants</a></li>\n");
      out.write("              <li><a href=\"category.html\">Accessories</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <!-- /.col-lg-3-->\n");
      out.write("          <div class=\"col-lg-3 col-md-6\">\n");
      out.write("            <h4 class=\"mb-3\">Where to find us</h4>\n");
      out.write("            <p><strong>Obaju Ltd.</strong><br>13/25 New Avenue<br>New Heaven<br>45Y 73J<br>England<br><strong>Great Britain</strong></p><a href=\"contact.html\">Go to contact page</a>\n");
      out.write("            <hr class=\"d-block d-md-none\">\n");
      out.write("          </div>\n");
      out.write("          <!-- /.col-lg-3-->\n");
      out.write("          <div class=\"col-lg-3 col-md-6\">\n");
      out.write("            <h4 class=\"mb-3\">Get the news</h4>\n");
      out.write("            <p class=\"text-muted\">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>\n");
      out.write("            <form>\n");
      out.write("              <div class=\"input-group\">\n");
      out.write("                <input type=\"text\" class=\"form-control\"><span class=\"input-group-append\">\n");
      out.write("                  <button type=\"button\" class=\"btn btn-outline-secondary\">Subscribe!</button></span>\n");
      out.write("              </div>\n");
      out.write("              <!-- /input-group-->\n");
      out.write("            </form>\n");
      out.write("            <hr>\n");
      out.write("            <h4 class=\"mb-3\">Stay in touch</h4>\n");
      out.write("            <p class=\"social\"><a href=\"#\" class=\"facebook external\"><i class=\"fa fa-facebook\"></i></a><a href=\"#\" class=\"twitter external\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\" class=\"instagram external\"><i class=\"fa fa-instagram\"></i></a><a href=\"#\" class=\"gplus external\"><i class=\"fa fa-google-plus\"></i></a><a href=\"#\" class=\"email external\"><i class=\"fa fa-envelope\"></i></a></p>\n");
      out.write("          </div>\n");
      out.write("          <!-- /.col-lg-3-->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row-->\n");
      out.write("      </div>\n");
      out.write("      <!-- /.container-->\n");
      out.write("    </div>");
      out.write("\n");
      out.write("    <!-- /#footer-->\n");
      out.write("    <!-- *** FOOTER END ***-->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <!--\n");
      out.write("    *** COPYRIGHT ***\n");
      out.write("    _________________________________________________________\n");
      out.write("    -->\n");
      out.write("    ");
      out.write("\n");
      out.write("    <div id=\"copyright\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-6 mb-2 mb-lg-0\">\n");
      out.write("            <p class=\"text-center text-lg-left\">©2019 Your name goes here.</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-6\">\n");
      out.write("            <p class=\"text-center text-lg-right\">Template design by <a href=\"https://bootstrapious.com/\">Bootstrapious</a>\n");
      out.write("              <!-- If you want to remove this backlink, pls purchase an Attribution-free License @ https://bootstrapious.com/p/obaju-e-commerce-template. Big thanks!-->\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>");
      out.write("\n");
      out.write("    <!-- *** COPYRIGHT END ***-->\n");
      out.write("    <!-- JavaScript files-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"vendor/jquery.cookie/jquery.cookie.js\"> </script>\n");
      out.write("    <script src=\"vendor/owl.carousel/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"vendor/owl.carousel2.thumbs/owl.carousel2.thumbs.js\"></script>\n");
      out.write("    <script src=\"js/front.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
