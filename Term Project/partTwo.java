import java.util.Scanner;
import java.util.Arrays;

public class partTwo {
    static Scanner sc = new Scanner(System.in);
    static int input;
    static int[] arr = new int[10];

    public static int[] selectionSort(int[]arr){
        for(int i = 0; i < arr.length-1;i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    public static void main(String[] args){
        System.out.println("Enter a maximum: ");
        input = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*input + 1);
        }
        selectionSort(arr);
        System.out.println("Selection Sorted Numbers:" + Arrays.toString(arr));
    }
}
