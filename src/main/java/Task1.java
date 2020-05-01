import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a=");
        int a = sc.nextInt();
        System.out.println("b=");
        int b = sc.nextInt();
        System.out.println("c=");
        int c = sc.nextInt();
        int answer = Math.min( Math.min(a,b), c);
        System.out.println("answer");
        System.out.println(answer);
    }
}
