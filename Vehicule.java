//La classe Vehicule qui decrit les attribus de l'objet Vehicule
public class Vehicule {
	private String annee;
	private String marque;
	private String model;
	private String option;
	
	//Constructeur par defaut (sans paramétres)
	public Vehicule()
	{
	}
	//Constructeur en passant tous les atribus d'un Vehicule en parametres
	public Vehicule(String annee, String marque, String model, String option)
	{
		this.annee = annee;
		this.marque = marque;
		this.model = model;
		this.option = option;
		
	}
	//Getter et Setter
	
	//l'annee
	public String getAnnee()
	{
		return annee;	
	}
	public void setType(String nouvAnnee)
	{
		annee = nouvAnnee;
	}
	
	//Marque
	public String getMarque()
	{
		return marque;	
	}
	public void setMarque(String nouvMarque)
	{
		marque = nouvMarque;
	}
	
	//Model
	public String getModel()
	{
		return model;	
	}
	public void setModel(String nouvModel)
	{
		model = nouvModel;
	}
	
	//Option
	public String getOption()
	{
		return option;	
	}
	public void setOption(String nouvOption)
	{
		option = nouvOption;
	}
		
	
	//Redefinitin de la methode toString pour afficher les informations d'un véhicule
	public String toString()
	{
		return String.format("%-30s %-40s %-40s %-40s",annee, marque, model, option);
	}

}
