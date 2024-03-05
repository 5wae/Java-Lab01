import java.util.Scanner;

public class JPA105 {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		System.out.print("請輸入您的姓名：");
		String name = input.nextLine();
		System.out.println("Hi, " + name + ",請輸入您的銅板個數：");
		System.out.print("請輸入1元的數量：");
		int numOne = input.nextInt();

		System.out.print("請輸入5元的數量：");
		int numFive = input.nextInt();

		System.out.print("請輸入10元的數量：");
		int numTen = input.nextInt();

		System.out.print("請輸入50元的數量：");
		int numFifty = input.nextInt();

		int sum = 1 * numOne + 5 * numFive + 10 * numTen + 50 * numFifty;

		int thousand = sum / 1000;
		sum -= thousand * 1000;

		int hundred = sum / 100;
		sum -= hundred * 100;

		int ten = sum / 10;
		sum -= ten * 10;

		int dollar = sum;

		System.out.println("您的錢總共有：" + thousand + " 千 " + hundred + " 百 " + ten + " 十 " + dollar + " 元");
	}
}