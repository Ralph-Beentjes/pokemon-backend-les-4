package Pokemon;

public class WaterPokemon extends Pokemon{
    private int special;
    private int accuracy;

    public WaterPokemon(String name, int level, int hp, int special, int accuracy) {
        super(name, level, hp);
        this.special = special;
        this.accuracy = accuracy;
    }

    public void hydroPump(){
        System.out.println(getName() + " used hydropump, it deals 80 damage");
    }

    public void waterGun(){
        System.out.println(getName() + " uses water gun, it deals 40 bubbly damage");
    }

    @Override
    public void eats(){
        System.out.println(getName() + " eats a watery meal with lettuce");
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
