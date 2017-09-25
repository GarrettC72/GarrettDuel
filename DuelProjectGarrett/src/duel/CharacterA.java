package duel;

public class CharacterA implements Dueler{

	private int hp;
	private boolean loaded;
	private boolean round = false;

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