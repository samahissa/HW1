package shoping_cart;

public class products {

		private String name;
		private int price;
		private int  quan;
	public void set_name(String s) {
		name=s;
	}
	
	public void set_price(int val) {
		price=val;
	}
	
	public int get_price() {
		return price;
	}
	
	public String get_name() {
		return name;
	}
	
	public void set_quan(int p) {
		quan=p;
	}
	
	public int get_quan() {
		return quan;
	}

}
