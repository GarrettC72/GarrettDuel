package duel;

<<<<<<< HEAD
public class CharacterA implements Dueler {
=======
public class CharacterA implements Dueler{
	private int hp;
>>>>>>> branch 'master' of https://github.com/GarrettC72/GarrettDuel.git
	
<<<<<<< HEAD
	private int hp;
	
=======
>>>>>>> branch 'master' of https://github.com/GarrettC72/GarrettDuel.git
	public CharacterA() {
		
	}
	
	public String getName() {
		return "Frederick";
	}
	
	public void taunt() {
<<<<<<< HEAD
		System.out.println("Come at me, bro! Git Good");
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
=======
		System.out.println("Pick a god and pray");
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		
>>>>>>> branch 'master' of https://github.com/GarrettC72/GarrettDuel.git
	}
}