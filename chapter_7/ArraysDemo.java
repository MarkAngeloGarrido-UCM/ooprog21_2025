import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] arr = new int[5]; 

        display("Original array:             ", arr);

        Arrays.fill(arr, 8);
        display("After filling with 8s:       ", arr);

        arr[0] = 8;
        arr[1] = 6;   
        arr[2] = 8;
        arr[3] = 6;  
        arr[4] = 3;
        display("After changing two values:   ", arr);

        Arrays.sort(arr);
        display("After sorting:              ", arr);
    }

    public static void display(String message, int array[]) {
        System.out.print(message + "\t");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
