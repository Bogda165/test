package Game1c;
import java.lang.Math;
public class Game {
	static void clash(Ogre ogre, Knight knight) {
		knight.attack(ogre);
	}

	public static Ogre getOgre() {
		int type = (int)(Math.random() * 3) + 1;

		if (type == 1) {
			return new BadOgre();
		} else if (type == 2) {
			return new ChillOgre();
		} else {
			return new Ogre();
		}
	}
	public static Knight getKnight() {
		int type = (int)(Math.random() * 2) + 1;

		if (type == 1) {
			return new Knight();
		} else {
			return new SuperKnight();
		}
	}

	public static void createArrays(Knight[] k, Ogre[] o){
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
	}

	public static void createArraysRandom(Knight[] knights, Ogre[] ogres, int n){
		int energy_k;
		int energy_o;
		int tmp;

		for(int i = 0; i < n; i++){
			energy_k = (int)(Math.random() * 30) + 30;
			energy_o = (int)(Math.random() * 30) + 30;
			tmp = (int)(Math.random() * 2);

			knights[i] = getKnight();
			knights[i].setEnergy(energy_k);

			ogres[i] = getOgre();
			ogres[i].setEnergy(energy_o);

			if(tmp == 0){
				ogres[i].setHungry(true);
			}

		}
	}

	public static void main(String[] args) {
		int n = 200;
		Knight[] k = new Knight[n];
		Ogre[] o = new Ogre[n];

		//createArrays(k, o);
		createArraysRandom(k, o, n);

		for (int i = 0; i < n; i++) {
			clash(o[i], k[i]);
			System.out.println("R:" + (i + 1) + "--------------------------------------------\n\n");
			System.out.println(k[i] + " / " + o[i] + "\n");
			System.out.println("------------------------------------------------\n");
		}
	}
}
