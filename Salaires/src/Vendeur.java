class Vendeur extends Employe {

  private double chiffreAffaire;

  public Vendeur(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
    super(nom, prenom, age, dateEntree);
    this.chiffreAffaire = chiffreAffaire;
  }

  @Override
  public double calculerSalaire() {
    return 0.2 * chiffreAffaire + 400;
  }
  
}
