package testForHEADSandHANDS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Сreature {
	private Random random = new Random();
	private boolean isAlive = true;
	private static int MAX_ATTACK = Integer.valueOf(30);
	private static int MAX_DEFENSE = Integer.valueOf(30);
	private int attack;
	private int defense;
	private int min_damage;
	private int max_damage;
	private int health;
	private int MAX_HEALTH;
	
	public Сreature(int attack, int defense, 
			int min_damage, int max_damage, int MAX_HEALTH) {
		this.attack = attack;
		this.defense = defense;
		this.min_damage = min_damage;
		this.max_damage = max_damage;
		this.health = MAX_HEALTH;
		this.MAX_HEALTH = MAX_HEALTH;
	}
	
	private int get_attack_modifier(Сreature enemyCreature) throws Exception {
		return getAttack() - enemyCreature.getDefence() + 1;
	}
	
	private List<Integer> rollTheDices(Сreature enemyCreature) throws Exception {
		int attack_modifier = get_attack_modifier(enemyCreature);
		List<Integer> rolledDices = new ArrayList<Integer>();
		for (int i = 1; i <= attack_modifier; i++ ) {
			int generatedint = random.nextInt(6) + 1;
			rolledDices.add(generatedint);
		}
		return rolledDices;
	}
	
	private boolean isSucces(Сreature enemyCreature) throws Exception {
		List<Integer> dices = rollTheDices(enemyCreature);
		Iterator<Integer> iter = dices.iterator();	
		while (iter.hasNext()) {
			if (iter.next() >= 5) {
				return true;
			}
		}
		return false;	
	}
	
	public void atack(Сreature enemyCreature) throws Exception {
		if (isSucces(enemyCreature)) {
			enemyCreature.unseccesfulDefense(getDamage());
		}	
	}
	
	public boolean unseccesfulDefense(int damage) {
		health = health - damage;
		if (health <= 0) {
			isAlive = false;
		} else {
			isAlive = true;
		}
		return isAlive;	
	}
	
	public int getAttack() throws Exception {
		if (this.attack > MAX_ATTACK) {
			throw new Exception("Атака не может быть больше 30. Что - то пошло не так");
		}
		else {
			return this.attack;
		}
	}
	
	public int getDefence() throws Exception {
		if (this.defense > MAX_DEFENSE) {
			throw new Exception("Защита не может быть больше 30. Что - то пошло не так");
		}
		else {
			return this.defense;
		} 
	}

	public int getDamage() {
		return random.nextInt(max_damage - min_damage) + min_damage;
	}
	
	public int getHealth() {
		return health;		
	}
	public int getMaxHealth() {
		return MAX_HEALTH;		
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
}
