
public class HelpCommand implements Commandable {
	
	public void doCommand() {
		
		System.out.println("Avaliable commands: quit, help");
	}


	@Override
	public void matchCommand(String userInput) {
		// TODO Auto-generated method stub
		if ("help".equals(userInput)) {
			
			doCommand();
		}
	}

}
