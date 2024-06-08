

public class JPA401{
    public static void main(String[] args) {
        int[] input=new int[10];
        int count=0,sum=0;
        double avg;
        System.out.println("請輸入10個整數:");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.printf("第%d個整數:",i+1);
            input[i]=sc.nextInt();
            if(input[i]>60){
                count++;
                sum=sum+input[i];
            }
        }
        avg=(double)sum/(double)count;
        System.out.printf("陣列中大於60的有%d個\n",count);
        System.out.printf("總合為%d\n",sum);
        System.out.printf("平均值為%f\n",avg);
        sc.close();
    }
}