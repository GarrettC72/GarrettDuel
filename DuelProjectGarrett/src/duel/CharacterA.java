package duel;

public class CharacterA implements Dueler {
	
	private int hp;
	
	public CharacterA() {
		
	}
	
	public String getName() {
		return "Frederick";
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
}