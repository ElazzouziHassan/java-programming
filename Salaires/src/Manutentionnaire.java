public class Manutentionnaire extends Employe {

  private int nbHeures;

  public Manutentionnaire(String nom, String Prenom, int age, String dateEntree, int nbHeures){
    super(nom, Prenom, age, dateEntree);
    this.nbHeures = nbHeures;
  }

  @Override
  public double calculerSalaire() {
    return nbHeures * 65;
  }
}
