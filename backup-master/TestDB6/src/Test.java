
public class Test {
	public static void main(String[] args){
		TestUserDAO dao=new TestUserDAO();
		dao.select("taro", "123△");
		dao.selectAll();
		dao.selectByName("taro");
		dao.selectByPassword("123△");
		dao.unpdateUserNameByUserName("saburo", "taro");
		/*dao.insert(4, "shiro", "012");
		dao.insert(4, "shiro", "012");
		dao.insert(4, "shiro", "012");
		dao.insert(4, "shiro", "012");
		dao.insert(4, "shiro", "012");
		dao.insert(4, "shiro", "012");*/
		//dao.delete("taro");
	}
}
