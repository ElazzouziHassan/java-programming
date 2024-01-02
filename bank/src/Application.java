import java.util.Scanner;

public class Application {
  
  public static void main(String[] args) throws MontantNegatifException {
    
    Compte cp = new Compte();
    Scanner clavier = new Scanner(System.in);
    System.out.println("Montant a verser : ");
    float mt1 = clavier.nextFloat();
    cp.verser(mt1);
  }
}
