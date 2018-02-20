import java.util.Scanner;
public class GameController {
	
	static Commandable quit = new QuitCommand();
	static Commandable help = new HelpCommand();
	
	
	public void getInput() {
		
		System.out.println("Enter your command: ");
		Scanner input = new Scanner (System.in);
		String userInput = input.nextLine();
		inputCheck (userInput);
		loopCheck (userInput);
		input.close();
		
	}
	
	public void inputCheck(String userInput) {
		
		if ("help".equals(userInput) || "quit".equals(userInput)) {
			
			quit.matchCommand(userInput);
			help.matchCommand(userInput);
		}
		else{
			System.out.println("Command not Recognized");
		}
	
	}
	
	public void loopCheck (String loopString) {
		
		while (loopString != "quit") {
			
			getInput();
		}
	}
	
	
	

}
