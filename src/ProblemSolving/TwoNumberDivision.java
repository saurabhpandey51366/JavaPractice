package ProblemSolving;

import java.util.Scanner;

public class TwoNumberDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Divisor: ");
        float dividend = sc.nextFloat();
        System.out.println("Enter Dividend: ");
        float divisor = sc.nextFloat();
        float quo = dividend / divisor;
        System.out.println("Dividend/Divisor = " + quo);
    }
}
