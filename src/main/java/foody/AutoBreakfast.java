package foody;

public class AutoBreakfast {
	
	private Fruit fruitAuto;
	private Snacks snackAuto;
	private Chemicals chemAuto;
	
	public Chemicals getChemAuto() {
		return chemAuto;
	}

	public void setChemAuto(Chemicals chemAuto) {
		this.chemAuto = chemAuto;
	}

	public Fruit getFruitAuto() {
		return fruitAuto;
	}

	public void setFruitAuto(Fruit fruitAuto) {
		this.fruitAuto = fruitAuto;
	}

	public Snacks getSnackAuto() {
		return snackAuto;
	}

	public void setSnackAuto(Snacks snackAuto) {
		this.snackAuto = snackAuto;
	}

	
	public AutoBreakfast(){}
	
	public void menu(){
		System.out.println("Here is your breakfast menu\n");
		if(fruitAuto!=null){
			System.out.println("Fruit is there\n");
		}
		else System.out.println("Sorry no fruit\n");
			
		if(snackAuto!=null){
			System.out.println("Snack is there\n");
		}
		else System.out.println("Sorry no snack\n");
		
		if(chemAuto!=null){
			System.out.println("Chemical is there in Break fast \n");
		}
		else System.out.println("yay!! no Chemical in Break fast \n");
	}

}
