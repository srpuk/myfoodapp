package foody;

public class AutoDinner {
    
	private Meat meatC;
	private Meal mealC;
	//public AutoDinner(){}
	
	public AutoDinner(Meat m,Meal me){
		this.meatC=m;
		this.mealC=me;
	}
		
   public void dinnermenu(){
	   
		if (mealC!=null){System.out.println("Hi,Your dinner has a meal");
	}
		else System.out.println("Oh oh ..no meal");
   
	if (meatC!=null){System.out.println("Hi,Your dinner menu contains meat");
	}
		else System.out.println("Hey..veggie");
  }
}
