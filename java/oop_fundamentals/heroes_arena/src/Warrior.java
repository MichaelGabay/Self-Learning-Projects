class Warrior extends GameCharacter {

    public Warrior(String name, Weapon weapon) {
        super(name, 150, 10, weapon);
    }

    @Override
    public void attack(GameCharacter target) {
        int totalDamage = this.power + this.weapon.getDamage();
        
        System.out.println(this.name + " swings " + this.weapon.getName() + " with fury!");
        
        target.setHp(target.getHp() - totalDamage);
        System.out.println("   > Dealt " + totalDamage + " damage to " + target.name);
    }
}