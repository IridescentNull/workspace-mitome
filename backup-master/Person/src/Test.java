/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person taro = new Person();
		taro.name="山田太郎";
		taro.talk();
		taro.walk();
		taro.run();
		taro.age=20;
		taro.tel="090-1234-5678";
		taro.email="BBB@gmail.com";
		taro.prefecture="千葉";
		taro.job="会社員";
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.tel);
		System.out.println(taro.email);
		System.out.println(taro.prefecture);
		System.out.println(taro.job);

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.talk();
		jiro.walk();
		jiro.run();
		jiro.age=18;
		jiro.tel="1234-23456";
		jiro.email="4567@yahoo.co.jp";
		jiro.prefecture="神奈川";
		jiro.job="学生";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.tel);
		System.out.println(jiro.email);
		System.out.println(jiro.prefecture);
		System.out.println(jiro.job);


		Person hanako=new Person();
		hanako.name="大塚花子";
		hanako.talk();
		hanako.walk();
		hanako.run();
		hanako.age=78;
		hanako.tel="5667-368";
		hanako.email="iuiruhgh@juk.co.jp";
		hanako.prefecture="大阪";
		hanako.job="無職";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.tel);
		System.out.println(hanako.email);
		System.out.println(hanako.prefecture);
		System.out.println(hanako.job);


		Person hiroumi=new Person();
		hiroumi.name="見留広海";
		hiroumi.talk();
		hiroumi.walk();
		hiroumi.run();
		hiroumi.age=28;
		hiroumi.tel="080-5468-6528";
		hiroumi.email="mitome19@gmail.com";
		hiroumi.prefecture="東京都";
		hiroumi.job="会社員";
		System.out.println(hiroumi.name);
		System.out.println(hiroumi.age);
		System.out.println(hiroumi.tel);
		System.out.println(hiroumi.email);
		System.out.println(hiroumi.prefecture);
		System.out.println(hiroumi.job);

		Robot aibo = new Robot();
		aibo.name="アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();

		Robot doraemon=new Robot();
		doraemon.name="あおだぬき";
		doraemon.talk();
		doraemon.walk();
		doraemon.run();



	}

}
