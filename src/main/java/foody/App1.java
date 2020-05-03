package foody;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("Your menu on me!!!");
   
   Meat meat1=new Meat(); //tightly coupled
   meat1.Whoami();
   
   ApplicationContext appcontext=new FileSystemXmlApplicationContext("appContext.xml");
   Meat meat2=appcontext.getBean("meatbean",Meat.class);
   meat2.describe();
   
   Meat meat3=(Meat)appcontext.getBean("meatbean");
   meat3.negative();
   
   ApplicationContext appcontext2=new ClassPathXmlApplicationContext("contextPackage/appContext2.xml");
   Fruit fruit=appcontext2.getBean("fruitbean",Fruit.class);
   fruit.describe(); 
  
   Fruit fruit2=appcontext2.getBean("fruitbean2",Fruit.class); //property
   fruit2.negative();
   
   Snacks snacks=appcontext2.getBean("snackbean",Snacks.class); //List property
   Snacks snacks2=appcontext2.getBean("namespacebean",Snacks.class);
  
   snacks2.Whoami();
   snacks.Contains();
   snacks.Mapping();
   

   Meal normalMeal=new Meal();
   normalMeal.whatismeal();
   
   Meal injectSmeal=appcontext2.getBean("mealbean",Meal.class);
   injectSmeal.whatismeal();
   
   Meal injectCmeal=appcontext.getBean("constrdbean",Meal.class);
   injectCmeal.whatismeal();
   
   Meal injectC2meal=appcontext.getBean("constrd2bean",Meal.class);
   injectC2meal.whatismeal();
   
   //from external property file
   Vegetable externalVeg=appcontext.getBean("externalvegbean",Vegetable.class);
   externalVeg.whoami();
   
   Meal outermeal=appcontext.getBean("outerbean",Meal.class);
   outermeal.whatismeal();
   
   AutoBreakfast autobkfst=appcontext2.getBean("autobytype",AutoBreakfast.class);
   autobkfst.menu();
   
   Autolunch autolunchname=appcontext.getBean("autobyname",Autolunch.class);
   autolunchname.menu();
   
   AutoDinner autodinnercon=appcontext.getBean("autoconstructor",AutoDinner.class);
   autodinnercon.dinnermenu();
   
  
   
   
   }

	}
	
