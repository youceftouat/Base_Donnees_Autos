import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FenetrePersoVehicule extends JDialog{
	  private Vehicule unVehicule = new Vehicule();	
	  private JLabel anneeLabel, marqueLabel, modelLabel, optionLabel;
	  private JTextField annee, marque, model, option;
	  
	  //Constructeur par defaut
	  public FenetrePersoVehicule(){
	  }
	 
	  //Constructeur avec parametres
	  public FenetrePersoVehicule(JFrame parent, String title, boolean modal){
	    super(parent, title, modal);
	    this.setSize(300, 250);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
	    this.initComponent();
	  }
	  
	  public Vehicule FenetreVehicule(){
		    this.setVisible(true);      
		    return this.unVehicule;      
		  }
	  
	  //Initialisation des composantes de la fenétre Vehicule.
	  private void initComponent(){
		  
		  	//l'année
		    JPanel panAnnee = new JPanel();
		    panAnnee.setBackground(Color.white);
		    annee = new JTextField();
		    annee.setPreferredSize(new Dimension(150, 25));
		    anneeLabel = new JLabel("Année :");
		    panAnnee.add(anneeLabel);
		    panAnnee.add(annee);   
		
		    //La Marque
		    JPanel panMarque = new JPanel();
		    panMarque.setBackground(Color.white);
		    marque = new JTextField();
		    marque.setPreferredSize(new Dimension(150, 25));
		    marqueLabel = new JLabel("Marque :");
		    panMarque.add(marqueLabel);
		    panMarque.add(marque);

		    //Le model
		    JPanel panModel = new JPanel();
		    panModel.setBackground(Color.white);
		    model = new JTextField();
		    model.setPreferredSize(new Dimension(150, 25));
		    modelLabel = new JLabel("Model :");
		    panModel.add(modelLabel);
		    panModel.add(model);
		   
		    //l'option
		    JPanel panOption = new JPanel();
		    panOption.setBackground(Color.white);
		    option = new JTextField();
		    option.setPreferredSize(new Dimension(150, 25));
		    optionLabel = new JLabel("Option :");
		    panOption.add(optionLabel);
		    panOption.add(option);
		    
		    JPanel content = new JPanel();
		    content.setBackground(Color.white);
		    
		    content.add(panAnnee);
		    content.add(panMarque);
		    content.add(panModel);
		    content.add(panOption);
		    
		    JPanel control = new JPanel();
		    final JButton okBouton = new JButton("OK");
		    
		    okBouton.addActionListener(new ActionListener(){
		    	public void actionPerformed(ActionEvent e) {
		    		JOptionPane jop = new JOptionPane();
		    		try { 
		    		  unVehicule = new Vehicule(annee.getText(), marque.getText(), model.getText(), option.getText());
		    		  setVisible(false);
		    		} catch (NumberFormatException ex) {  
		    		     jop.showMessageDialog(null, " Entrez toutes les informations", "Erreur", JOptionPane.ERROR_MESSAGE);
		    		}
		    	}
		    });

		    JButton cancelBouton = new JButton("Annuler");
		    cancelBouton.addActionListener(new ActionListener(){
		      
		    	public void actionPerformed(ActionEvent e) {
		        setVisible(false);
		    	}      
		    });

		    control.add(okBouton);
		    control.add(cancelBouton);
		    this.getContentPane().add(content, BorderLayout.CENTER);
		    this.getContentPane().add(control, BorderLayout.SOUTH);
		  }

}
