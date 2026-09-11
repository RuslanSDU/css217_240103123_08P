public class Main {
    static int Physical = 0;
    static int Fire = 1;
    static int Frost = 2;

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Warrior",150,25);
        Mage mage = new Mage("Mage",90,35,Fire);
        Rogue rogue = new Rogue("Rogue",110,20,0.3);


        System.out.println("Warrior");
        Target dummy1 = new Target("Armored Dummy",200,"dummy");
        Target wisp1 = new Target("Etheresal Wisp",120,"wisp");
        warrior.attack(dummy1);
        warrior.attack(wisp1);

        System.out.println("Mage");
        Target dummy2 = new Target("Armored Dummy",200,"dummy");
        Target wisp2 = new Target("Etheresal Wisp",120,"wisp");
        mage.attack(dummy2);
        mage.attack(wisp2);

        System.out.println("Rogue");
        Target dummy3 = new Target("Armored Dummy",200,"dummy");
        Target wisp3 = new Target("Etheresal Wisp",120,"wisp");
        rogue.attack(dummy3);
        rogue.attack(wisp3);
    }
}
