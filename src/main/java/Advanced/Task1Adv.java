package Advanced;

public class Task1Adv {
    public static void main(String[] args) {
        System.out.println(min(new int[]{2, 4, 6}));
        System.out.println(min(new int[]{2,4,6,1,90,2,0}));
    }

    public static int min(int[] a) {
        int minValue = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] < minValue){
                minValue = a[i];
            }
        }
        return minValue;
    }

}

