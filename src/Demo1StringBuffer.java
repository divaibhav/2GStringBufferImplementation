/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 06-Aug-20
 *  Time: 1:33 PM
 */

public class Demo1StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer(20);
        StringBuffer sb2 = new StringBuffer("hello");

        System.out.println("capacity of sb = " + sb.capacity() +
                ",\t" +" length of sb = " + sb.length() );
        System.out.println("capacity of sb1 = " + sb1.capacity() +
                ",\t" +" length of sb1 = " + sb1.length() );
        System.out.println("capacity of sb2 = " + sb2.capacity() +
                ",\t" +" length of sb2 = " + sb2.length() );
    }
}
