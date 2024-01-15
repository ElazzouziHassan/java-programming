class Publicite extends Courrier implements Commercial {

  public Publicite(double poids, boolean express, String adresse){
      super(poids, express, adresse);
  }

  protected double affranchirNormal() {
      return poids/1000.0 * 5.0;
  }

  @Override
  public String toString() {
    String s = "Publicité\n";
    s += super.toString();
    return s;
  }
  
  public double deduction() {
    return 0.2;
  }

  @Override
  public double affranchir(){
    double montant = super.affranchir();
    montant -= montant * deduction();
    return montant;
  }
  
}
