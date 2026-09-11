public class Mage {
    String name;
    double hp;
    double attack;
    int element;

    Mage(String name,double hp,double attack,int element) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.element = element;
    }
        void attack(Target target) {
        int DamageType = element;
        double raw = attack;

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
