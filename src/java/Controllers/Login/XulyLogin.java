/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Login;

import CSDL.tbNguoiDung;
import CSDL.tnQuanTri;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "XulyLogin", urlPatterns = {"/XulyLogin"})
public class XulyLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String e = request.getParameter("login_email");
            String p = request.getParameter("login_password");
            
            if(e!=null && p != null && !e.equals("") && !p.equals("")){
                
                //int level = 0;
                if(request.getParameter("cLogin_Admin")==null){
                    tbNguoiDung user = new tbNguoiDung();
                    int ketqua = user.Kiemtra(e, p);
                    out.println("Nguoi dung : "+ketqua);
                    if(ketqua<0)
                        out.println("Lỗi " + ketqua);
                    else if(ketqua == 0)
                        request.getRequestDispatcher("index.jsp").include(request, response);
                    else{
                        HttpSession session = request.getSession();//Gán 
                        session.setAttribute("taikhoan", e);
                        response.sendRedirect("customer-order.jsp");
                    }
                }else{
                    tnQuanTri admin = new tnQuanTri();
                    int ketqua = admin.Kiemtra(e, p);
                    //out.println("admin : "+ketqua);
                    if(ketqua<0)
                        out.println("Lỗi " + ketqua);
                    else if(ketqua == 0){
                        out.println("Bạn nhập sai tài khoản hoặc mật khẩu");
                        request.getRequestDispatcher("index.jsp").include(request, response);
                        
                        }
                    else{
                        HttpSession session = request.getSession();//Gán 
                        session.setAttribute("taikhoan2", e);
                        response.sendRedirect("index_admin.jsp");
                    }
                }    
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
