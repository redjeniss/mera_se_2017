/**
 * Task #1,
 * here input parameters as command line parameters
 */
public class TwoLongNumeric {

    public static void main(String[] args) {
        if (args.length == 2) {

            try {
                Long a = Long.parseLong(args[0]);
                Long b = Long.parseLong(args[1]);

                System.out.println(String.format("a = %d b = %d", a, b));

                if (a % 2 == 0) {
                    System.out.println(String.format("a + b = %d", a + b));
                }

                if (b % 2 == 0) {
                    System.out.println(String.format("a - b = %d", a - b));
                }

                if (a > 0) {
                    System.out.println(String.format("a * b = %d", a * b));
                }

                if (b > 0) {
                    float div = (float) a / b;
                    System.out.println(String.format("a / b = %.3f", div));
                }
            }
            catch (NumberFormatException e) {
                System.out.println(String.format("Invalid format of input parameters:\n%s", e));
            }

        } else{
            System.out.println("a and b are expected as program arguments: a, b");
        }
    }
}
