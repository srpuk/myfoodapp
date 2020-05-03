package foody;

public class Fruit {
	String neg;
	
	public Fruit()
	{}
	
	public Fruit(String fru){
		String desc1="I am "+fru;
		System.out.println(desc1);
		}
	public String getNeg() {
		return neg;
	}
	public void setNeg(String neg) {
		this.neg ="but i am "+neg;
	}
	
	public void describe(){
		String desc1="I am vitamin rich";
		System.out.println(desc1);
			
		}
	public void negative(){
		    System.out.println(neg);
	}
}
