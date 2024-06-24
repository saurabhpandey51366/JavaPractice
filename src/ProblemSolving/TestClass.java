package ProblemSolving;

public class TestClass {
    public static void main(String args[]) {
        int n = 5;
        //Loop to iterate over each row
        for (int i = 1; i <= n; i++) {
            //Loop to iterate over each column
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //Loop to iterate over each column in reverse order
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
