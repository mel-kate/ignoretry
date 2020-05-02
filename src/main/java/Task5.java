public class Task5 {

        public static void main(String[] args) {
            System.out.println(reverse("Hello world!!!"));
        }

        public static String reverse(String str) {
            StringBuffer sbf = new StringBuffer(str);
            sbf.reverse();
            return sbf.toString();
        }
}
