public class JPA403 {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6}};
        int[][] b={{7,8,9},{10,11,12}};
        int[][] c=new int[2][3];
        System.out.println("陣列A的內容為:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
                System.out.printf("\t%d",a[i][j]);
            System.out.printf("\n");
        }
        System.out.println("陣列B的內容為:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
                System.out.printf("\t%d",b[i][j]);
            System.out.printf("\n");
        }
        //下面處理陣列相加
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
                c[i][j]=a[i][j]+b[i][j];
        }
        System.out.println("陣列A+B=C,陣列C的內容為:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
                System.out.printf("\t%d",c[i][j]);
            System.out.printf("\n");
        }
    }
}