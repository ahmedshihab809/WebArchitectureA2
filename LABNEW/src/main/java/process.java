import com.example.labnew.jdbc;

import javax . servlet .*;
import javax . servlet . http .*;
import java . io .*;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.ArrayList;

import com.example.labnew.jdbc;

//This servlet manages the selection of new items and adds them to the session
public class process extends HttpServlet {
    @Override
    public void doGet ( HttpServletRequest request , HttpServletResponse
            response )
            throws ServletException , IOException {
        response.setContentType ("text/html");
        PrintWriter out = response.getWriter();
        String[] x = request.getParameterValues("items");
        int[] arr = new int[3];
        HttpSession session=request.getSession();
        int[] k = (int[])session.getAttribute("count");

        arr[0]=Integer.parseInt(request.getParameter("i1"))+k[0];
        arr[1]=Integer.parseInt(request.getParameter("i2"))+k[1];
        arr[2]=Integer.parseInt(request.getParameter("i3"))+k[2];

        String[] z = (String[])session.getAttribute("items");
        int fal = x.length;
        int sal = z.length;
        String[] result = new String[fal+sal];
        System.arraycopy(x,0,result,0,fal);
        System.arraycopy(z,0,result,fal,sal);
        session.setAttribute("items",result);
        session.setAttribute("count",arr);
        RequestDispatcher rd1 = request.getRequestDispatcher("/update.html");
        RequestDispatcher rd2 = request.getRequestDispatcher("/checkout.html");
        out.print("<html>");
        out.print("<body>");
        out.print("<p> Your contents are: </p>");
        out.print("<ul>");
        int j=0;
        for(String s: result){
            out.print("<li>"+s+"</li>");
            out.print(arr[j]);
            j++;
        }
        out.print("</ul");
        rd1.include(request,response);
        rd2.include(request,response);
        out.print("</body>");
        out.print("</html>");


    }
}