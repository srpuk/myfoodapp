package foody;

public class Vegetable {
   public String desc;
   public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public Vegetable(){}
   public void whoami(){
	   System.out.println("Hi, i am vegetable ");
	   System.out.println("from external:"+desc);
   }
}
