public class Librairie {
	
	private final int MAXLIVRES = 500;
	private Livre[] fStock;
	
	/**
	 * Constructeur par defaut de la librairie : une librairie vide
	 */

	public Librairie() {
		
		fStock = new Livre[MAXLIVRES]; 
	}
	
	public int getNombreLivres() {
		
		int nombreLivres = 0;
		
		for(int i = 0; i<MAXLIVRES; i++){
			
			if (this.fStock[i] != null)
				nombreLivres += this.fStock[i].getFnombre();
		}
		
		return nombreLivres;
	}
	
	/**
	 * methode de recherche du premier livre portant un titre donne en parametre (renvoie -1 s'il n'en existe pas)
	 * @param unTitre le titre du livre
	 * @return le premier indice du livre portant ce titre
	 */
	
	public int rechercheLivre(String unTitre){
		
		int i = 0, indice = -1;
		
		 while(indice == -1 && i<MAXLIVRES){
			
			if(fStock[i] != null){
				
				if(fStock[i].getFtitre().equals(unTitre)){
					
					indice = i;
				}
			}
			
			i++;
		}
		
		return indice;
	}
	
	/**
	 * methode de recherche du premier indice du stock ne contenant pas de livre (null) (renvoie -1 s'il n'en existe pas)
	 * @return le premier indice
	 */
	
	public int rechercheNull(){ 
		
		int i = 0, indice = -1;
		
			while(indice == -1 && i<MAXLIVRES){
			
				if(fStock[i] == null){
				
					indice = i;
				}
			
			i++;
		}
		
		return indice;
		
	}
	
	/**
	 * methode d'ajout d'un stock de livre d'un titre donne a la librairie, si le titre est deja present, le stock du titre est complete, sinon un nouveau type de livre est cree
	 * @param unTitre
	 * @param unStock
	 */
	
	public void livraison(String unTitre, int unStock){
		
		int nombreLivres = this.getNombreLivres() + unStock;
	
		if(nombreLivres < MAXLIVRES){
			
			int indice = this.rechercheLivre(unTitre);
			
			if(indice != -1){
				
				fStock[indice].setFnombre(fStock[indice].getFnombre() + unStock);
			
			} else {
				
				indice = this.rechercheNull();
				
				System.out.println("Nouveau livre dans la librairie : quel est son prix ? :");
				double prix = Get.nextDouble();
				
				fStock[indice] = new Livre(unTitre, unStock, prix);
				
			}
			
		} else {
			
			System.out.println("le stock de la librairie ne peut acueillir cette quatité de livres");
		}
	}
	
	/**
	 * Methode d'achat d'un livre : Si le livre n’existe pas dans le stock de la librairie on affichera un message d’erreur à l’écran, \n
	 * S’il reste moins de 5 livres après l’achat on affichera un message d’avertissement à l’écran, \n
	 * Si l’achat fait tomber le nombre d’exemplaires du livre à 0 on supprimera le livre de la librairie \n
	 * et on affichera un message d’avertissement à l’écran.
	 * @param unTitre le titre du livre à acheter
	 */
	
	public void achete(String unTitre){
		
		int indiceDuLivre = this.rechercheLivre(unTitre);
		
		if(indiceDuLivre == -1){
			
			System.out.println("livre inexistant dans la librairie, impossible de l'acheter");
			
		} else {
			
			this.fStock[indiceDuLivre].setFnombre(this.fStock[indiceDuLivre].getFnombre() - 1); 
			
			if(this.fStock[indiceDuLivre].getFnombre() < 5)
				System.out.println("Attention, il reste moins de 5 livres de ce titre dans la libraire");
			
			if(this.fStock[indiceDuLivre].getFnombre() == 0){
				
				System.out.println("Attention, il ne reste plus de livres de ce titre dans la librairie");
				
				this.fStock[indiceDuLivre] = null;
				
			}
				
		}
	}
	
	
}
