package testForHEADSandHANDS;

public class Monster extends Сreature {
	private String name;
	
	public Monster(int attack, int defense, int min_damage, int max_damage, int MAX_HEALTH, String name) {
		super(attack, defense, min_damage, max_damage, MAX_HEALTH);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
