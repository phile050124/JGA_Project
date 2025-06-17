import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GardenCalculator extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get input from form
        String name = request.getParameter("name");
        double length = Double.parseDouble(request.getParameter("length"));
        double width = Double.parseDouble(request.getParameter("width"));
        double spacing = Double.parseDouble(request.getParameter("spacing"));

        // Do calculation
        double area = length * width;
        int totalPlants = (int)(area / (spacing * spacing));

        // Show result in browser
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Hello, " + name + "!</h2>");
        out.println("<p>Your garden area is " + area + " m².</p>");
        out.println("<p>You can grow approximately <strong>" + totalPlants + "</strong> plants.</p>");
        out.println("</body></html>");
    }
}
