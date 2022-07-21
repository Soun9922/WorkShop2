package workshop2;

import java.util.Scanner;

public class TotalNumberOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0 , a = 0;
        System.out.println("Please Enter String to count total number of Characters : ");
        String str = sc.nextLine();
        while (a < str.length()){
            if (str.charAt(a) != ' '){
                count++;
            }
            a++;
        }
        System.out.println("\nThe total number of characters : "+count);
    }
}
