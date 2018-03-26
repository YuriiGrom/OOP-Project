
public class HelpCommand implements Commandable {
	
	protected GameController newGame;
	public String Input;
	
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
	public void matchCommand(String input) {
		// TODO Auto-generated method stub
		if ("help".equals(input))
		{
			doCommand();
		}
		else
		{
			System.out.println("Command not Recognized. Try again");
			newGame.getInput();
		}
	}

	@Override
	public void update(String userInput) {
		// TODO Auto-generated method stub
		Input = userInput;
		matchCommand(Input);
	}
	

}
