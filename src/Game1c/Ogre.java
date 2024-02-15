package Game1c;

public class Ogre {
	private boolean hungry;
	private int energy;
	public void revenge(Knight knight) {
		if (energy > knight.getEnergy())
			knight.setEnergy((int) (0.9 * knight.getEnergy()));
	}

	public void setHungry(boolean _hungry) {
		hungry = _hungry;
	}
	public void setEnergy(int _energy) {
		energy = _energy;
	}

	public boolean getHungry() {
		return hungry;
	}
	public int getEnergy(){
		return energy;
	}

	@Override
	public String toString(){
		return "Orge is " + ((!hungry)? "not " : "") + "hungry\n" + "\tenergy : " + energy;
	}
}
