import java.io.IOException;

interface IAdminCinema extends IVendeurCinema {
  void ajouterFilm(Film film);
  void ajouterSalle(Salle salle);
  void ajouterSeance(Seance seance);
  double consulterChiffreAffaire();
  double consulterTauxRemplissage(Film film);
  void chargerFilmsDepuisFichier(String nomFichier) throws IOException;
  void serialiserDonneesCinema(String nomFichier) throws IOException;
}