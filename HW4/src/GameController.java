import java.util.*;
public class GameController implements Subject{
	
	public List<Commandable> comList;
	String userInput;
	
	public GameController () {
		
		comList = new ArrayList<Commandable>();
	}
	
	public void register(Commandable o) {
		comList.add(o);
	}
	
	public void notifyObservers() {
		for (Commandable observer : comList) {
			observer.update(userInput);
			}
	}
	
	public void getInput(String userInput) {
		this.userInput = userInput;
		notifyObservers();
	}
	
	

	
	
	
	

}