
public class QuitCommand implements Commandable {
	
	String input;

	@Override
	public void doCommand() {
		
		System.out.println("Closing the game...");
		System.exit(0);	
		
	}

	@Override
	public void matchCommand(String userInput) {
		
		if ("quit".equals(userInput)) {
			
			doCommand();
		}
		
	}

}
