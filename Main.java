
package techstore;

public class Main {
    public static void main(String[] args) {
        OrdinateurDeBureau pc = new OrdinateurDeBureau("PC Gamer", 2500.0, 1920.0,
                "Intel i7", 16, SystemeExploitation.Windows, 1000, "RTX 3060", "650W");

        OrdinateurPortable lp = new OrdinateurPortable("Laptop Pro", 3200.0, 2560.0,
                "Intel i9", 32, SystemeExploitation.Ubuntu, 512, "RTX 4060", 5000);

        Mobile m = new Mobile("Samsung S24", 3500.0, 1080.0,
                "Snapdragon", 8, SystemeExploitation.Android, 50, 12, 2, 4500);

        ComposantStockage c = new ComposantStockage("SSD", 120.0, 256);
        Peripheriques p = new Peripheriques("Souris", 40.0, "Bluetooth", "sans fil");

        System.out.println(pc);
        System.out.println(lp);
        System.out.println(m);
        System.out.println(c);
        System.out.println(p);

        System.out.println("Garantie PC : " + pc.garantirAppareil());
        System.out.println("Garantie laptop : " + lp.garantirAppareil());
        System.out.println("Garantie mobile : " + m.garantirAppareil());
        System.out.println("Garantie SSD : " + c.garantirAppareil());
    }
}