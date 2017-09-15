package duel;

public class CharacterB implements Dueler {
	
	private int hp;
	
	public CharacterB() {
		
	}
	
	public void taunt() {
		System.out.println("Come at me, bro! Git Good");
	}
	public String getName() {
		return "The Real Frederick";
	}

	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		return 
	}
	
	public int getAction(Object caller) {
		return int
	}
	
	public void hit(Object caller) {
		
	}
}