import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int b = findPower(x,n);
        System.out.println(b);
    }
    public static int findPower(int x,int n){
        if(n == 0){
            return 1;
        }
        int a = findPower(x,n-1);
        int po = x * a;
        return po;
    }
}
