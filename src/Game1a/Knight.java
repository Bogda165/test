package Game1a;
public class Knight {
	int energy;

	void setEnergy(int _energy){
		energy = _energy;
	}
	int getEnergy(){
		return energy;
	}
	@Override
	public String toString(){
		return "Knight has " + energy + " energy";
	}
	void attack(Ogre ogre) {
		ogre.setEnergy((int) (0.9 * ogre.getEnergy())); // (int) just casts a float result into an int
		ogre.revenge(this); // this represents a reference to the current knight object
	}
}
