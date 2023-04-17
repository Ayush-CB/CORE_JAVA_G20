package Lec_3;

import java.util.Scanner;

public class Array_Basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
//        arr[5]=6;
        System.out.println(arr[2]);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]);
        }
//        for(int i:arr){
//            System.out.println(i);
//        }
        System.out.println(arr[0]+"  "+arr[1]);
        swap(arr[0],arr[1]);
        System.out.println(arr[0]+"  "+arr[1]);

    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
