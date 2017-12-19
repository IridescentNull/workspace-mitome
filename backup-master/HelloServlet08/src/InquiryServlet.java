

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InquiryServlet")
public class InquiryServlet extends HttpServlet {

    public InquiryServlet() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String name=request.getParameter("name");
		String qtype=request.getParameter("qtype");
		String body=request.getParameter("body");

		System.out.println("質問者: "+name);
		System.out.println("問い合わせ種類: "+qtype);
		System.out.println("内容: "+body);

		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body><br>"+name+"さん、お問い合わせありがとうございました</body></html>");
	}

}
