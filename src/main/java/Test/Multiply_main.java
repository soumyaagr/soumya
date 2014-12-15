package test;
import java.util.Scanner;

public class Multiply_main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a, b, m;
        a = s.nextInt();
        b = s.nextInt();
        Multiply M= new Multiply();
        m = M.mul(a,b);
        System.out.println("a*b=" + m +"\n");
    }
     
}
