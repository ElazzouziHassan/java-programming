public class Film {

  private String titre;
  private String realisateur;

  public Film(String titre, String realisateur) {
      this.titre = titre;
      this.realisateur = realisateur;
  }

  public String getTitre() {
      return titre;
  }

  public void setTitre(String titre) {
      this.titre = titre;
  }

  public String getRealisateur() {
      return realisateur;
  }

  public void setRealisateur(String realisateur) {
      this.realisateur = realisateur;
  }

  @Override
  public String toString() {
    return 
      "Film{" 
      + "titre='" 
      + titre 
      + '\'' 
      + ", realisateur='" 
      + realisateur 
      + '\'' 
      +'}';
  }
}
