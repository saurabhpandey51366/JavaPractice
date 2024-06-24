import java.util.Scanner;
public class JavaAssessment3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][][] = new int[2][2][2];
        int sum = 0, length_arr = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                for (int k = 0; k<2; k++){
                    System.out.println("Enter the customer age of Bank: " + i + " Branch: " + j + " Customer: " + k);
                    a[i][j][k] = sc.nextInt();
                    sum = sum + a[i][j][k];
                    length_arr++;
                }
            }
        }
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                for (int k = 0; k<2; k++){
                    if (a[i][j][k]>max)
                        max = a[i][j][k];
                    else
                        continue;
                }
            }
        }
        System.out.println("The ages of cutomers are: ");
        for (int i = 0; i<2; i++){
            for (int j = 0; j<2; j++){
                for (int k = 0; k<2; k++){
                    System.out.print(a[i][j][k] + " ");
                }
            }
        }
        System.out.println("\nMax Element: " + max);
        System.out.println("Sum : " + sum);
        System.out.println("Average: " + sum/length_arr);
    }
}
