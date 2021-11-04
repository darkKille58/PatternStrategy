public class PaypalStrategy implements PaiementStrategy{

	private String email;
	private String password;

	public PaypalStrategy(String email, String pass){
		this.email=email;
		this.password=pass;
	}

	@Override
	public void payer(int montant,int frais) {
		System.out.println("Vous allez payer " + montant + "CFA par carte de credit" + " dont " + frais + " de frais");
	}



}