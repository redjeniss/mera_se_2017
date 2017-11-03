/**
 * класс демонстрирующий работу с циклами. выводит квадраты чисел, не больше 10000, начиная с заданного
 */
public class LoopExample {

    public static void main(String[] args) {


        int a = 42;
        while (a < 120) {
            int square = a * a;
            if (square > 10000) {
                System.out.println("останавливаемся, число слишком большое");
                // break позволяет выходить из циклов while тоже
                break;
            }
            System.out.println(square);
            a++;
        }
    }
}
