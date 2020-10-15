/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Admin.BasicTable.SanPham;

import CSDL.tbSanpham;
import Models.clsSanpham;
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
@WebServlet(name = "XuLySuaSanPhamAdmin", urlPatterns = {"/XuLySuaSanPhamAdmin"})
public class XuLySuaSanPhamAdmin extends HttpServlet {

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
            String masp = request.getParameter("add_masp_admin");
            String tensp = request.getParameter("add_tensp_admin");
            int giasp= Integer.parseInt(request.getParameter("add_giasp_admin"));
            int manhom= Integer.parseInt(request.getParameter("add_manhom_admin"));
            String hinhanh = request.getParameter("add_hinhanh_admin");
            String tomtat = request.getParameter("add_tomtat_admin");
            String noidung = request.getParameter("add_noidung_admin");
            int trangthai = Integer.parseInt(request.getParameter("add_status_admin"));  
            int id = Integer.parseInt(request.getParameter("id"));
            //int id = Integer.parseInt(request.getParameter("id"));
            clsSanpham sp = new clsSanpham(id,masp,tensp,giasp, manhom, hinhanh,tomtat,noidung,trangthai);
            int ketqua = tbSanpham.FixProductAdmin(sp);
            
            if(ketqua<=0)
                out.println("Lỗi" + ketqua);
            else{
                String thongbao = "Sửa người dùng thành công ";
                request.setAttribute("thongbao", thongbao);
                request.getRequestDispatcher("index_admin.jsp?module=p_product").include(request, response);
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
