public abstract class Courrier {
  abstract protected double affranchirNormal();
  
  protected double poids;
  protected boolean express;
  protected String adresse;

  public Courrier(double poids, boolean express, String adresse) {
    this.poids = poids;
    this.express = express;
    this.adresse = adresse;
  }

  public double affranchir() {
    if (! valide())
    {
        return 0;
    }
    else
    {
        double total = affranchirNormal();
        if (express) {
            total *= 2;
        }
        return total;
    }
}

  private boolean valide() {
    return adresse.length() > 0;
  }

  @Override
  public String toString() {
      String s = "";
      if (!valide()){
          s+= "(Courrier  invalide)\n";
      }
      s+= "Poids : " + poids + "grammes\n";
      s+= "Express : " + (express ? "oui" : "non") + "\n";
      s+= "Destination : " + adresse + "\n";
      s+= "Prix : " + affranchir() + "CHF\n";
      return s;
  }

}
