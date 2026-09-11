public class Rogue {
    String name;
    double hp;
    double attack;
    double criticalChance;

    Rogue(String name, double hp, double attack, double criticalChance) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.criticalChance = criticalChance;
    }

    void attack(Target target) {
        int DamageType = Main.Physical;
        double raw = attack;

        if (Math.random() < criticalChance) {
            raw = raw * 2;
            System.out.println(" >>> criticalChance");

        }
        double dealt = target.CalculateDamage(raw, DamageType);
        target.takeDamage(dealt);


        System.out.println("   ");
        System.out.println("Attacker     : " + name);
        System.out.println("Damage Type  : " + DamageType);
        System.out.println("Raw Damage   : " + raw);
        System.out.println("Mitigation   : " + (raw - dealt));
        System.out.println("Final Damage : " + dealt);
        System.out.println("Target HP    : " + target.hp);


    }
}
