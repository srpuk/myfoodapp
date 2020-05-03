package foody;

import java.util.List;
import java.util.Map;

public class Snacks {
	
	public Snacks(){}
	
	public String me;
	public List<String> snackList;
	public Map<String,String> snackMap;
	int i;
	int j;
	
	
	public String getMe() {
		return me;
	}
	public void setMe(String me) {
		this.me = me;
	}

	
	
	public Map<String, String> getSnackMap() {
		return snackMap;
	}
	public void setSnackMap(Map<String,String> snackMap) {
		this.snackMap = snackMap;
	}

	
	public List<String> getSnackList() {
		return snackList;
	}
	public void setSnackList(List<String> snackList) {
		this.snackList = snackList;
	}
	
	public void Whoami(){
		System.out.println("hi, i am "+me);
		
	}
	
	public void Contains(){
		if(!snackList.isEmpty())
		{
			for (i=0;i<snackList.size();i++){
				System.out.println(snackList.get(i));
			}
		}
	}
	
	public void Mapping(){
		for(Map.Entry<String,String> m:snackMap.entrySet()){
			System.out.println("key : "+m.getKey()+"  Value :"+m.getValue());
		}
	}
		
			}
    
