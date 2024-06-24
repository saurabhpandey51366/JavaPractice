import java.util.Scanner;

public class ArrayThreeDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][3][5]; //Defining the array
        for(int i = 0; i<2; i++){
            for (int j = 0; j<3; j++){
                for(int k = 0; k<5; k++) {
                    System.out.println("Enter age of School-" + i+1 + " Class-" + j+1 + " Student-" + k+1);
                    arr[i][j][k] = sc.nextInt(); //Taking the input
                }
            }
        }
        System.out.println("Ages of Students: ");
        for(int i = 0; i<2; i++){
            for (int j = 0; j<3; j++){
                for(int k = 0; k<5; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
            }
        }
    }
}