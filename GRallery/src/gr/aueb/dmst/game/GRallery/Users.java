package gr.aueb.dmst.game.GRallery;
import java.util.HashMap;

public class Users {
HashMap<String, String> logininfo = new HashMap<String, String>();
	
	Users(){
		
		logininfo.put("1","Katerina");
		logininfo.put("2","Asimina");
		logininfo.put("3","Zoe");
		logininfo.put("4","George");
		logininfo.put("5","Olga");
		logininfo.put("6","Giouli");
		logininfo.put("7","Mike");
		
		
	}
	
	public HashMap<String, String> getLoginInfo() {
		return logininfo;
	}
}

