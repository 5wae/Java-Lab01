import java.util.Scanner;
public class JPA01 {
    static Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        test();
        test();
    }
    
    public static void test() {
		System.out.println("Please enter score:");
		int score = keyboard.nextInt();
		if(score >= 60) {
			System.out.println("You pass");
		}
		System.out.println("End");
    }
}