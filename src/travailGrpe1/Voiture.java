package travailGrpe1;

public class Voiture extends Vehicule {

    /**
     * Default constructor
     */
    public Voiture() {
    }

    /**
     * 
     */
    public int nbreRoues;

    /**
     * 
     */
    public int nbrePortes;

    /**
     * 
     */
    public int capaciteCoffre;

    /**
     * 
     */
    public String marquePneu;

    /**
     * 
     */

    /**
     * @return
     */
    public String klaxonne() {
        // TODO implement here
        return "Beep Beep!!";
    }

	public int getNbreRoues() {
		return nbreRoues;
	}

	public void setNbreRoues(int nbreRoues) {
		this.nbreRoues = nbreRoues;
	}

	public int getNbrePortes() {
		return nbrePortes;
	}

	public void setNbrePortes(int nbrePortes) {
		this.nbrePortes = nbrePortes;
	}

	public int getCapaciteCoffre() {
		return capaciteCoffre;
	}

	public void setCapaciteCoffre(int capaciteCoffre) {
		this.capaciteCoffre = capaciteCoffre;
	}

	public String getMarquePneu() {
		return marquePneu;
	}

	public void setMarquePneu(String marquePneu) {
		this.marquePneu = marquePneu;
	}

}