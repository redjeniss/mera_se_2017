public class GetIndexOfMaxNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 2, 3, 33, 300, 3, 3, -2};
        int indexOfMax = 0;
        int max = arr[indexOfMax];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                break;
            } else if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
        }
        System.out.println("Index of the biggest number in array: " + indexOfMax);
    }
}
