package foody;

public class Autolunch {
	
	private Chemicals chemAN;
	public Chemicals getChemAN() {
		return chemAN;
	}

	public void setChemAN(Chemicals chemAN) {
		this.chemAN = chemAN;
	}

	public Autolunch(){}
	
	public void menu(){
		
		if(chemAN!=null)
			System.out.println("lunch Menu contains Chemical");
	}

}
