import com.example.labnew.jdbc;

import javax . servlet .*;
import javax . servlet . http .*;
import java . io .*;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.ArrayList;

import com.example.labnew.jdbc;

//this servlet handles the checkout route
public class checkout extends HttpServlet {
    @Override
    public void doGet ( HttpServletRequest request , HttpServletResponse
            response )
            throws ServletException , IOException {
        response.setContentType ("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
        int[] counts = (int[])session.getAttribute("count");
        String[] items = (String[])session.getAttribute("items");
        int[] msrp = {20,50,100};
        out.print("<html>");
        out.print("<body>");
        out.print("<p> Your Bill is: </p>");
        out.print("<ul>");
        int j=0;
        for(String s: items){
            out.print("<li>"+s+"</li>");
            out.print(counts[j]+"x"+msrp[j]);
            j++;
        }
        int ans=0;
        for(int i=0;i<3;i++){
            ans+=msrp[i]*counts[i];
        }
        out.print("<p>Your total bill is:" + ans + "<p>");
        RequestDispatcher rd = request.getRequestDispatcher("/home.html");
        rd.forward(request,response);
        out.print("</ul");
        out.print("</body>");
        out.print("</html>");


    }
}