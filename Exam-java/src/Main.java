public class Main {
  public static void main(String[] args) {
    
    // Exemple d'utilisation du Cinema
    Cinema cinema = new Cinema();

    // Ajouter des salles, films et séances
    Film titanic = new Film("Titanic", "James Cameron");
    Film inception = new Film("Inception", "Christopher Nolan");
    Film avengers = new Film("Avengers", "Joss Whedon");

    Salle salle1 = new Salle(1, "Salle 1", 100, "normale");
    Salle salle2 = new Salle(2, "Salle 2", 80, "normale");
    Salle salleVIP = new Salle(3, "Salle VIP", 50, "VIP");

    Seance seance1 = new Seance(titanic, salle1, "2024-01-15");
    Seance seance2 = new Seance(inception, salle2, "2024-01-16");
    Seance seance3 = new Seance(avengers, salleVIP, "2024-01-17");

    cinema.ajouterSalle(salle1);
    cinema.ajouterSalle(salle2);
    cinema.ajouterSalle(salleVIP);

    cinema.ajouterFilm(titanic);
    cinema.ajouterFilm(inception);
    cinema.ajouterFilm(avengers);

    cinema.ajouterSeance(titanic, salle1, "2024-01-15");
    cinema.ajouterSeance(inception, salle2, "2024-01-16");
    cinema.ajouterSeance(avengers, salleVIP, "2024-01-17");

      
    // Utilisateur
    cinema.consulterFilm("Titanic");
    cinema.consulterSalle(1);
    cinema.consulterFilmsSeancesProgrammees();
    cinema.acheterPlace(inception, 2);

    // Vendeur
    cinema.vendrePlaces(inception, 3);

    // Admin
    cinema.ajouterFilm(new Film("Spider-Man", "Sam Raimi"));
    cinema.ajouterSalle(new Salle(4, "Salle 4", 120, "normale"));
    cinema.ajouterSeance(new Film("Spider-Man", "Sam Raimi"), nSalle(4, "Salle 4", 120, "normale"), "2024-01-18");
    cinema.chargerFilmsDepuisFichier("cinema.txt");
    cinema.serialiserDonneesCinema();
      
  }

  private static Salle nSalle(int numero, String nom, int nombrePlaces, String typeSalle){
    return new Salle(numero, nom, nombrePlaces, typeSalle);
  }
 
}
