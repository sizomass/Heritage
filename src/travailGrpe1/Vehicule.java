package travailGrpe1;

public class Vehicule {

    /**
     * Default constructor
     */
    public Vehicule() {
    }

    /**
     * 
     */
    public String typeMoteur;

    /**
     * 
     */
    public int vitesseMax;

    /**
     * 
     */
    public int vitesseActuelle;

    /**
     * 
     */
    public String typeCarburant;

    /**
     * 
     */
    public String environnement;

    /**
     * 
     */
    public double emissionCo2;

    /**
     * 
     */
    public boolean demarre;

    /**
     * 
     */
    public double carburantActuel;

    /**
     * 
     */
    public double capaciteReservoir;

    /**
     * 
     */
    public String couleur;

    /**
     * 
     */
    public int poidsAVide;

    /**
     * 
     */
    public String immatricuation;

    /**
     * 
     */
    public String marque;

    /**
     * 
     */
    public int prix;

    /**
     * 
     */
    public int nbrePassagerMax;

    /**
     * @return
     */
    public void accelere() {
        
    	
    	do {vitesseActuelle ++;   	
    		carburantActuel = carburantActuel - 0.001;
    		emissionCo2 = emissionCo2 + 0.01;					}
    while (	vitesseActuelle < vitesseMax);
       
    }

    /**
     * @return
     */
    public void ralenti() {
        // TODO implement here
      do  {vitesseActuelle --;}
      while (vitesseActuelle > 0);
      
    }

    /**
     * @return
     */
    public void arreter() {
       if(vitesseActuelle == 0) {
    	   demarre = false;
       }
        
    }

    /**
     * @return
     */
    public void demarrer() {
        if( vitesseActuelle > 0) {
        	demarre = true;
        }
        
    }

	public String getTypeMoteur() {
		return typeMoteur;
	}

	public void setTypeMoteur(String typeMoteur) {
		this.typeMoteur = typeMoteur;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	public int getVitesseActuelle() {
		return vitesseActuelle;
	}

	public void setVitesseActuelle(int vitesseActuelle) {
		this.vitesseActuelle = vitesseActuelle;
	}

	public String getTypeCarburant() {
		return typeCarburant;
	}

	public void setTypeCarburant(String typeCarburant) {
		this.typeCarburant = typeCarburant;
	}

	public String getEnvironnement() {
		return environnement;
	}

	public void setEnvironnement(String environnement) {
		this.environnement = environnement;
	}

	public double getEmissionCo2() {
		return emissionCo2;
	}

	public void setEmissionCo2(double emissionCo2) {
		this.emissionCo2 = emissionCo2;
	}

	public boolean isDemarre() {
		return demarre;
	}

	public void setDemarre(boolean demarre) {
		this.demarre = demarre;
	}

	public double getCarburantActuel() {
		return carburantActuel;
	}

	public void setCarburantActuel(double carburantActuel) {
		this.carburantActuel = carburantActuel;
	}

	public double getCapaciteReservoir() {
		return capaciteReservoir;
	}

	public void setCapaciteReservoir(double capaciteReservoir) {
		this.capaciteReservoir = capaciteReservoir;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getPoidsAVide() {
		return poidsAVide;
	}

	public void setPoidsAVide(int poidsAVide) {
		this.poidsAVide = poidsAVide;
	}

	public String getImmatricuation() {
		return immatricuation;
	}

	public void setImmatricuation(String immatricuation) {
		this.immatricuation = immatricuation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getNbrePassagerMax() {
		return nbrePassagerMax;
	}

	public void setNbrePassagerMax(int nbrePassagerMax) {
		this.nbrePassagerMax = nbrePassagerMax;
	}

}