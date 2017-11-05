/**
 * Task #3
 */
public class MaxIntArrayValue {
    public static void main(String[] args) {

        int[] elements = {1, 5, 10, 11, 3, 12, 3, 83, 398, 89};

        int max = 0;
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > 100) break;
            else {
                if (elements[i] > max) {
                    max = elements[i];
                    index = i;
                }
            }
        }
        System.out.println(String.format("Max value: %d, index=%s", max, index));
    }
}
