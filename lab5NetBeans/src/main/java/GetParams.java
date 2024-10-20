/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package servelet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="GetParams", urlPatterns={"/GetParams"})
public class GetParams extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetParams</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>This is a DO GET METHOD</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
              response.setContentType("text/html;charset=UTF-8");
              


        try (PrintWriter out = response.getWriter()) {
            
        String id = (String) request.getParameter("idn");
        String name = (String) request.getParameter("namen");
        String email = (String) request.getParameter("email");
        String gender = (String) request.getParameter("gender");
        String major = (String) request.getParameter("major");
       
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetParams</title>");
            out.println("<link rel=\"stylesheet\" href=\"style.css\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Reading Personal Information</h1>");
            out.println("<table>" );
            out.println("<tr>" );
            out.println("<td>ID<td>");
            out.println("<td>"+ id);
            out.println("</td>");
            out.println("</tr>" );
            
            out.println("<tr>" );
            out.println("<td>Name<td>");
            out.println("<td>"+ name);
            out.println("</td>");
            out.println("</tr>" );
            
            out.println("<tr>" );
            out.println("<td>Email<td>");
            out.println("<td>"+ email);
            out.println("</td>");
            out.println("</tr>" );
            
            out.println("<td>Gender<td>");
            out.println("<td>"+ gender);
            out.println("</td>");
            out.println("</tr>" );
            
            out.println("<td>Major<td>");
            out.println("<td>"+ major);
            out.println("</td>");
            out.println("</tr>" );
            
            out.println("</table>" );
//            out.println("<h1>params 1</h1>" + secondParam);
            
            
            out.println("</body>");
            out.println("</html>");
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
