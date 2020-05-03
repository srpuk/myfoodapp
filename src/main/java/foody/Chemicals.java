package foody;

public class Chemicals {
	public String name;
	public String use;
	
	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public Chemicals(){}
	
	public void describe(){
		System.out.println("Hi, i am :"+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void init(){
		System.out.println("innerbean initiated");
		
	}
	public void destroy(){
		System.out.println("innerbean destroyed");
	}
	public void tellUse(){
		System.out.println("My use is :"+use);
	}

}
