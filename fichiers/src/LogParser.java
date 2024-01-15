import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LogParser {

    public static void parseAndCreateCsv(String filePath, String csvPath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath));
             FileWriter csvWriter = new FileWriter(csvPath)) {

            // Map pour stocker la somme des temps d'exécution et le nombre d'occurrences par méthode
            Map<String, Long> totalTimes = new HashMap<>();
            Map<String, Integer> methodCounts = new HashMap<>();

            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("DEBUG")) {
                    // Extrait les informations de la ligne de log
                    String[] parts = line.split(" --> ");
                    String[] methodInfo = parts[0].substring(parts[0].lastIndexOf(".") + 1).split("\\]\\[");
                    String methodName = methodInfo[1];
                    String key = methodInfo[0] + ";" + methodInfo[1] + ";" + methodName;

                    // Extrait le temps d'exécution
                    long executionTime = Long.parseLong(parts[1].substring(0, parts[1].length() - 2));

                    // Met à jour la somme des temps et le nombre d'occurrences
                    totalTimes.put(key, totalTimes.getOrDefault(key, 0L) + executionTime);
                    methodCounts.put(key, methodCounts.getOrDefault(key, 0) + 1);
                }
            }

            // Écrit les résultats dans le fichier CSV
            csvWriter.append("package;classe;méthode;temps exécution moyen\n");
            for (Map.Entry<String, Long> entry : totalTimes.entrySet()) {
                String[] methodInfo = entry.getKey().split(";");
                String packageName = methodInfo[0];
                String className = methodInfo[1];
                String methodName = methodInfo[2];
                int count = methodCounts.get(entry.getKey());
                long totalTime = entry.getValue();
                long averageTime = totalTime / count;

                csvWriter.append(packageName).append(";").append(className).append(";")
                        .append(methodName).append(";").append(Long.toString(averageTime)).append("\n");
            }
            csvWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Utilisation de l'exemple
        String logFilePath = "chemin/vers/le/fichier.log";
        String csvFilePath = "chemin/vers/le/fichier.csv";
        parseAndCreateCsv(logFilePath, csvFilePath);
    }
}
