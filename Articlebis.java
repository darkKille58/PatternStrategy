import java.util.Scanner;
public class Articlebis{
	private String nom;
	private int prix;
	private int frais;

	public Articlebis(String nom, int prix,int frais) {
		this.nom = nom;
		this.prix = prix;
		this.frais = frais;

	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String name){
		nom = name;
	}

	public int getPrix() {
		return this.prix;
	}

	public void setPrix(int price){
		prix = price;
	}

	public int getFrais() {
		return this.frais;
	}

	public void setFrais(int nfrais){
		frais = nfrais;
	}

	public void payer(PaiementStrategy methode){
		int montant=this.getPrix();
		methode.payer(montant,frais);
	}

public static void main(String[] args) {
	Articlebis article1 = new Articlebis("Pantalon ZARA",25000,1000);

	Scanner reader = new Scanner(System.in);
	System.out.println("Que souhaitez vous acheter, Voila nos article et leur prix:  ");
	System.out.println("nom: " + article1.getNom() + " prix: " + article1.getPrix() + " et les frais de paiement varient selon les type de paiement ");
	System.out.println("Par quel moyen voudrez-vous payer ");
	String mot = reader.next();

	if (mot.equals("Paypal") || mot.equals("paypal") || mot.equals("PAYPAL")) {
		article1.setFrais(2000);
		article1.setPrix(article1.getPrix() + article1.getFrais());
		System.out.println("nom: " + article1.getNom() + " prix: " + article1.getPrix() + " et les frais de paiement sont de " + article1.getFrais());
		article1.payer(new PaypalStrategy("mb@gmail.com", "p001"));
		
	}
	
	else if(mot.equals("Wave") || mot.equals("wave") || mot.equals("WAVE")){
		article1.setFrais(250);
		article1.setPrix(article1.getPrix() + article1.getFrais());
		System.out.println("nom: " + article1.getNom() + " prix: " + article1.getPrix() + " et les frais de paiement sont de " + article1.getFrais());
		article1.payer(new WaveStrategy("771023701","1234"));
	}
	
	else if(mot.equals("Carte") || mot.equals("carte") || mot.equals("CARTE")){
		article1.setFrais(1500);
		article1.setPrix(article1.getPrix() + article1.getFrais());
		System.out.println("nom: " + article1.getNom() + " prix: " + article1.getPrix() + " et les frais de paiement sont de " + article1.getFrais());
		article1.payer(new CreditCardStrategy("1234","4-10-21"));
	}

	else 
	{
		System.out.println("Ce type de paiement n\'existe pas");
	}
	
}

}