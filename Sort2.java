import java.util.Arrays;
public class Sort2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Изначальный массив");
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");

            }
            System.out.print(numbers[i]);
        }
        System.out.print("]");

        Arrays.sort(numbers);

        System.out.println();

        System.out.println("Конечный массив");
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.print(", ");

            }
            System.out.print(numbers[i]);
        }
        System.out.print("]");
    }
}
