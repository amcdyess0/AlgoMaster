import java.util.Scanner;

public class partFour {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = scanner.nextInt();
        int[] arr=new int[n];
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
        long running_time=0;

        for(int i=0;i<1000;i++) {
            arr[i] = (int)(Math.random()*n + 1);
            long start_time=System.currentTimeMillis();
            long end_time=System.currentTimeMillis();
            running_time+=(end_time-start_time);
        }

        System.out.println("Number of items: "+n);
        System.out.println("Average running time: "+running_time/1000.0+" milli seconds");
    }
}
