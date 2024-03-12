import java.util.*;
public class JPA07 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        test();        
        test();
        test();
        test();
    }
    
    static void test() {
        System.out.print("請輸入三個整數: ");
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		int c = keyboard.nextInt();
		if(a <= 0 || b<=0 || c <= 0) {
			System.out.println("不可以構成三角形");
		} else if(a + b > c && b + c > a && a + c > b) {
			if((a * a + b * b) == c * c || (b * b + c * c) == a * a || (a * a + c * c) == b * b) {
				System.out.println("直角三角形");
			}
			if((a * a + b * b) < c * c || (b * b + c * c) < a * a || (a * a + c * c) < b * b) {
				System.out.println("鈍角三角形");
			}
			if((a * a + b * b) > c * c && (b * b + c * c) > a * a && (a * a + c * c) > b * b) {
				System.out.println("銳角三角形");
			}
		} else {
			System.out.println("不可以構成三角形");
		}
    }
}