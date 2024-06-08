public class JPA405 {
    public static void main(String[] args) {
        String[] a={"A","B","C","D","E","F","G","H","I","J"};
        String[] b=new String[10];
        for(int i=0;i<10;i++)
            b[i]=a[9-i];
        System.out.print("反轉陣列資料之前:");
        for(int i=0;i<10;i++)
            System.out.printf(" %s",a[i]);
        System.out.println();
        System.out.print("反轉陣列資料之後:");
        for(int i=0;i<10;i++)
            System.out.printf(" %s",b[i]);
    }
}