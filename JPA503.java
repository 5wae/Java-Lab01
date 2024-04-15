import java.util.Scanner;

public class JPA503 {
    public static void main(String[] args) {

    	int m ,n;
        System.out.print("Input m :");
        m = new Scanner(System.in).nextInt();

        while(m!=999){
        	System.out.print("Input n :");
            n = new Scanner(System.in).nextInt();

            int ans0 = 1;
         	int ans1 = facTail(m,n,ans0);
         	System.out.println("Ans(尾端遞迴):"+ans1);
            int ans2 = facLoop(m,n);
            System.out.println("Ans(迴圈):"+ans2);

            System.out.print("Input m :");
            m = new Scanner(System.in).nextInt();
         }
    }

    //迴圈
    public static int facLoop(int m,int n){
    	int sum = 1;//累積要初始化為1
    	for(;n>0;n--)
    		sum = m*sum;
    	return sum;
    }

    public static int facTail(int m,int n,int sum){
    	if(n==0)
    		return sum;
    	else
    		return facTail(m,n-1, sum*m);
          
    }
}
