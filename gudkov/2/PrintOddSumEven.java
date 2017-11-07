public class PrintOddSumEven {
    public static void main(String[] args) {
        int num = 15;
        int sum = 0;

        System.out.print("Odd numbers: ");
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        System.out.println("Sum of even numbers: " + sum);
    }
}
