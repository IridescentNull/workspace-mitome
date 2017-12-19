
public class ChkLoadJdbc {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException{
			String m;
			try{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				m="ドライバのロードに成功しました";
			}catch(ClassNotFoundException e){
				m="失敗";
			}
			System.out.println(m);
	}
}
