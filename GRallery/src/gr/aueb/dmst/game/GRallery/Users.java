package gr.aueb.dmst.game.GRallery;
import java.util.HashMap;

public class Users {
HashMap<String, String> logininfo = new HashMap<String, String>();
	
	Users(){
		
		logininfo.put("Test","Tester");
	}
	
	public HashMap getLoginInfo() {
		return logininfo;
	}
}

