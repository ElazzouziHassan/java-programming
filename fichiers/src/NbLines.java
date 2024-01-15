import java.io.*;

public class NbLines {
   public static void main(String[] args) throws IOException {
      
      File file = new File("myFile.txt"); 
      int nbrLine = 0;            
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);  
      String str;

      while((str = br.readLine()) != null){
        nbrLine++;                 
      }

      fr.close();

      System.out.println("Nombre de lignes dans le fichier : "+ nbrLine); 
   }
}