import java.util.Random;

class Mage extends GameCharacter implements Healable {

    public Mage(String name, Weapon weapon) {
        super(name, 100, 20, weapon);
    }

    @Override
    public void attack(GameCharacter target) {
        Random rand = new Random();
        int chance = rand.nextInt(100); 

        int totalDamage;
        if (chance < 20) { 
            System.out.println(this.name + " tried to cast a spell but slipped!");
            return; 
        } else if (chance > 80) {
            // 20% סיכוי למכה קריטית (נזק כפול)
            totalDamage = (this.power + this.weapon.getDamage()) * 2;
            System.out.println("✨ CRITICAL HIT! " + this.name + " blasts generic magic!");
        } else {
            // מכה רגילה
            totalDamage = this.power + this.weapon.getDamage();
            System.out.println(this.name + " casts a fireball with " + this.weapon.getName());
        }

        target.setHp(target.getHp() - totalDamage);
        System.out.println("   > Dealt " + totalDamage + " damage to " + target.name);
    }

    @Override
    public void heal() {
        Random rand = new Random();
        int healAmount = rand.nextInt(10) + 15;

        this.setHp(this.getHp() + healAmount);
        System.out.println("💚 " + this.name + " used a healing potion! (+ " + healAmount + " HP)");
    }
}