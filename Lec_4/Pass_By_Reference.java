package Lec_4;

public class Pass_By_Reference {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int brr[]=new int[5];
        arr[0]=1;
        brr[0]=2;
        System.out.println(arr[0]+"  "+brr[0]);
        swap(arr,brr);
        System.out.println(arr[0]+"  "+brr[0]);

    }
    public static void swap(int arr[],int brr[]){
        int temp=arr[0];
        arr[0]=brr[0];
        brr[0]=temp;
    }
}
