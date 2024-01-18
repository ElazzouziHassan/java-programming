public class Film {
  
  // les attributes de la classe :
  private String titre;
  private String realisateur;

  // constructor de la classe :
  public Film(String titre, String realisateur) {
    this.titre = titre;
    this.realisateur = realisateur;
  }

  // les methodes (getters et setters) :
  public String getTitre() {
    return this.titre;
  }

  public String getrealisateur() {
    return this.realisateur = realisateur;
  }

  public void setTitre(String titre){
    this.titre = titre;
  }

  public void setrealisateur(String realisateur){
    this.realisateur = realisateur;
  }

}
