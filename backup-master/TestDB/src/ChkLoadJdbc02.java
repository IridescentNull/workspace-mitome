
public class ChkLoadJdbc02 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
		String m;
		try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		m="ドライバのロードに成功しました";
		}catch (ClassNotFoundException e){
			m="ドライバのロードに失敗しました";
		}
		System.out.println(m);
	}
}
