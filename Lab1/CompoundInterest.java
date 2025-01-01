//package Lab1;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double principal_amount = sc.nextDouble();
        double final_amount = principal_amount*(1 + (10 * (5.0 / 100)));
        System.out.println(final_amount);
        sc.close();
    }
}
