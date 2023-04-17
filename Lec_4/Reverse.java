package Lec_4;

public class Reverse {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        approach1(arr);
        appraoch2(arr);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void approach1(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    public static void appraoch2(int arr[]){
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
