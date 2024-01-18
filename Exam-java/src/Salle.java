public class Salle {

  // les attributes prive de la classe :
  private int numero;
    private String nom;
    private int nbPlaces;
    private String type;
    private double prix;

  // constructor du la classe :
  public Salle(int numero, String nom, int capacite, double prix) {
    this.numero = numero;
    this.nom = nom;
    this.nbPlaces = nbPlaces;
    this.prix = prix;
  }

  // les methodes ( getters et setters) :
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getNbPlaces() {
    return nbPlaces;
  }

  public void setNbPlaces(int nbPlaces) {
    this.nbPlaces = nbPlaces;
  }

  public double getPrix() {
    return this.prix = prix;
  }

  public void setPrix(double prix) {
    this.prix = prix;
  }

  // la methode afficher qui permet d'afficher les details d'une salle :
  public void afficher() {
    System.out.println("Salle numéro " + numero + " : " + nom + ", Nombre des places : " + nbPlaces + ", prix : " + prix);
  }
}