package Game1c;

public class ChillOgre extends BadOgre{
    @Override
    public void revenge(Knight knight){
        if(!getHungry()){
            knight.setEnergy(knight.getEnergy() + 10);
        }
    }
    @Override
    public String toString(){
        return "Chill orge is " + ((!getHungry())? "not " : "") + "hungry\n" + "\tenergy : " + getEnergy();
    }
}
