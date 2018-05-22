
public class HelpCommand implements Commandable {
	
	private Subject newGame;
	public String userInput;
	
	public HelpCommand (GameController newGame)
	{
		this.newGame = newGame;
		this.newGame.register(this);
	}
	
	

	@Override
	public String doCommand() {
		// TODO Auto-generated method stub
		System.out.println("Avaliable commands: quit, help");
		return null;

	}

	@Override
	public void matchCommand(String userInput) {
		// TODO Auto-generated method stub
		if ("help".equals(userInput)){
			doCommand();
		}
		else if ("quit".equals(userInput)){
			
		}
		else {
			System.out.println("Command not Recognized. Try again");
		}
	}

	@Override
	public void update(String userInput) {
		// TODO Auto-generated method stub
		this.userInput = userInput;
		matchCommand(userInput);
	}
	

}
