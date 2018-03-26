
public class QuitCommand implements Commandable{
	
	protected GameController newGame;
	public String Input;
	
	
	public QuitCommand (GameController newGame)
	{
		this.newGame = newGame;
		this.newGame.register(this);
	}

	@Override
	public String doCommand() {
		// TODO Auto-generated method stub
		System.out.println("Closing the game...");
		System.exit(0);
		return null;
	}

	@Override
	public void matchCommand(String userInput) {
		// TODO Auto-generated method stub
		if ("quit".equals(userInput)) {
			
			doCommand();
		}
		else 
		{
			System.out.println("Command not Recognized. Try again");
		}
	}

	@Override
	public void update(String userInput) {
		// TODO Auto-generated method stub
		Input = userInput;
		matchCommand(Input);
	}

}
