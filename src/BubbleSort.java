// String
String[] stringArray = new String[size];
// int
int[] intArray = new int[size];
// double
double[] doubleArray = new double[size];
// char
char[] charArray = new char[size];
Array of objects: Assuming the class name is ClassName:
ClassName[] objectArray = new ClassName[size];

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray = {5, 2, 8, 1, 3};
        bubbleSort(intArray);
        System.out.println("Sorted array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}