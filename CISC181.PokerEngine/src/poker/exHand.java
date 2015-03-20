package poker;

public class exHand extends RuntimeException {
	
	//constructor that is called when two hands are tied in strength
	public exHand(){
		System.out.println("The hands are tied");
	}
	
	
}
