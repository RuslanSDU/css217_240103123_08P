public class Target {
    String name;
    double hp;
    String type;

    Target(String name,double hp,String type) {
        this.name = name;
        this.hp = hp;
        this.type = type;
    }
    double CalculateDamage(double raw, int DamageType){
            double result = raw;
            if(type.equals("dummy")) {
                result = raw - 5;
            }
            if(type.equals("wisp")) {
                if(DamageType == Main.Physical) {
                    result = raw * 0.25;
                }
                else {
                    result = raw * 1.5;
                }
            }
            if (result < 0) {
                result = 0;
            }
            return result;
            }
            void takeDamage(double amount){
        hp = hp - amount;
        if (hp < 0) {
            hp = 0;
        }
    }
}
