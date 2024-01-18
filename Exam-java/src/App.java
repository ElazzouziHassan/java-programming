import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            // a. Créer un nouvel objet Cinema
            Cinema cinema = new Cinema();

            // b. Charger les films à partir d'un fichier texte
            cinema.chargerFilmsDepuisFichier("cinema.txt");

            // e. Ajouter une nouvelle séance concernant le film « X3D » dans la salle 4
            Film filmX3D = cinema.consulterFilm("X3D");
            Salle salle4 = cinema.consulterSalle(4);
            Seance nouvelleSeance = new Seance(filmX3D, salle4, new Date());
            cinema.ajouterSeance(nouvelleSeance);

            // g. Consulter le taux de remplissage pour le film « X3D »
            double tauxRemplissageX3D = cinema.consulterTauxRemplissage(filmX3D);
            System.out.println("Taux de remplissage pour X3D : " + tauxRemplissageX3D);

            // f. Consulter le chiffre d'affaires
            double chiffreAffaires = cinema.consulterChiffreAffaire();
            System.out.println("Chiffre d'affaires : " + chiffreAffaires);

            // c. Ajouter un nouveau film
            Film nouveauFilm = new Film("NouveauFilm", "RealisateurNouveau");
            cinema.ajouterFilm(nouveauFilm);

            // d. Ajouter une nouvelle salle
            Salle nouvelleSalle = new SalleNormale(5, "Salle5", 150);
            cinema.ajouterSalle(nouvelleSalle);

            // h. Sérialiser les données du cinéma
            cinema.serialiserDonneesCinema("donnees_cinema.ser");
        } catch (IOException e) {
            ((Throwable) e).printStackTrace();
        }
    }
}
