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
  public Film getFilm() {
    return film;
}

public void setFilm(Film film) {
    this.film = film;
}

public Salle getSalle() {
    return salle;
}

public void setSalle(Salle salle) {
    this.salle = salle;
}

public Date getDateProjection() {
    return dateProjection;
}

public void setDateProjection(Date dateProjection) {
    this.dateProjection = dateProjection;
}

public int getPlacesVendues() {
    return placesVendues;
}

public void setPlacesVendues(int placesVendues) {
    this.placesVendues = placesVendues;
}


  public void vendrePlaces(int nombrePlaces) {
      if (nombrePlaces > salle.getNbPlaces() - placesVendues) {
          System.out.println("Places insuffisantes");
      }
      placesVendues += nombrePlaces;
  }

  
}
