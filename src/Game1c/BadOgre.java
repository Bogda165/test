package Game1c;

public class BadOgre extends Ogre {
	@Override
	public void revenge(Knight knight) {
		if (getHungry())
			eat(knight);
	}

	void eat(Knight knight) {
		knight.setEnergy(0);
	}

	@Override
	public String toString(){
		return "Bad orge is " + ((!getHungry())? "not " : "") + "hungry\n" + "\tenergy : " + getEnergy();
	}

}


