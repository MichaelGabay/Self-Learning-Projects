package oop_fundamentals.heroes_arena;

class Arena {
    
    public static void startDuel(GameCharacter p1, GameCharacter p2) {
        System.out.println("\n⚔️ --- BATTLE START: " + p1.name + " VS " + p2.name + " --- ⚔️");
        
        int round = 1;

        while (p1.isAlive() && p2.isAlive()) {
            System.out.println("\n--- Round " + round + " ---");
            System.out.println(p1);
            System.out.println(p2);
            System.out.println("---------------");

            performTurn(p1, p2);
            
            if (!p2.isAlive()) break;

            performTurn(p2, p1);

            round++;
            
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }

        System.out.println("\n🏆 --- GAME OVER --- 🏆");
        if (p1.isAlive()) {
            System.out.println("The winner is: " + p1.name + "!");
        } else {
            System.out.println("The winner is: " + p2.name + "!");
        }
    }

    private static void performTurn(GameCharacter attacker, GameCharacter defender) {
        if (attacker instanceof Healable && attacker.getHp() < 30) {
            System.out.println("⚠️ " + attacker.name + " is low on health!");
            
            Healable healer = (Healable) attacker;
            healer.heal();
        } else {
            attacker.attack(defender);
        }
    }
}
