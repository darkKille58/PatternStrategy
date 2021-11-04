public class PaypalStrategy implements PaiementStrategy{

	private String email;
	private String password;

	public PaypalStrategy(String email, String pass){
		this.email=email;
		this.password=pass;
	}

	@Override
	public void payer(int montant,int frais) {
		System.out.println(montant + "CFA payés par Paypal.");
	}



}