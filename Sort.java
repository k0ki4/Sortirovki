public class Sort {
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

        boolean noSort = false;
        while (!noSort) {
            noSort = true;
            for (int i = 8; i < numbers.length && i != -1; i--) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                    noSort = false;
                }
            }
        }
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
