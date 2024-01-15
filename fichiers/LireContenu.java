import java.io.*;

public class LireContenu {
  public static void main(String[] args) throws IOException 
   {
      File src = new File("file1.txt"); 
      File dest = new File("file2.txt"); 
      FileReader fr = new FileReader(src);
      BufferedReader br = new BufferedReader(fr);  
      FileWriter fw = new FileWriter(dest);      
      String str = null;

      while((str = br.readLine()) != null){
        fw.write(str);
        fw.write("\n");
        fw.flush();
      }

      fw.close();
   }
}
