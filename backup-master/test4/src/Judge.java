
public class Judge {

	//public Judge(String s){
	//	System.out.println("数字を入れてください");
	//}

	public Judge(long d){
		//String t;
		//int i=Integer.parseInt(t);
		//System.out.println("入力："+i);
		int j=0;
		if(d<2){
			System.out.println("2より大きな自然数を入れてください");
		}
		else{

			for(long s=3; s<=Math.pow(d, 0.5);s+=2){
				if(d%s==0){
					j+=1;
					s+=d;
				}
			}


		if(j==0){
			System.out.println(d+"は素数です！");
		}
		else{
			System.out.println(d+"は合成数です...");
		}}
	}
}
