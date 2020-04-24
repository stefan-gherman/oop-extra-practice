package exercises.java;

public class Exercise4 {
    public static void main(String[] args) {
        DataObject[] arr = new DataObject[3];
        DataObject obj1 = new DataObject();
        DataObject obj2 = new DataObject();
        DataObject obj3 = new DataObject();

        arr[0] = obj1;
        arr[1] = obj2;
        arr[2] = obj3;

        int sum = 0;

        for (DataObject obj: arr

             ) {
            sum += obj.count;
        }

        System.out.println(sum);
    }
}