package Game1c;
import java.lang.Math;


public class Game {
	static void clash(Ogre ogre, Knight knight) {
		knight.attack(ogre);
	}

	public static void main(String[] args) {
		Knight[] k = new Knight[200];
		Ogre[] o = new Ogre[200];
		int energy_k;
		int energy_o;

		for (int i = 0; i < 20; i++) {
			k[i] = new Knight();
			energy_k = (int)(Math.random() * 30) + 30;
			energy_o = (int)(Math.random() * 30) + 30;
			k[i].setEnergy(energy_k);
			o[i] = new BadOgre();
			o[i].setEnergy(energy_o);
			o[i].setHungry(true);
		}

		for (int i = 20; i < 40; i++) {
			energy_k = (int)(Math.random() * 30) + 30;
			energy_o = (int)(Math.random() * 30) + 30;
			k[i] = new Knight();
			k[i].setEnergy(energy_k);
			o[i] = new BadOgre();
			o[i].setEnergy(energy_o);
		}

		for (int i = 40; i < 100; i++) {
			energy_k = (int)(Math.random() * 30) + 30;
			energy_o = (int)(Math.random() * 30) + 30;
			k[i] = new Knight();
			k[i].setEnergy(energy_k);
			o[i] = new ChillOgre();
			o[i].setEnergy(energy_o);
		}

		for (int i = 100; i < 120; i++) {
			energy_k = (int)(Math.random() * 30) + 30;
			energy_o = (int)(Math.random() * 30) + 30;
			k[i] = new SuperKnight();
			k[i].setEnergy(energy_k);
			o[i] = new BadOgre();
			o[i].setEnergy(energy_o);
			o[i].setHungry(true);
		}

		for (int i = 120; i < 140; i++) {
			energy_k = (int)(Math.random() * 30) + 30;
			energy_o = (int)(Math.random() * 30) + 30;
			k[i] = new SuperKnight();
			k[i].setEnergy(energy_k);
			o[i] = new BadOgre();
			o[i].setEnergy(energy_o);
		}

		for (int i = 140; i < 200; i++) {
			energy_k = (int)(Math.random() * 30) + 30;
			energy_o = (int)(Math.random() * 30) + 30;
			k[i] = new SuperKnight();
			k[i].setEnergy(energy_k);
			o[i] = new ChillOgre();
			o[i].setEnergy(energy_o);
		}

		for (int i = 0; i < 200; i++) {
			clash(o[i], k[i]);
			
			System.out.println(i + ":"
					+ "knight " + k[i].getEnergy() + " / "
					+ "ogre " + o[i].getEnergy());
		}
	}
}
