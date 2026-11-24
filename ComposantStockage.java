package techstore;

public class ComposantStockage extends Article implements Garantissable {
    private int capacite;

    // Constructeur  initialise les attributs d'Article et capacite
    public ComposantStockage(String nom, double prix, int capacite) {
        super(nom, prix);
        this.capacite = capacite;
    }

    //  Garantie
    @Override
    public int garantirAppareil() {
        if (capacite <= 500) {
            return 1;
        } else {
            return 2;
        }
    }

    
    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    
    @Override
    public String toString() {
        return super.toString() + ", capacite=" + capacite;
    }
}