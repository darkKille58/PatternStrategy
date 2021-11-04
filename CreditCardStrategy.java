public CreditCardStrategy implements PaiementStrategy
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
        System.out.println(montant + "CFA payés par carte de credit");
    }
}