
public class TPLibrairie {

	public static void main(String[] args) {
		
		Librairie lib = new Librairie();
		
		System.out.println(lib.rechercheLivre("unTitre")+" "+lib.rechercheNull());
		
		lib.livraison("la folie de l'informatique", 4);
		lib.livraison("vivement les vacances", 50);
		
		lib.achete("la folie de l'informatique");
		lib.achete("vivement les vacances");
	}

}
