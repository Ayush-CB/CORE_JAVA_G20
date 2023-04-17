package Lec_4;

public class Rotate_Array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotate(arr,30);
    }
    public static void rotate(int arr[],int k) {
        for (int i = 1; i <= (k % arr.length); i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
