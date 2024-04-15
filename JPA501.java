import java.util.Scanner;

public class JPA501 {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("Input n (0<=n<=16):");
        int i = keyboard.nextInt();

        while(i!=999){
        	if(i<=16&&i>=0)
        	   System.out.println(i+"的階乘 = "+R(i));
        	System.out.print("Input n (0<=n<=16):");
        	i = keyboard.nextInt();
        }
    }

    static int R(int i ){
    	if(i==0)
    		return 1;
    	else 
    		return  i*R(i-1);
    }
}