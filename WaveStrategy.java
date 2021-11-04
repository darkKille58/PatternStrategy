public class WaveStrategy implements PaiementStrategy {
    private String numTelephone;
    private String password;
    public WaveStrategy(String numero, String pass){
        this.numTelephone= numero;
        this.password=pass;
    }
    @Override
    public void payer(int montant, int frais){
        System.out.println("Vous allez payer " + montant + "CFA par carte de credit" + " dont " + frais + " de frais");
    }

//test 
    public static void main(String[] args)
    {
        String numero= "777212345";
        String pass = "1234";
        WaveStrategy paiement1 = new WaveStrategy(numero,pass);
        paiement1.payer(150000,2000);
    }
}
