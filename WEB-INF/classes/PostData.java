import jakarta.servlet.http.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;


//annotation
@WebServlet("/post_data")
public class PostData extends HttpServlet{ //httpservlet is the superclass

//do post method
public void doPost(HttpServletRequest request, HttpServletResponse response) throws 
ServletException, IOException{
	
	//read parameters
	String full_name = request.getParameter("full_name");
	String street = request.getParameter("street");
	String city = request.getParameter("city");

	System.out.println("Full Name:  "+full_name);
	System.out.println("Street:  "+street);
	System.out.println("City:  "+city);

	//dispatch
	request.setAttribute("full_name", full_name);
	request.setAttribute("street", street);
	request.setAttribute("city", city);

	request.getRequestDispatcher("home.jsp").forward(request, response);


}

}