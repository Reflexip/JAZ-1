

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formularz")

public class Engine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       CheckAccess checkAccess = new CheckAccess();
	
    
    public Engine() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	if(checkAccess.checkAccess(request)){
		Person person = new Person(
				request.getParameter("name"), 
				request.getParameter("surname"), 
				request.getParameter("email"), 
				request.getParameter("employer"),
				Integer.parseInt(request.getParameter("radio")), 
				request.getParameter("other"), 
				request.getParameter("whatYouDo")
		);
	
		checkAccess.addToList(person);
		
		response.sendRedirect("send.jsp");
		
		checkAccess.setSessionId(request);
	}
	else{
		response.sendRedirect("noAccess.jsp");
	
	}
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
