package main.java;

public class Task5 {

        public static void main(String args) {
           reverse(args);
        }

        public static String reverse(String str) {
            StringBuffer sbf = new StringBuffer(str);
            sbf.reverse();
            return sbf.toString();
        }
}
