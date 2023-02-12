import com.example.labnew.jdbc;

import javax . servlet .*;
import javax . servlet . http .*;
import java . io .*;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import com.example.labnew.jdbc;
public class login extends HttpServlet {
    @Override
    public void doPost ( HttpServletRequest request , HttpServletResponse
            response )
            throws ServletException , IOException {

        try {
            //Connection conn = jdbc.getConnection();
            String username = request.getParameter("user");
            String password = request.getParameter("pass");
            response.setContentType ("text/html");
            PrintWriter out = response.getWriter();
            RequestDispatcher rd = request.getRequestDispatcher("/home.html");
//            PreparedStatement ps = conn.prepareStatement("select password from id_pass where username=?");
//            ps.setString(1,username);
//            ResultSet rs = ps.executeQuery();
            if(password.equals("12345678")) {
                HttpSession session = request.getSession();
                rd.forward(request,response);
            }
            else{
                System.out.println("xx");
            }
//            RequestDispatcher rd = request.getRequestDispatcher("home.html");
//            rd.forward(request,response);

//            if(rs.isBeforeFirst()){
//                rs.next();
//                String db_password = rs.getString("password");
//                if(db_password.equals(password)){
//                    response.sendRedirect("home.html");
//                }
//            }
//            else{
//                response.sendRedirect("home.html");
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}