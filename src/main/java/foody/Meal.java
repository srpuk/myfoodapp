package foody;

public class Meal {
	
	private Fruit fruitD;
	private Meat meatD;
	private Snacks snackD;
	private Vegetable vegD;
	private Chemicals chemD;
	
	public Chemicals getChemD() {
		return chemD;
	}

	public void setChemD(Chemicals chemD) {
		this.chemD = chemD;
	}

	public Vegetable getVegD() {
		return vegD;
	}

	public void setVegD(Vegetable vegD) {
		this.vegD = vegD;
	}

	public Meal(){
		
	}
	
	public Meal(Meat m){
		this.meatD=m;
	}
	
	public Meal(Vegetable v){
		this.vegD=v;
	}
	
	public Fruit getFruitD() {
		return fruitD;
	}
	public void setFruitD(Fruit fruitD) {
		this.fruitD = fruitD;
	}
	public Snacks getSnackD() {
		return snackD;
	}
	public void setSnackD(Snacks snackD) {
		this.snackD = snackD;
	}
	
	public void whatismeal()
	{
		if(fruitD!=null){
			System.out.println("enjoy the fruit");
			System.out.println(fruitD.neg);
		}
		else System.out.println("Sorry no fruit");
		
		if(meatD!=null){
			System.out.println("enjoy the meat");
		}
		if(snackD!=null){
			System.out.println("enjoy the snack");
		}
		if(vegD!=null){
			System.out.println("Enjoy the vegetable");
		}
		if(chemD!=null){
			System.out.println("You are consuming chemical");
			chemD.describe();
		}
		
	}

	
	
	

}
