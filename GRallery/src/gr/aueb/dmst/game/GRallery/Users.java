package gr.aueb.dmst.game.GRallery;
import java.util.HashMap;

public class Users {
HashMap<String, String> logininfo = new HashMap<String, String>();
	
	Users(){
		ogininfo.put("1","Κατερίνα");
		logininfo.put("2","Ασημίνα");
		logininfo.put("3","Ζωή");
		logininfo.put("4","Γιώργος");
		logininfo.put("5","Όλγα");
		logininfo.put("6","Μιχάλης");
		
	}
	
	public HashMap getLoginInfo() {
		return logininfo;
	}
}

