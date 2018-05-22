import java.util.Scanner;

public class MyGame {

	public static void main(String[] args) {
		
		GameController newGame = new GameController();
		new QuitCommand (newGame);
		new HelpCommand (newGame);
		
		Scanner input = new Scanner (System.in);
		
		
		int i =0;
		
		while (i==0) {
			System.out.println("Enter your command: ");
			String userInput  = input.nextLine();
			newGame.getInput(userInput);
		}
			
	}

}
