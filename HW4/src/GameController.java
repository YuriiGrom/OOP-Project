import java.util.*;
public class GameController {
	
	public List<Commandable> comList = new ArrayList<Commandable>();
	String userInput;
	
	
	public void getInput() {
		
		System.out.println("Enter your command: ");
		Scanner input = new Scanner (System.in);
		userInput = input.nextLine();
		notifyObservers();
		input.close();
		
	}
	
	public void notifyObservers()
	{
		for (Commandable observer : comList)
		{
			observer.update(userInput);
		}
	}

	public void register(Commandable observer) {
		// TODO Auto-generated method stub
		comList.add(observer);
	}
	
	
	

}