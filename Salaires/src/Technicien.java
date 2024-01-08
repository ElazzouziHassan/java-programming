public class Technicien extends Employe {
  
  protected int nbUnites;

  public Technicien(String nom, String Prenom, int age, String dateEntree, int nbUnites){
    super(nom, Prenom, age, dateEntree);
    this.nbUnites = nbUnites; 
  }

  @Override
  public double calculerSalaire() {
    return nbUnites * 5;
  } 
}
