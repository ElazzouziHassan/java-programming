import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class ConfigurationParser {

    public static Configuration parse(String file) {
        Yaml yaml = new Yaml();
        try (FileReader reader = new FileReader(file)) {
            Map<String, Map<String, String>> data = yaml.load(reader);
            return createConfiguration(data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Configuration createConfiguration(Map<String, Map<String, String>> data) {
        Configuration configuration = new Configuration();
        if (data.containsKey("database")) {
            configuration.database = new DatabaseConfiguration(
                    data.get("database").get("host"),
                    data.get("database").get("user"),
                    data.get("database").get("password")
            );
        }
        if (data.containsKey("log")) {
            configuration.log = new LogConfiguration(
                    data.get("log").get("file"),
                    data.get("log").get("level")
            );
        }
        if (data.containsKey("security")) {
            configuration.security = new SecurityConfiguration(
                    data.get("security").get("cipher"),
                    data.get("security").get("algo")
            );
        }
        return configuration;
    }

    public static class Configuration {
        public DatabaseConfiguration database;
        public LogConfiguration log;
        public SecurityConfiguration security;
    }

    public static class DatabaseConfiguration {
        public String host;
        public String user;
        public String password;

        public DatabaseConfiguration(String host, String user, String password) {
            this.host = host;
            this.user = user;
            this.password = password;
        }
    }

    public static class LogConfiguration {
        public String file;
        public String level;

        public LogConfiguration(String file, String level) {
            this.file = file;
            this.level = level;
        }
    }

    public static class SecurityConfiguration {
        public String cipher;
        public String algo;

        public SecurityConfiguration(String cipher, String algo) {
            this.cipher = cipher;
            this.algo = algo;
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        String filePath = "chemin/vers/le/fichier.yaml";
        Configuration configuration = parse(filePath);

        if (configuration != null) {
            System.out.println("Database Configuration:");
            System.out.println("Host: " + configuration.database.host);
            System.out.println("User: " + configuration.database.user);
            System.out.println("Password: " + configuration.database.password);

            System.out.println("\nLog Configuration:");
            System.out.println("File: " + configuration.log.file);
            System.out.println("Level: " + configuration.log.level);

            System.out.println("\nSecurity Configuration:");
            System.out.println("Cipher: " + configuration.security.cipher);
            System.out.println("Algo: " + configuration.security.algo);
        }
    }
}
