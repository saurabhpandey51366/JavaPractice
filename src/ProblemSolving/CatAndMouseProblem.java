package ProblemSolving;

import java.util.*;

public class CatAndMouseProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int dist1 = Math.abs(x - z);
            int dist2 = Math.abs(y - z);
            if (dist1 == dist2)
                System.out.println("Mouse C");
            else if (dist1 < dist2)
                System.out.println("Cat A");
            else
                System.out.println("Cat B");
        }
    }
}