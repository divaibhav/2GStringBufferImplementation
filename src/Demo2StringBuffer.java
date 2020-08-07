/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 06-Aug-20
 *  Time: 1:38 PM
 */

public class Demo2StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("sb-->" + sb);
        String s = "The quick brown fox jumps over the lazy dog";
        //sb.append(s);
        System.out.println("sb-->" + sb);
        System.out.println("capacity of sb = " + sb.capacity() +
                ",\t" +" length of sb = " + sb.length() );
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            System.out.println("capacity of sb = " + sb.capacity() +
                    ",\t" +" length of sb = " + sb.length() );
        }

    }
}
