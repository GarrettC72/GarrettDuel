package duel;

public class CharacterB implements Dueler {
	
	private int hp;
	
	public CharacterB() {
		
	}
	
	public void taunt() {
		System.out.println("Come at me, bro! Git Good");
	}
	public String getName() {
		return "Douglass";
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