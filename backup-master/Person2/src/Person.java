
public class Person {
	public Person(){}
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public Person(String name){
		this.name=name;
		this.age=0;
	}
	public Person(int age){
		this.name="名前なし";
		this.age=age;
	}
	public String name=null;
	public int age=0;
	public String tell=null;
	public String email=null;
	public String prefecture=null;
	public String job=null;

	public void talk(){
		System.out.println(this.name+"が話す");
	}
	public void walk(){
		System.out.println(this.name+"が歩く");
	}
	public void run(){
		System.out.println(this.name+"が走る");
	}
}
