import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstWebApp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        out.println("<h2>Hello from SDK</h2>");
        out.println("<p>This is a GET request</p>");

        //http://localhost:8081/Servlet/me?name=karan

        out.println("<p>Hi " + (name != null ? name : "Guest") + " 👋</p>");
    }
}



