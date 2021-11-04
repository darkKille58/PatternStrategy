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
	System.out.println("Par quel moyen voudrez-vous payer ");
	reader.nextLine();
	if (reader.equals("Paypal")) {
		article1.payer(new PaypalStrategy("mb@gmail.com", "p001"));
	}
	elseif(reader.equals("Wave")){
		article1.payer(new WaveStrategy("771023701","1234"));
	}
	
	elseif(reader.equals("Carte credit")){
		article1.payer(new CreditCardStrategy("1234","4-10-21"));
	}
	
}

}