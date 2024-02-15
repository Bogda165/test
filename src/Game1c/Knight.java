package Game1c;

public class Knight {
	private int energy;

	public void setEnergy(int _energy){
		energy = _energy;
	}
	public int getEnergy(){
		return energy;
	}
	public void attack(Ogre ogre) {
		ogre.setEnergy((int) (0.9 * ogre.getEnergy())); // (int) just casts a float result into an int
		//System.out.println(this); // We see different ids each time because each loop we create a new objects.
		ogre.revenge(this); // this represents a reference to the current knight object
	}

	@Override
	public String toString(){
		return "Knight has " + energy + " energy";
	}
}
