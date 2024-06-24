import java.util.Scanner;
public class JavaArrayAssessment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10]; //Creating the Array
        System.out.println("Enter the array elements: ");
        for(int i =0; i<arr.length; i++) {
            System.out.println("Enter element " + i);
            arr[i] = sc.nextInt(); //Taking input for the array
        }
        System.out.print("[");
        for(int i =0; i<arr.length; i++) {
            if(i==arr.length-1)
                System.out.print(arr[i]); //Printing the array
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }
}
