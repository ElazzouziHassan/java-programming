import java.io.*;
import java.util.*;

class Cinema implements IAdminCinema {
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
        // Implémentation de la consultation d'un film
        return null;
    }

    @Override
    public Salle consulterSalle(int numero) {
        // Implémentation de la consultation d'une salle
        return null;
    }

    @Override
    public List<Film> consulterFilmsSeancesProgrammees() {
        // Implémentation de la consultation des films des séances programmées
        return null;
    }

    @Override
    public void acheterPlace(Seance seance, int nombrePlaces) {
        // Implémentation de l'achat de places
    }

    @Override
    public void vendrePlaces(Seance seance, int nombrePlaces) {
        // Implémentation de la vente de places
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
        // Implémentation de la consultation du taux de remplissage
        return 0.0;
    }

    @Override
    public void chargerFilmsDepuisFichier(String nomFichier){
        BufferedReader reader;
        try {
          reader = new BufferedReader(new FileReader(nomFichier));
        } catch (FileNotFoundException e) {
          System.out.println("error!");
        }
        String line;
        try {
          while ((line = reader.readLine()) != null) {
              String[] parts = line.split(";");
              if (parts.length == 2) {
                  Film film = new Film(parts[0].trim(), parts[1].trim());
                  ajouterFilm(film);
              }
          }
        } catch (IOException e) {
          System.out.println("error!");
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
