package Pokemon;

public class ElectricPokemon extends Pokemon{
    private int attack;
    private int accuracy;

    public ElectricPokemon(String name, int level, int hp, int attack, int accuracy) {
        super(name, level, hp);
        this.attack = attack;
        this.accuracy = accuracy;
    }

    public void thunderPunch(){
        System.out.println(getName() + " used thunder punch, ka-pow! That's 60 points of damage");
    }

    public void electroBall(){
        System.out.println(getName() + " rolls up and uses electroBall, for 50 points of damage");
    }

    @Override
    public void eats(){
        System.out.println(getName() + " eats a package of batteries");
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
