package duel;

public class CharacterB implements Dueler {
	
	private int hp;
	
	public CharacterB() {
		
	}
	
	public String getName() {
		return "Douglass";
	}
	
	public void taunt() {
		System.out.println("Come at me, bro! Git Good");
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		
	}
	
}