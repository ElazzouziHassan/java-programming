class ManutARisque extends Manutentionnaire implements EmployeARisque {
    public ManutARisque(String nom, String prenom, int age, String dateEntree, int nombreHeures) {
        super(nom, prenom, age, dateEntree, nombreHeures);
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
