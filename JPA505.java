import java.util.Scanner;

public class JPA505 {
	static int sum = 0;
    public static void main(String[] args) {
         System.out.print("Input the number :");
         int m = new Scanner(System.in).nextInt();
         int ans =sum2(m);
         System.out.printf("Ans:%d",ans);
    }
    public static int sum2(int m) {
    	    if(m==1)
    	    	return 2;
    	    else {
    
                sum = sum + sum2(m-1)+2*m;

                return sum;
            }
    }
}