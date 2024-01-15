class Colis extends Courrier {

  protected double volume;

  public Colis(double poids, boolean express, String adresse, double volume) {
      super(poids, express, adresse);
      this.volume = volume;
  }

  protected double affranchirNormal() {
    return 0.25 * volume + poids/1000.0;
  }

  public boolean valide(){
    return (super.valide() && volume <= 50);
  }
  
  @Override
  public String toString() {
    String s = "Colis\n";
    s += super.toString();
    s += "Volume : " + volume + " litres\n";
    return s;
  }

}