

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet06")
public class HelloServlet06 extends HttpServlet {


    public HelloServlet06() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out =response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<H3>Hello Servlet06!</H3>");
		out.println("<?BODY>");
		out.println("</HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//doGet(request, response);
	//}

}
