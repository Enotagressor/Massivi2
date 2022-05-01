import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        task2();
    }
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element:arr) {
            sum+=element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
//         Решение через сортировку
//
//        Arrays.sort(arr);
//        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей");
//        System.out.println("Максимальная сумма трат за день составила " + arr[arr.length -1] + " рублей");

        //Решение через переменные

        int min = 230_000;
        for (int k : arr) {
            if (k < min) {
                min = k;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        int max = 90_000;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        int day = 30;
        for (int element:arr) {
            sum+=element;
        }
        double aver = (double) sum / day;
        System.out.println("Средняя сумма трат за месяц составила " + aver +  " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = (reverseFullName.length - 1); i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }

}