import java.util.Scanner;
public class JPA502 {
    public static void main(String[] args) {
        int size = 0;

        do{
            System.out.print("Input n ( 0 <= n <= 16 ):");
            size = new Scanner(System.in).nextInt();
        }while(size>16&&size!=999||size<0&&size!=999);

        while(size!=999){
            int L = facLoop(size);
            System.out.printf("%d的階乘(迴圈) = %d\n",size,L);
            int T = facTail(size,1);
            System.out.printf("%d的階乘(尾遞迴) = %d\n",size,T);

            do{
                System.out.print("Input n ( 0 <= n <= 16 ):");
                size = new Scanner(System.in).nextInt();
            }while(size>16&&size!=999||size<0&&size!=999);
         }
    }

    public static int facLoop(int a){
        int sum = 1;

        for(int b=1;b<=a;b++)
            sum = b*sum;

        return sum;
    }

    public static int facTail(int a,int b){
        if(a==1)
            return b;
        else
            return facTail(a-1,a*b);
    }
}