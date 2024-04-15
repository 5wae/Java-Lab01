import java.util.Scanner;

public class JPA504 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
    	System.out.print("Input m :");
    	int m = keyboard.nextInt();
            while(m!=999){
    	        System.out.print("Input n :");
    	        int n = keyboard.nextInt();
    	        System.out.println(R(m,n));
    	    
    	        System.out.print("Input m :");
    	        m = keyboard.nextInt();
            }

    }

    static int R(int m,int n){
    	if(m%n==0)
    		return n;
    	else {
    		int tem = n;
    		n = m%n;
    		m = tem;
    		return R(m,n);
    	}
    }
}