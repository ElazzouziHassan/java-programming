abstract public class Employe {
  
  private String nom;
  private String prenom;
  private int age;
  private String dateEntree;

  public Employe(String nom, String prenom, int age, String dateEntree){
    this.nom = nom;
    this.prenom = prenom;
    this.age = age;
    this.dateEntree = dateEntree;
  }

  public abstract double calculerSalaire();

  public String getNom(){
    return "L'employe "+ prenom + " " + nom;
  }

}
