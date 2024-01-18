import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            // Création d'un nouvel objet Cinema
            Cinema cinema = new Cinema();

            // Charger les films à partir d'un fichier texte
            cinema.chargerFilmsDepuisFichier("src\\cinema.txt");

            // Ajouter une nouvelle séance concernant le film « X3D » dans la salle 4
            Film filmX3D = cinema.consulterFilm("X3D");
            Salle salle4 = cinema.consulterSalle(4);
            Seance seanceX3D = new Seance(filmX3D, salle4, new Date());
            cinema.ajouterSeance(seanceX3D);

            // Consulter le taux de remplissage pour le film « X3D »
            double tauxRemplissageX3D = cinema.consulterTauxRemplissage(filmX3D);
            System.out.println("Taux de remplissage pour X3D : " + tauxRemplissageX3D + "%");

            // Consulter le chiffre d'affaire
            double chiffreAffaire = cinema.consulterChiffreAffaire();
            System.out.println("Chiffre d'affaire : " + chiffreAffaire + " DH");

            // Ajouter un nouveau film
            Film nouveauFilm = new Film("Nouveau Film", "Nouveau Realisateur");
            cinema.ajouterFilm(nouveauFilm);

            // Ajouter une nouvelle salle
            Salle nouvelleSalle = new SalleNormale(5, "Salle Nouvelle", 150, null);
            cinema.ajouterSalle(nouvelleSalle);

            // Sérialiser les données du cinéma
            cinema.serialiserDonneesCinema("src\\cinema1.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
