package duel;

public class CharacterA implements Dueler{

	private int hp;
	

	public CharacterA() {
		
	}
	
	public String getName() {
		return "Frederick";
	}
	
	public void taunt() {
		System.out.println("Pick a god and pray");
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		return d.getHP() == hp;
	}
	
	public int getAction(Object caller) {
		return (int)(Math.random() * 4);
	}

	public void hit(Object caller) {
		if (caller instanceof Duel) {
			this.hp = this.hp - 10;
		}
	}
}