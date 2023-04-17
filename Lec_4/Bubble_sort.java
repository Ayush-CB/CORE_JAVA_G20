package Lec_4;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={1,3,2,7,9,4};
        bubble(arr);
    }
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
