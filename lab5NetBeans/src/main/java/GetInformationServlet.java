/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import data.UserDB;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Arrays;
import object.User;

/**
 *
 * @author Administrator
 */
@WebServlet(name="Get_Information", urlPatterns = {"/getInformation"})
public class GetInformationServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  

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

          String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("submit")) {
            url = "/index.html";    // the "result" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String fullName = request.getParameter("fullname_name");
            String id = request.getParameter("id_name");
            String email = request.getParameter("email_name");
            String gender = request.getParameter("gender_name");
            String study = request.getParameter("study_name");
            String[] subject = request.getParameterValues("subjects"); //lấy giá trị từ checkbox
            String comment = request.getParameter("comment_name");
            
            // In giá trị study ra console để kiểm tra
            System.out.println("Subject: " + Arrays.toString(subject));
            
            // store data in User object and save User object in database
//            User user = new User(fullName, id, email, gender, study, subject, comment);
            User user = new User(fullName, id, email, gender, study, subject, comment);
            UserDB.insert(user);
            
            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/form_result.jsp";   // the "result" page
        }
        
        // forward request and response objects to specified URL
        getServletContext().getRequestDispatcher(url).forward(request, response);

    }

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
        doPost(request, response);
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
