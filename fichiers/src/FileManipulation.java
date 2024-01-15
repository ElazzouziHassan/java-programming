import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

public class FileManipulation {

    // Méthode pour afficher les fichiers et répertoires d'un répertoire
    public static void printFiles(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Le répertoire spécifié n'existe pas.");
        }
    }

    // Méthode pour calculer la taille totale des fichiers d'un répertoire
    public static long totalSizeOfFiles(String directoryPath) {
        File directory = new File(directoryPath);
        long totalSize = 0;
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        totalSize += file.length();
                    }
                }
            }
        } else {
            System.out.println("Le répertoire spécifié n'existe pas.");
        }
        return totalSize;
    }

    // Méthode pour trouver le fichier ou répertoire le plus récemment utilisé
    public static File mostRecentFile(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        if (files != null && files.length > 0) {
            Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
            return files[0];
        }
        return null;
    }

    // Méthode pour filtrer et afficher les fichiers et répertoires dont le nom commence par une certaine chaîne
    public static void printFilesWithPrefix(String directoryPath, String prefix) {
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] filteredFiles = directory.listFiles(new StartsWithFilter(prefix));
            if (filteredFiles != null) {
                for (File file : filteredFiles) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("Le répertoire spécifié n'existe pas.");
        }
    }

    // Classe pour filtrer les fichiers en fonction du préfixe
    static class StartsWithFilter implements FilenameFilter {
        private final String prefix;

        public StartsWithFilter(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public boolean accept(File dir, String name) {
            return name.startsWith(prefix);
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        String directoryPath = "Chemin/vers/le/repertoire";
        System.out.println("Liste des fichiers et répertoires :");
        printFiles(directoryPath);

        System.out.println("\nTaille totale des fichiers : " + totalSizeOfFiles(directoryPath) + " octets");

        File recentFile = mostRecentFile(directoryPath);
        System.out.println("\nLe fichier ou répertoire le plus récemment utilisé : " + (recentFile != null ? recentFile.getName() : "Aucun"));

        String prefix = "prefix";
        System.out.println("\nListe des fichiers et répertoires commençant par '" + prefix + "' :");
        printFilesWithPrefix(directoryPath, prefix);
    }
}
