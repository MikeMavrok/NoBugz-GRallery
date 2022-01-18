package gr.aueb.dmst.game.GRallery;

public class GRallery {
	public static void main(String[] args) {
		Users users = new Users();
		LoginPage loginPage = new LoginPage (users.getLoginInfo());

	}
}
