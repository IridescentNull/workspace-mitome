import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreYouPrime {

	public static void main(String[] args) throws IOException {

		for(int g=1;1<2;g++){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n"+g+"回目の判定: 2以上の自然数を入力してください");
		String t = br.readLine();
		try{
			long i=Long.parseLong(t);
			System.out.println("入力："+i);
			Judge d=new Judge(i);
		}catch(NumberFormatException e){
			System.out.println("2以上の自然数を入力してください");


		}

	}

}
}