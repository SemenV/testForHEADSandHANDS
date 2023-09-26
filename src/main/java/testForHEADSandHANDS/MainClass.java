package testForHEADSandHANDS;

public class MainClass {
	
	public static void main(String... args) throws Exception{
		
		Monster monster = new Monster(3, 5, 3, 6, 50, "monster");
		Player player = new Player(5, 3, 1, 6, 80);
		for (int i = 0; i < 10; i ++) {
			System.out.println("---------------------------------");
			System.out.println("Player такует Monter");
			player.atack(monster);
			System.out.println("Здоровье Monster: " + monster.getHealth());
			System.out.println("Здоровье Player: " + player.getHealth());
			
			System.out.println("---------------------------------");
			System.out.println("Monter такует Player");
			monster.atack(player);
			System.out.println("Здоровье Monster: " + monster.getHealth());
			System.out.println("Здоровье Player: " + player.getHealth());
		
		}
	}

}
