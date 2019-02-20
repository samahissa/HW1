package shoping_cart;

import java.util.ArrayList;

public class cart {
	
	
	private ArrayList<products> a= new ArrayList<products>();
	
	public void set_list(String s,int p,int q){
		if(s.contentEquals("")) 
			return ;
			else {
		products k=new products();
		k.set_name(s);
		k.set_price(p);
		k.set_quan(q);
		a.add(k);
			}
	
	}
	
	
	public ArrayList<products> get_list(){
		return a;
	
	
	}
	
	public int total() {
		int tot=0;
		
		for(products x:a) {
			tot+=x.get_price()*x.get_quan();
		}
		return tot;
	}

}
