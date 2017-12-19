

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {


    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at:").append(request.getContextPath());
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username);
		System.out.println(password);

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<% page pageEncoding='UTF-8' %>");
	out.println("<html><head></head><body><br>"+username+"<br>"+password+"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Servlet at:").append(request.getContextPath());
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println(username);
		System.out.println(password);

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();

	out.println("<html><head></head><body<br>"+username+"<br>"+password+"</body></html>");
	}

}
