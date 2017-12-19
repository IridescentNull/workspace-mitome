
public class Test {
	public static void main(String[] args){
		TestUserDAO dao=new TestUserDAO();
		dao.select("taro", "123△");
		System.out.println("--------------------------------");
		dao.selectAll();
		System.out.println("--------------------------------");
		dao.selectByName("jiro");
		System.out.println("--------------------------------");
		dao.selectByPassword("789☆");
		System.out.println("--------------------------------");
		dao.updateUserNameByUserName("taroimo","taro");
		System.out.println("--------------------------------");
		//dao.insert(4, "sabato", "012");
		dao.delete("sabato");
	}
}
