
// import java.util.Arrays;
public class ArrayInsertion {

    public static void InsertElement(int arr[], int n, int x, int pos) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int x = 7;
        int pos = 3;

        InsertElement(arr, arr.length, x, pos);
    }
}
