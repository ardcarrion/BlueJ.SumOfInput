/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Input an integer: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

       for (int i = 1; i <= n; i++) {
              sum += i;
       }
       System.out.format("The sum of 1 to %d is: %d \n", n, sum); 
    }
}
