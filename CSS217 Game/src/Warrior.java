public class Warrior {
    String name;
    double hp;
    double attack;

    Warrior(String name,double hp,double attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    void attack(Target target) {
        int DamageType = Main.Physical;
        double raw = attack;

        double dealt = target.CalculateDamage(raw,DamageType);
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
