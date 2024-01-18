public class Salle {

    private int numero;
    private String nom;
    private int nombrePlaces;
    private static String typeSalle;

    public Salle(int numero, String nom, int nombrePlaces, String typeSalle) {
        this.numero = numero;
        this.nom = nom;
        this.nombrePlaces = nombrePlaces;
        this.typeSalle = typeSalle;
    }

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

    public int getNombrePlaces() {
        return nombrePlaces;
    }

    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    public static String getTypeSalle() {
        return typeSalle;
    }

    public void setTypeSalle(String typeSalle) {
        this.typeSalle = typeSalle;
    }

    @Override
    public String toString() {
      return "Salle{" 
        + "numero=" 
        + numero 
        + ", nom='" 
        + nom 
        + '\'' 
        + ", nombrePlaces=" 
        + nombrePlaces 
        + ", typeSalle=" 
        + typeSalle 
        + '}';
    }
  
    public static int getPrixPlace(String typeSalle) {
      switch (typeSalle) {
          case "concert":
              return 20;
          case "spectacle":
              return 15;
          case "congres":
              return 10;
          default:
              return 0;
      }
  }
}
