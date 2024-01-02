import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisation {

  public static void main(String[] args) throws IOException {
    File file = new File("public\banque.txt");
    FileInputStream fis = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fis);
    // Operation op1 = new (Operation) ois.readObject();
  }
}
