import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable{

  private int numeroOperation;
  private transient Date dateOperation;
  private String numeroCompte;
  private String typeOperation;
  private double mantant;

  public Operation(int numeroOp, Date dateOp, String numC, String typeOP, double mt){
      
      this.numeroOperation = numeroOp;
      this.dateOperation = dateOp;
      this.numeroCompte = numC;
      this.typeOperation = typeOP;
      this.mantant = mt;

  }
  
}
