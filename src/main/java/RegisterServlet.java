import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        res.getWriter().println("<h2>Register Page</h2>");
    }
}
