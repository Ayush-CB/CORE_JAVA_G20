package Lec_6;

public class Insertion_sort {
    public static void main(String[] args) {
        int arr[]={8,9,4,2,1,11,8,9};
        sort(arr);
    }
    public static void sort(int arr[]){
        for(int i=1;i< arr.length;i++){
            int j=i-1;
            int item=arr[i];
            while(j>=0 && arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=item;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
