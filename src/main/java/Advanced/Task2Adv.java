package Advanced;

public class Task2Adv {
    public static void main(String[] args) {
        int i = 10;
        String s = "*";
       do {
           System.out.println(s);
           i--;
           while (i >=1 && i<10) {
               System.out.println(s + s);
               i--;
           }
       } while (i >= 0);

    }
}
