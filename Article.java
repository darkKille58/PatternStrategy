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
		article1.payer(new PaypalStrategy("mb@gmail.com", "p001"));
	}
}