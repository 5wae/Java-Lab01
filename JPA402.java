import java.util.Scanner;

public class JPA402 {
    public static void main(String[] args) {
        int head;
        double sum=0,avg;
        double[] score;
        System.out.print("請輸入學生人數:");
        Scanner sc=new Scanner(System.in);
        head=sc.nextInt();
        score=new double[head];
        for(int i=0;i<head;i++){
            System.out.printf("第%d個學生的成績:",i+1);
            score[i]=sc.nextDouble();
            sum=sum+score[i];
        }
        avg=sum/(double)head;
        System.out.printf("人數:%d\n",head);
        System.out.printf("總分:%.2f\n",sum);
        System.out.printf("平均:%.2f\n",avg);
        sc.close();
    }
}