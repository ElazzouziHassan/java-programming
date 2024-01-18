import java.util.List;

interface IUserCinema {
  Film consulterFilm(String titre);
  Salle consulterSalle(int numero);
  List<Film> consulterFilmsSeancesProgrammees();
  void acheterPlace(Seance seance, int nombrePlaces);
}