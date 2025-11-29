package oop_fundamentals.heroes_arena;

abstract class GameCharacter {
    protected String name;
    private int hp; 
    protected int power;
    protected Weapon weapon;

    public GameCharacter(String name, int hp, int power, Weapon weapon) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.weapon = weapon;
    }

    public int getHp() { return hp; }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public abstract void attack(GameCharacter target);

    @Override
    public String toString() {
        return name + " (HP: " + hp + ")";
    }
}