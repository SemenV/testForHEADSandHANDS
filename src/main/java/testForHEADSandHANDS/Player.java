package testForHEADSandHANDS;

public class Player extends Сreature {
	
	private int healAmount = 4;

	public Player(int attack, int defense, int min_damage, int max_damage, int MAX_HEALTH) {
		super(attack, defense,  min_damage, max_damage, MAX_HEALTH);
	}
	
	public void heal() throws Exception {
		this.healAmount -= 1;
		if (healAmount > 0) {
			this.setHealth((int) (this.getMaxHealth() * 0.3));
		} else {
			throw new Exception("Все 4 защиты были исчерпаны");
		}
	}

}
