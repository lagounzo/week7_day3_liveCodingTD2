package ma.exelib.projet;

import ma.exelib.projet.bean.Complexe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//donnee des valeurs 
	Complexe complexe1 = new Complexe();
	int resultplus = complexe1.plus(17, 45);
	int resultMoins = complexe1.moins(50, 400);
	// pour afficher le resultat
	System.out.println(complexe1.affiche(resultplus ));
	System.out.println(complexe1.affiche(resultMoins));
	
	
	

	}

}
