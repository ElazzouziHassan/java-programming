class TechnARisque extends Technicien implements EmployeARisque {
    public TechnARisque(String nom, String prenom, int age, String dateEntree, int nombreUnites) {
        super(nom, prenom, age, dateEntree, nombreUnites);
    }

    @Override
    public double calculerPrime() {
        return PRIME_RISQUE;
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + calculerPrime();
    }
}
