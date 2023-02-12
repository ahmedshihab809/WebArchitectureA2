import com.example.labnew.jdbc;

import javax . servlet .*;
import javax . servlet . http .*;
import java . io .*;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.ArrayList;

import com.example.labnew.jdbc;
public class update extends HttpServlet {
    @Override
    public void doGet ( HttpServletRequest request , HttpServletResponse
            response )
            throws ServletException , IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/home.html");
        rd.forward(request,response);
    }
}