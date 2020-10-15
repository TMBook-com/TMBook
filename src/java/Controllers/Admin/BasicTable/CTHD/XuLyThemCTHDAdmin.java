/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Admin.BasicTable.CTHD;

import CSDL.tbChitietHoadon;
import CSDL.tbHoaDon;
import Models.clsChitietHoadon;
import Models.clsHoaDon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "XuLyThemCTHDAdmin", urlPatterns = {"/XuLyThemCTHDAdmin"})
public class XuLyThemCTHDAdmin extends HttpServlet {

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
            int mahd =Integer.parseInt(request.getParameter("add_mahd_admin")) ;
            int idsp =Integer.parseInt(request.getParameter("add_idsp_admin")) ;
            int soluong=Integer.parseInt(request.getParameter("add_soluong_admin")) ;
            int giamua =Integer.parseInt(request.getParameter("add_giamua_admin")) ;
            clsChitietHoadon cthd = new clsChitietHoadon(0,mahd,idsp, soluong, giamua);
            int ketqua = tbChitietHoadon.ThemCTHDAdmin(cthd);
            if(ketqua<=0)
                out.println("Lỗi" + ketqua);
            else{
                String thongbao = "Thêm người dùng thành công ";
                request.setAttribute("thongbao", thongbao);
                request.getRequestDispatcher("index_admin.jsp?module=p_cthd").include(request, response);
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
