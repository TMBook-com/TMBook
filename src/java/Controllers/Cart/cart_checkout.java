/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers.Cart;

import CSDL.tbChitietHoadon;
import CSDL.tbHoaDon;
import CSDL.tbSanpham;
import Models.clsChitietHoadon;
import Models.clsHoaDon;
import Models.clsSanpham;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.TreeMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Tran Manh Truong
 */
@WebServlet(name = "cart_checkout", urlPatterns = {"/cart_checkout"})
public class cart_checkout extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            clsHoaDon hd = new clsHoaDon();
            hd.setTennguoimua(request.getParameter("tHoten"));
            hd.setDienthoai(request.getParameter("tDienthoai"));
            hd.setNgaynhan(request.getParameter("tNgaynhan"));
            int mahd = tbHoaDon.ThemHoadon(hd);
            //out.println("Mahd =  " + mahd);
            if(mahd<=0)
                out.println("<h3>Lỗi Thêm Hóa đơn "+mahd+"</h3>");
            else
            {
                HttpSession session = request.getSession();
                TreeMap<Integer,Integer> cart = (TreeMap<Integer,Integer>)session.getAttribute("cart");
                if(cart!=null)
                {
                    boolean loi = false;
                    for(int idsp : cart.keySet())
                    {
                        int soluong = cart.get(idsp);
                        clsSanpham sp = new clsSanpham();
                        int ketqua = tbSanpham.TimSanpham(idsp, sp);
                        if(ketqua>0)
                        {
                            int giasp = sp.getGiasp();
                            clsChitietHoadon cthd = new clsChitietHoadon(0, mahd, idsp, soluong, giasp);
                            ketqua = tbChitietHoadon.ThemChitietHD(cthd);
                            if(ketqua<=0)
                                loi = true;
                        }
                    }
                    if(loi==true)
                        out.println("<h3>Lỗi thêm chi tiết hóa đơn</h3>");
                    else
                    {
                        response.sendRedirect("Nocification.jsp");
                        session.removeAttribute("cart");
                       
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
