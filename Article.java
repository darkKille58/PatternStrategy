import java.util.Scanner;
public class Article{
	private String nom;
	private int prix;
	private int frais;

	public Article(String nom, int prix,int frais) {
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
		Article article1 = new Article("Pantalon ZARA",25000,1000);
		Article article2 = new Article("Macbook Pro touch bar 2020",800000,100);
		Article article3 = new Article("Iphone 13",5000000,320);

		Scanner reader = new Scanner(System.in);
		System.out.println("Que souhaitez vous acheter, Voila nos article et leur prix:  ");
		System.out.println("nom: " + article1.getNom() + " prix: " + article1.getPrix() + " et les frais de paiement sont de " + article1.getFrais());
		System.out.println("nom: " + article2.getNom() + " prix: " + article2.getPrix() + " et les frais de paiement sont de " + article2.getFrais());
		System.out.println("nom: " + article3.getNom() + " prix: " + article3.getPrix() + " et les frais de paiement sont de " + article3.getFrais());

        String article = reader.next();

		//ondition TO DO
		article1.payer(new PaypalStrategy("mb@gmail.com", "p001"));
	}
}