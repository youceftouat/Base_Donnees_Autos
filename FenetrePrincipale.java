import java.io.*;
import java.util.Collection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FenetrePrincipale extends JFrame implements ActionListener {
		
	//Barre de menu
	private JMenuBar menuBar;
		
		//items du menu Fichier
		private JMenuItem BaseVehicule = new JMenuItem("Import Véhicule");
		private JMenuItem Quitter = new JMenuItem("Quitter");

		private JMenuItem addVehicule = new JMenuItem("Ajouter Véhicule");
		
		private JMenuItem apropos = new JMenuItem("Base de données Autos");
		private JMenuItem help = new JMenuItem("Help");
		
		public FenetrePrincipale(int l, int h, String titre){
			setTitle(titre);
		    setSize(l,h);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setLocationRelativeTo(null);
		    
		    menuBar = new JMenuBar();
		    JMenuItem mi; // une reference de travail
		    
		      //Le Menu Fichier
			  JMenu fichier = new JMenu("Fichier");
			  fichier.setMnemonic('F');
			  menuBar.add(fichier);
			  //Ajout des items
			  
			  //menu fichier
			  BaseVehicule.addActionListener(this);
			  fichier.add(BaseVehicule);
			  BaseVehicule.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, 2));
		
			  Quitter.addActionListener(this);
			  fichier.add(Quitter);
			  Quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, 2));
			  
			//Menu  Edition
			  JMenu edition = new JMenu("Edition");
			  edition.setMnemonic('E');
			  menuBar.add(edition);
			  
			//les sous menus 
			  JMenu Ajouter = new JMenu("Ajouter");
			  edition.add(Ajouter);

			  //items du sous menu ajouter
			  addVehicule.addActionListener(this);
			  Ajouter.add(addVehicule);
			  addVehicule.setAccelerator(KeyStroke.getKeyStroke('t'));
			
			//menu Aide
			  JMenu aide = new JMenu("Aide");
			  aide.setMnemonic('D');
			  menuBar.add(aide);
			  help.addActionListener(this);
			  aide.add(help);
			  help.setAccelerator(KeyStroke.getKeyStroke("F4"));
			  
			//menu a propos
			  JMenu aPropos = new JMenu("A propos");
			  aPropos.setMnemonic('P');
			  menuBar.add(aPropos);
			  apropos.addActionListener(this);
			  aPropos.add(apropos);
			  apropos.setAccelerator(KeyStroke.getKeyStroke("F1"));
			  
			  //ajout du menu a la barre de menu
			  setJMenuBar(menuBar);
			  setVisible(true);
			  
		}
		public void actionPerformed(ActionEvent a) {
			JOptionPane jop = new JOptionPane();
			//Ajouter un auteur a la base de donnees
			if(a.getSource() == addVehicule){
				//faire appelle a la fenetre creer pour la cueillette des informations de l'auteur a ajouter
				FenetrePersoVehicule sesieVehicule = new FenetrePersoVehicule();
				sesieVehicule = new FenetrePersoVehicule(null, "Informations Véhicule", true);
				Vehicule unVehicule = sesieVehicule.FenetreVehicule();
			}
			
		}
		//main
		public static void main(String [] args) {
		     new FenetrePrincipale(500,300,"Bienvenue dans ma Banque d'autos");
		  }
}
