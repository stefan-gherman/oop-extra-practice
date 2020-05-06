package exercises.java;

public class Exercise5 {

    public static void main(String[] args) {
        DataObject6[] arr = new DataObject6[5];

        DataObject6 elem1 = new DataObject6(12, "friday");
        DataObject6 elem2 = new DataObject6(15, "saturday");
        DataObject6 elem3 = new DataObject6(24, "saturday");
        DataObject6 elem4 = new DataObject6(123, "saturday");
        DataObject6 elem5 = new DataObject6(122, "friday");

        arr[0] = elem1;
        arr[1] = elem2;
        arr[2] = elem3;
        arr[3] = elem4;
        arr[4] = elem5;

        int sum=0;

        for (DataObject6 dobj: arr
             ) {
            if(dobj.code.equals("friday")) {
                sum += dobj.count;
            }
        }
        System.out.println(sum);
    }
}
