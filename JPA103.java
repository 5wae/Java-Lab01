import java.util.Scanner;

public class JPA103 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Please input:");
    	
    	double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), sum = 0, average = 0;
    	sum = a + b + c;
    	average = sum / 3;
    	
    	System.out.printf("Average: %.2f\n", average);
    }
}
