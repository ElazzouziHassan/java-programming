// public interface IAdminCinema {
//   public  void ajouterFilm(Film film);
//   public  void ajouterSalle(Salle salle);
//   public  void ajouterSeance(Film film, Salle salle, String date);
//   public  double consulterChiffreAffaire();
//   public  double consulterTauxRemplissage(Film film);
//   public  void chargerFilmsDepuisFichier(String fichier);
//   public  void serialiserDonneesCinema();
// }

interface IAdminCinema extends IVendeurCinema {
  void ajouterFilm(Film film);
  void ajouterSalle(Salle salle);
  void ajouterSeance(Seance seance);
  double consulterChiffreAffaire();
  double consulterTauxRemplissage(Film film);
  void chargerFilmsDepuisFichier(String nomFichier);
  void serialiserDonneesCinema(String nomFichier);
}