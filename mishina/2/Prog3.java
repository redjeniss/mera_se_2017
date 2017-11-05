public class Prog3 {
    public static void main(String[] args) {
        int massiv[] = {1, 5, 10, 2, 3, 100, 10, 11, 3, -5};
        int maxValue = 0;
        int maxIndex = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (maxValue <= massiv[i]) {
                maxValue = massiv[i];
                maxIndex = i;
            }
            if (maxValue >= 100)
                break;
        }
        System.out.println(maxIndex);
    }
}