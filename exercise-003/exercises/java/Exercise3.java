package exercises.java;

public class Exercise3 {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int sum=0;
        for (int number:arr
             ) {
            sum+=number;
        }
        System.out.println(sum);
    }
}
