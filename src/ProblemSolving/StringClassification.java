package ProblemSolving;

import java.io.*;


public class StringClassification {
    public static void main(String[] args) {
        String str = "Pass@12345_One_Two_Three";
        char ch[] = str.toCharArray();
        int upper = 0, lower = 0, number = 0, special = 0, total;
        for(int i=0; i<str.length(); i++){
            if (ch[i] >= 'A' && ch[i] <= 'Z')
                upper++;
            else if (ch[i] >= 'a' && ch[i] <= 'z')
                lower++;
            else if (ch[i]>= '0' && ch[i]<= '9')
                number++;
            else
                special++;
        }
        total = upper+lower+number+special;
        System.out.println("Total Uppercase Characters: " + upper);
        System.out.println("Total Lowercase Characters: " + lower);
        System.out.println("Total Numeric Characters: " + number);
        System.out.println("Total Special Characters: " + special);
        System.out.println("Total Characters: " + total);
    }
}
