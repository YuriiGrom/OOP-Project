
public class MyGame {

	public static void main(String[] args) {
		
		GameController newGame = new GameController();
		new QuitCommand (newGame);
		new HelpCommand (newGame);
		newGame.getInput();

	}

}
