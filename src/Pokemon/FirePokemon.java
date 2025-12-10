package Pokemon;

public class FirePokemon extends Pokemon {
    private int special;
    private int attack;

    public FirePokemon(String name, int level, int hp, int special, int attack) {
        super(name, level, hp);
        this.special = special;
        this.attack = attack;
    }

    public void flameThrower(){
        System.out.println(getName() + " uses flamethrower, it deals 60 fiery damage");
    }

    public void fireLash(){
        System.out.println(getName() + " channels his inner Indiana Jones and uses firelash, it deals 40 damage");
    }

    @Override
    public void eats(){
        System.out.println(getName() + " eats a spicy meal");
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
