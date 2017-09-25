package duel;

public class CharacterB implements Dueler {
	
	private int hp;
	private boolean loaded;
	private boolean round = false;
	
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
		if (!(caller instanceof Duel)) {
			return 3;
		}
		else {
			if (!round) {
				round = true;
				loaded = true;
				return 0;
			}
			else if (loaded) {
				if (Math.random() < 0.5) {
					loaded = false;
					return 1;
				}
				return 2;
			}
			else {
				if (Math.random() < 0.5) {
					loaded = true;
					return 0;
				}
				return 2;
			}
		}
	}
	
	public void hit(Object caller) {
		if (caller instanceof Duel) {
			this.hp = this.hp - 10;
		}
	}
}