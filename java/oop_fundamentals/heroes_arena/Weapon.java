package oop_fundamentals.heroes_arena;

class Weapon {
    private String name;
    private int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public int getDamage() { return damage; }
    public String getName() { return name; }
}