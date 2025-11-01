import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        res.getWriter().println("<h2>Welcome to your Profile Page 👤</h2>");
    }
}
