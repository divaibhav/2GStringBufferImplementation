/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 07-Aug-20
 *  Time: 1:42 PM
 */

/*
Create an application to accept the input from user and represent it in following
format
input : hello
output: _ _ _ _ _
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String inputString = sc.nextLine();

        StringBuilder input = new StringBuilder();
        for (int i = 0; i <inputString.length() ; i++) {
            input.append('_');
            if(i != inputString.length() - 1){
                input.append(' ');
            }
        }
        System.out.println(inputString);
        System.out.println(input);
    }
}
