package assignment07.q1;

public class MinFromArray {

    public static <T extends Number> Number minfromArray(T[] arr){
        T min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i].intValue() < min.intValue()) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Double[] arr = {12.3, 5.5, 10.2, 3.5, 4.9, 7.1, 6.5, 12.2, 3.2};
        System.out.println(minfromArray(arr));
    }
}
