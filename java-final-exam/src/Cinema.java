import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class Cinema implements IUserCinema, IVendeurCinema, IAdminCinema {
  private List<Salle> salles;
  private List<Film> films;
  private List<Seance> seances;
  private double chiffreAffaire;

  public Cinema() {
      salles = new ArrayList<>();
      films = new ArrayList<>();
      seances = new ArrayList<>();
      chiffreAffaire = 0;
  }

  @Override
  public Film consulterFilm(String titre) {
      for (Film film : films) {
          if (film.getTitre().equals(titre)) {
              return film;
          }
      }
      return null;
  }

  @Override
  public Salle consulterSalle(int numero) {
      for (Salle salle : salles) {
          if (salle.getNumero() == numero) {
              return salle;
          }
      }
      return null;
  }

  @Override
  public List<Film> consulterFilmsSeancesProgrammees() {
      List<Film> filmsProgrammes = new ArrayList<>();
      for (Seance seance : seances) {
          filmsProgrammes.add(seance.getFilm());
      }
      return filmsProgrammes;
  }

  @Override
  public void acheterPlace(Seance seance, int nombrePlaces){
      seance.vendrePlaces(nombrePlaces);
      chiffreAffaire += nombrePlaces * seance.getSalle().getPrixPlace(null);
  }

  @Override
  public void vendrePlaces(Seance seance, int nombrePlaces){
      seance.vendrePlaces(nombrePlaces);
      chiffreAffaire += nombrePlaces * seance.getSalle().getPrixPlace(null);
  }

  @Override
  public void ajouterFilm(Film film) {
      films.add(film);
  }

  @Override
  public void ajouterSalle(Salle salle) {
      salles.add(salle);
  }

  @Override
  public void ajouterSeance(Seance seance) {
      seances.add(seance);
  }

  @Override
  public double consulterChiffreAffaire() {
      return chiffreAffaire;
  }

  @Override
public double consulterTauxRemplissage(Film film) {
    int placesTotales = 0;
    int placesVendues = 0;

    for (Seance seance : seances) {
        Film seanceFilm = seance.getFilm();
        // Vérifier si le film de la séance est null
        if (seanceFilm != null && seanceFilm.equals(film)) {
            placesTotales += seance.getSalle().getNombrePlaces();
            placesVendues += seance.getPlacesVendues();
        }
    }

    return (placesTotales != 0) ? (double) placesVendues / placesTotales * 100 : 0.0;
}

  @Override
  public void chargerFilmsDepuisFichier(String nomFichier) throws IOException {
      BufferedReader reader = new BufferedReader(new FileReader(nomFichier));
      String line;
      while ((line = reader.readLine()) != null) {
          String[] parts = line.split(";");
          if (parts.length == 2) {
              Film film = new Film(parts[0].trim(), parts[1].trim());
              ajouterFilm(film);
          }
      }
      reader.close();
  }

  @Override
  public void serialiserDonneesCinema(String nomFichier) throws IOException {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFichier));
      oos.writeObject(this);
      oos.close();
  }

}