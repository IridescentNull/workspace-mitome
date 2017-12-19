
public class SmartPhone {
	public String name;
	public int price;

	public SmartPhone(){}

	public SmartPhone(String n){
		this.name=n;
	}

	public SmartPhone(int p){
		this.price=p;
	}

	public SmartPhone(String n, int p){
		this.name=n;
		this.price=p;
	}

	public SmartPhone(int p, String n){
		this.name=n;
		this.price=p;
	}
}
