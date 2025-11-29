package oop_fundamentals.heroes_arena;

public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Excalibur", 10);
        Weapon staff = new Weapon("Ancient Staff", 10);

        GameCharacter hero = new Warrior("Conan", sword);
        GameCharacter villain = new Mage("Saruman", staff);

        Arena.startDuel(hero, villain);
    }
}