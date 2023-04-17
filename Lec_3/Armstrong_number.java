package Lec_3;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count_dig=count(n);
        int res=arms(n,count_dig);
        if(n==res){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }

    }
    public static int count(int n){
        int c=0;
        while(n>0){
            c++;
            n=n/10;
        }
        return c;
    }
    public static int arms(int n,int num_of_digits){
        int result=0;
        while(n>0){
            int dig=n%10;
            result=result+(int)Math.pow(dig,num_of_digits);
            n=n/10;
        }
        return result;
    }
}
