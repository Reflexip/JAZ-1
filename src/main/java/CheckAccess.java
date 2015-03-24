import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


public class CheckAccess {
	private ArrayList<Person> personsList = new ArrayList<Person>();
	
	String sessionId = null;
	
	public void addToList(Person person){
		personsList.add(person);
	}
	
	private int getListSize(){
		return personsList.size();
	}

	public boolean checkAccess(HttpServletRequest request){
		HttpSession session = request.getSession();
		if((getListSize() < 5) && sessionId != session.getId()) return true;
		else return false;
	}
	
	public void setSessionId(HttpServletRequest request){
		sessionId = request.getSession().getId();
	}

}
