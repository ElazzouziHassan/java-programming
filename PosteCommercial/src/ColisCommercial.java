class ColisCommercial extends Colis implements Commercial {

  public ColisCommercial(double poids, boolean express, String adresse, double volume) {
      super(poids, express, adresse, volume); 
  }

  public double affranchir() {
    double montant = super.affranchir();
    montant -= montant * deduction();
    return montant;
  }

  public double deduction() {
    return 0.15;
  }
  
  @Override
  public String toString() {
    String s = super.toString();
    s += " Colis commercial\n";
    return s;
  }
  
}