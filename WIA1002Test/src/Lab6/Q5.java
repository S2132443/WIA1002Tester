package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {
    
    public static int N;
    public static MyStack<Integer>[] tower = new MyStack[3];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        tower[0] = new MyStack();
        tower[1] = new MyStack();
        tower[2] = new MyStack();
        System.out.print("Enter number of disks: ");
        int num = s.nextInt();
        N = num;
        for (int i = N; i > 0; i--) {
            tower[0].push(i);
        }
        System.out.println("\n The tower is: ");
        display();
        move(N, 0, 1, 2);
        System.out.println();
    }
    
    public static void move(int n, int a, int b, int c) {
        if (n > 0) {
            move(n - 1, a, c, b);
            System.out.printf("Move a Disc from %c to %c\n", (char) (a + 'a' - 32), (char) (c + 'a' - 32));
            tower[c].push(tower[a].pop());
            display();
            move(n - 1, b, a, c);
        }
    }
    
    public static void display() {
        ArrayList<ArrayList<Integer>> arr = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arr.add((ArrayList<Integer>) tower[i].elements());
        }
        for (int layer = N; layer > 0; layer--) {
            for (int i = 0; i < 3; i++) {
                if (layer - 1 < arr.get(i).size()) {
                    System.out.printf(" %s  ", arr.get(i).get(layer - 1));
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println("");
        }
        
        System.out.println("--- --- ---");
        System.out.println(" A   B   C");
        System.out.println("");
    }
}
