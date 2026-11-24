package techstore;

public abstract class AppareilInformatique extends Article implements Garantissable {
    private double resolutionEcran;
    private String processeur;
    private long ram;
    private SystemeExploitation systemeExploitation;

    public AppareilInformatique(String nom, double prix,
                                double resolutionEcran,
                                String processeur,
                                long ram,
                                SystemeExploitation systemeExploitation) {
        super(nom, prix);
        this.resolutionEcran = resolutionEcran;
        this.processeur = processeur;
        this.ram = ram;
        this.systemeExploitation = systemeExploitation;
    }

    // Méthode abstraite (point 3)
    @Override
    public abstract int garantirAppareil();

    // Getters
    public double getResolutionEcran() { return resolutionEcran; }
    public String getProcesseur() { return processeur; }
    public long getRam() { return ram; }
    public SystemeExploitation getSystemeExploitation() { return systemeExploitation; }

    // Setters
    public void setResolutionEcran(double resolutionEcran) { this.resolutionEcran = resolutionEcran; }
    public void setProcesseur(String processeur) { this.processeur = processeur; }
    public void setRam(long ram) { this.ram = ram; }
    public void setSystemeExploitation(SystemeExploitation systemeExploitation) {
        this.systemeExploitation = systemeExploitation;
    }

    // toString (point 4)
    @Override
    public String toString() {
        return super.toString()
                + ", resolutionEcran=" + resolutionEcran
                + ", processeur=" + processeur
                + ", ram=" + ram
                + ", systemeExploitation=" + systemeExploitation;
    }
}