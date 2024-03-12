import java.util.*;
public class JPA03 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        test();
        test();
    }
    
    static void test() {
        System.out.println("Input an interger:");
		int num = input.nextInt();
		if(num % 2 != 0) {
			System.out.println("The number is odd.");
		} else {
			System.out.println("The number is even.");
		}
    }
}