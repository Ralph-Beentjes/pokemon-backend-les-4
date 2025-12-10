package Main;

import Pokemon.ElectricPokemon;
import Pokemon.FirePokemon;
import Pokemon.GrassPokemon;
import Pokemon.WaterPokemon;

public class Main {
    public static void main(String[] args) {
        FirePokemon charmander = new FirePokemon("Charmander", 5, 100, 25, 30);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 7, 120, 30, 40);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 6, 110, 28, 35);
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 8, 130, 35, 45);

        pikachu.setAttack(40);
        System.out.println(pikachu.getAttack());

        charmander.eats();
        charmander.fireLash();

        squirtle.waterGun();
        squirtle.speaks();

        bulbasaur.eats();
        bulbasaur.leafStorm();

        pikachu.speaks();
        pikachu.thunderPunch();
    }
}
