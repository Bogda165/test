package Game1a;
public class Ogre {
	private boolean hungry;
	private int energy;
	
	void revenge(Knight knight) {
		if (energy > knight.getEnergy())
			 knight.setEnergy((int) (0.9 * knight.energy));
	}

	void setHungry(boolean _hungry) {
		hungry = _hungry;
	}
	void setEnergy(int _energy) {
		energy = _energy;
	}

	boolean getHungry() {
		return hungry;
	}
	int getEnergy(){
		return energy;
	}

	@Override
	public String toString(){
		return "Orge is " + ((!hungry)? "not " : "") + "hungry\n" + "\tenergy : " + energy;
	}
}
