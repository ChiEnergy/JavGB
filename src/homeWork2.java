public class HomeWork2 {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        boolean P = Count(a, b);
        System.out.println(P);

        printNumber(5);

        boolean step = compareNumbers(-2);
        System.out.println(step);

        printMessage(3,"Hello World!");
    }

    public static boolean Count(int a, int b) {

        int sum = a + b;
        return (10 < sum && sum <= 20);
    }

    public static void  printNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else if (number < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Другое число");
        }
    }

    public static boolean compareNumbers(int number) {
        return (number < 0);
    }

    public static void printMessage(int count, String message) {
        int counter = 0;
        while (counter < count) {
            System.out.println(message);
            counter++;
        }

    }
}
