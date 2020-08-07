/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 07-Aug-20
 *  Time: 1:08 PM
 */

public class Demo1StringBuilder {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello");
        StringBuilder stringBuilder  = new StringBuilder("world");

        stringBuffer.append(" world");
        stringBuilder.append(" hello");
        System.out.println("stringBuffer => " + stringBuffer );
        System.out.println("stringBuilder => " + stringBuilder);

        stringBuffer.delete(0,5);
        stringBuilder.delete(0,5);
        System.out.println("stringBuffer => " + stringBuffer );
        System.out.println("stringBuilder => " + stringBuilder);

        stringBuffer.deleteCharAt(0);
        stringBuilder.deleteCharAt(0);

        stringBuffer.setCharAt(0,'A');
        stringBuilder.setCharAt(0,'A');

        System.out.println("stringBuffer => " + stringBuffer );
        System.out.println("stringBuilder => " + stringBuilder);




    }
}
//String, StringBuffer,StringBuilder











/*
Create an application to accept the input from user and represent it in following
format
input : hello
output: _ _ _ _ _
 */
