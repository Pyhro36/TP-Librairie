
/**
 * Classe de construction d'un type de livre
 * @author Pierre-Louis
 * @version 1.0
 */

public class Livre {

	private String ftitre;
	private int fnombre;
	private double fPrix;
	
	/**
	 * Constructeur par defaut d un type de livre (nombre : 1, prix : 0, nom vide) 
	 */

	public Livre() {
		
		this.fnombre = 1;
		this.fPrix = 0.0;
		this.ftitre = "";
	}
	
	/**
	 * Constructeur d un type de livre parametre
	 * @param titre le titre du livre
	 * @param nombre le nombre d exemplaires
	 * @param prix le prix du livre a l unite
	 */
	
	public Livre(String titre, int nombre, double prix){
		
		this.fnombre = nombre;
		this.fPrix = prix;
		this.ftitre = titre;
	}
	
	/**
	 * renvoie l'information du nom du livre et du nombre d'exemplaires
	 */
	
	public String toString(){
		
		return this.ftitre + " en " + String.valueOf(this.fnombre) + " exemplaires";
	}
	
	public String getFtitre(){
		
		return this.ftitre;
	}
	
	public int getFnombre(){
		
		return this.fnombre;
	}
	
	public double getFprix(){
		
		return this.fPrix;
	}
	
	public void setFtitre(String titre){
		
		this.ftitre = titre;
	}
	
	public void setFnombre(int nombre){
		
		this.fnombre = nombre;
	}
	
	public void setPrix(double prix){
		
		this.fPrix = prix;
	}
	
	

}
