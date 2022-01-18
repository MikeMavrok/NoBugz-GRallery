package gr.aueb.dmst.game.GRallery;
//Main
//call Users and LoginPage
public class GRallery {
	public static void main(String[] args) {
		Users users = new Users();
		LoginPage loginPage = new LoginPage (users.getLoginInfo());

	}
}
