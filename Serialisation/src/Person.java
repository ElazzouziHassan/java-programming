import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Person implements Serializable {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public static void main(String[] args) {
    // Créer un objet Person
    Person p = new Person("Alice", 25);

    // Sérialiser l'objet dans un fichier
    try {
      FileOutputStream fos = new FileOutputStream("person.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(p);
      oos.close();
      fos.close();
      System.out.println("Objet sérialisé avec succès");
    } catch (Exception e) {
      e.printStackTrace();
    }

    // Désérialiser l'objet à partir du fichier
    try {
      FileInputStream fis = new FileInputStream("person.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Person p2 = (Person) ois.readObject();
      ois.close();
      fis.close();
      System.out.println("Objet désérialisé avec succès");
      System.out.println("Nom : " + p2.getName());
      System.out.println("Age : " + p2.getAge());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}