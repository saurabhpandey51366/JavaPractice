package ProblemSolving;

import java.util.Scanner;
public class UtopianTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<=n; i++){
            if(i%2==0)
                sum++;
            else
                sum = sum * 2;
        }
        System.out.println(sum);
    }
}
