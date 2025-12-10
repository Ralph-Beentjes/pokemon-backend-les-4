package Pokemon;

public class GrassPokemon extends Pokemon {
    private int special;
    private int defense;

    public GrassPokemon(String name, int level, int hp, int special, int defense) {
        super(name, level, hp);
        this.special = special;
        this.defense = defense;
    }

    public void leafStorm(){
        System.out.println(getName() + " uses leafStorm, it deals 70 damage and cleans the lawn");
    }

    public void scratch(){
        System.out.println(getName() + " is feisty and scratches with his claws");
    }

    @Override
    public void eats(){
        System.out.println(getName() + " eats a healthy salad");
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
