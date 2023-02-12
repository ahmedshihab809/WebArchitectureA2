import javax . servlet .*;
import javax . servlet . http .*;
import java . io .*;
import java.lang.Math;
import javax.servlet.http.HttpServletRequest;
public class logout extends HttpServlet {
    @Override
    public void doGet ( HttpServletRequest request , HttpServletResponse
            response )
            throws ServletException , IOException {

    HttpSession session=request.getSession();
    session.invalidate();
    response.setContentType("text/html");
//    PrintWriter out = response.getWriter();
//    out.println("<html>");
//    out.println("<body>");
//    out.println("<h1>Logout Successful!</h1>");
//    out.println("<h1>Wait for 3 seconds please!</h1>");
//    out.println("</body>");
//    out.println("/html");
//    try {
//        Thread.sleep(3000);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//    }
    RequestDispatcher rd=request.getRequestDispatcher("/index.html");
    rd.forward(request,response);
    }
}