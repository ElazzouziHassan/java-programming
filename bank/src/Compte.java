public class Compte {
  
  private int code;
  private float solde;

  public void verser(float mt) throws MontantNegatifException{
    if(mt < 0) throw new MontantNegatifException("Montant"+mt+"est négatif");
    solde = solde+mt;
  }

  public void retirer(float mt) throws SoldeInsuffisantException, MontantNegatifException
  {
    if(mt < 0) throw new MontantNegatifException("Montant"+mt+"est négatif");
    if(mt > solde) throw new SoldeInsuffisantException("Solde Insuffisant"); 
    solde = solde-mt;
  }

  public float getSolde(){
    return solde;
  }
}
