import java.util.Scanner;

public class printDecreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        printDecreasingNum(n);

    }

    public static void printDecreasingNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasingNum(n-1);
    }
}
