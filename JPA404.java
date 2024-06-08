public class JPA404{
    public static void main(String[] args) {
        int[] fi=new int[10];
        fi[0]=0;
        fi[1]=1;
        for(int i=2;i<10;i++)
            fi[i]=fi[i-1]+fi[i-2];
        for(int i=0;i<10;i++)
            System.out.printf("%d\n",fi[i]);
    }
}