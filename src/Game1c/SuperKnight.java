package Game1c;

public class SuperKnight extends Knight{
    @Override
    public void attack(Ogre ogre){
        ogre.setEnergy(ogre.getEnergy() - 20);
        this.setEnergy(this.getEnergy() + 20);

        ogre.revenge(this);
    }
}
