import java.sql.Array;
import java.util.Scanner;

public class ArrayTwoDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][5]; //Defining the array
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<2; i++){
            for (int j = 0; j<5; j++){
                arr[i][j] = sc.nextInt(); //Taking the input
            }
        }
        for(int i = 0; i<2; i++){
            for (int j = 0; j<5; j++){
                System.out.print(arr[i][j]+" "); //Printing the array
            }
        }
    }
}
