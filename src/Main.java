import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание №1");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary;
        }
        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");

    }

    public static void task2() {
        System.out.println("Задание №2");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int maxExpenditure = salaryArray[0];
        int minExpenditure = salaryArray[0];

        for (int salary : salaryArray) {
            if (salary < minExpenditure) {
                minExpenditure = salary;
            }
            if (salary < maxExpenditure) {
                maxExpenditure = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenditure + " рублей. Максимальная сумма трат за день составила " + maxExpenditure + " рублей");
    }

    public static void task3() {
        System.out.println("Задание №3");
        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary;
        }
        double salaryAverage = (double) salarySum / salaryArray.length;

        System.out.println("Средняя сумма трат за месяц составила " + salaryAverage + " рублей");
    }

    public static void task4() {
        System.out.println("Задание №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
        System.out.print(reverseFullName[i]);}
    }
}


