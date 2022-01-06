import java.util.Scanner;
import java.util.Arrays;

public class partOne {
    static Scanner sc = new Scanner(System.in);
    static int input;
    static int[] arr = new int[10];

    public static void bubbleSort(int[]arr){
        int temp;

        for (int i = arr.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Enter a maximum: ");
        input = sc.nextInt();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*input + 1);
        }
        bubbleSort(arr);
        System.out.println("Bubble Sorted Numbers:" + Arrays.toString(arr));
    }
}
