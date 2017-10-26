//Given an integer, n, perform the following conditional actions:
//        If n is odd, print Weird
//        If n is even and in the inclusive range of 2 to 5, print Not Weird
//        If n is even and in the inclusive range of 6 to 20, print Weird
//        If n is even and greater than 20, print Not Weird

import java.util.*;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1)ans = "Weird";
        else{
            //Complete the code
            if (n >= 2 && n <= 5) System.out.println("Not Weird");
            else if (n >= 6 && n <= 20) System.out.println("Weird");
            else if (n > 20) System.out.println("Not Weird");
        }
        System.out.println(ans);
    }
}
