package Game1a;
public class Game {
	static void clash(Ogre ogre, Knight knight) {
		knight.attack(ogre);
	}
	static void printStats(Ogre ogre, Knight knight){
		System.out.println(ogre.toString());
		System.out.println(knight.toString());
	}
	public static void main(String[] args) {
		Knight knight = new Knight();
		Ogre ogre = new Ogre();

		ogre.setEnergy(100);
		ogre.setHungry(true);

		knight.setEnergy(120);

		printStats(ogre, knight);

		clash(ogre, knight);

		printStats(ogre, knight);

	}
}
