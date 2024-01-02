import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Serialisation {
  public static void main(String[] args) throws Exception{
    
    Operation op1 = new Operation(1, new Date(), "CC1", "V", 4000);
    Operation op2 = new Operation(1, new Date(), "CC2", "R", 6000);

    File file = new File("public\banque.txt");

    FileOutputStream fos = new FileOutputStream(file);

    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(op1);
    oos.writeObject(op2);
    oos.close();

  }
}
