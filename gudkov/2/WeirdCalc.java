public class WeirdCalc {
    public static void main(String[] args) {
        long a = -100L;
        long b = 51L;

        if (a % 2 == 0) {
            System.out.println(a + b);
        }
        if (b % 2 == 0) {
            System.out.println(a - b);
        }
        if (a > 0) {
            System.out.println(a * b);
        }
        if (b > 0) {
            System.out.println(a / b);
        }
    }
}
