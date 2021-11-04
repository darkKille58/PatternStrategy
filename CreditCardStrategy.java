public class CreditCardStrategy implements PaiementStrategy
{
    private String numCarte; 
    private String dateExpiration; 

    public CreditCardStrategy(String numeroCarte, String date)
    {
        this.numCarte = numeroCarte; 
        this.dateExpiration = date;
    }

    @Override 
    public void payer(int montant)
    {
        System.out.println("Vous allez payer " + montant + "CFA par carte de credit");
    }

//test 
    public static void main(String[] args)
    {
        String numeroCarte = "1234";
        String date = "4-11-2021";
        CreditCardStrategy paiement1 = new CreditCardStrategy(numeroCarte,date);
        paiement1.payer(150000);
    }
}