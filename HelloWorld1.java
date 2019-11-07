package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld1 extends HttpServlet {
	// Phương thức init() được gọi một lần duy nhất,
	 // khi web server load servlet lên lần đầu (để khởi tạo các giá trị cho servlet).
	 public void init() throws ServletException {
	 // Do required initialization
	 }
	 // Các phương thức doGet(___), doPost(___) sẽ được gọi mỗi khi có request từ client
	 // tùy thuộc vào kiểu request (method = POST hay method = GET)
	 // mà phương thức doPost hay doGet sẽ được gọi.
	 // Lưu ý rằng: mỗi lần có request,
	 // web server sẽ tạo một luồng (thread) để gọi đến các phương thức này
	 // trên cùng một instance của servlet(instance của servlet chỉ tạo một lần duy nhất)
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
	 throws ServletException, IOException {

	 // Định nghĩa response content type
	 response.setContentType("text/html");
	 PrintWriter out = response.getWriter();
	 out.println("<h1>+ Hello World + </h1>");
	 out.close();
	 }
	 public void destroy() {
	 // do nothing.
	 }

}
