package ma.exelib.projet.bean;

import ma.exelib.projet.abst.Affichage;
import ma.exelib.projet.inte.Ioperation;

public class Complexe extends Affichage implements Ioperation {

	private int resultatPlus;
	private int resultatMoins;

	// methode

	public Complexe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public int getResultatPlus() {
		return resultatPlus;
	}



	public void setResultatPlus(int resultatPlus) {
		this.resultatPlus = resultatPlus;
	}



	public int getResultatMoins() {
		return resultatMoins;
	}



	public void setResultatMoins(int resultatMoins) {
		this.resultatMoins = resultatMoins;
	}



	public String affiche(int resultat) {
		// TODO Auto-generated method stub

		return "Le resultat est : " + resultat ;

	}

// ajout des paramettres
	@Override
	public int plus(int x, int y) {
		// TODO Auto-generated method stub

		return x + y;
	}

	// ajout des paramettres
	@Override
	public int moins(int n, int z) {
		// TODO Auto-generated method stub
		return n - z;
	}

}
