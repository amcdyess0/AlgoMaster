import java.util.Scanner;

public class partThree {
    public static int bubbleSort(int[] arr) {
        int swap=0;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    swap++;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return swap;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = scanner.nextInt();
        long running_time=0;

        for(int i=0;i<1000;i++) {
            int[] arr=new int[n];

            for(int j=0;j<n;j++) {
                arr[j] = (int)(Math.random()*n + 1);
            }
            long start_time=System.currentTimeMillis();
            bubbleSort(arr);
            long end_time=System.currentTimeMillis();
            running_time+=(end_time-start_time);
        }

        System.out.println("Number of items: "+n);
        System.out.println("Average running time: "+running_time/1000.0+" milli seconds");
    }
}

