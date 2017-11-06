public class ReversedArgs {
    public static void main(String[] args) {
        String[] reversed = new String[args.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = args[args.length - 1 - i];
        }
        System.out.print(String.join(" ", reversed));
    }
}
