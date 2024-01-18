import java.util.Date;

class Seance {
  private Film film;
  private Salle salle;
  private Date dateProjection;
  private int placesVendues;

  public Seance(Film film, Salle salle, Date dateProjection) {
      this.film = film;
      this.salle = salle;
      this.dateProjection = dateProjection;
      this.placesVendues = 0;
  }

  // Getters and setters
  public Film getFilm() {
      return film;
  }

  public Salle getSalle() {
      return salle;
  }

  public Date getDateProjection() {
      return dateProjection;
  }

  public int getPlacesVendues() {
      return placesVendues;
  }

  public void vendrePlaces(int nombrePlaces) {
      if (nombrePlaces > salle.getNombrePlaces() - placesVendues) {
          System.out.println("Places insuffisantes");
      }
      placesVendues += nombrePlaces;
  }
}