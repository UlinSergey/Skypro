import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] array1 = new int[]{1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = {678, 4, 774};

        System.out.println("Задание №2");
        for (int i = 0; i <= 2; ++i) {
            System.out.print(array1[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i <= 2; ++i) {
            System.out.print(array2[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i <= 2; ++i) {
            System.out.print(array3[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");
        System.out.println("Задание №3");


        for (int i = array1.length - 1; i >= 0; --i) {
            System.out.print(array1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; --i) {
            System.out.print(array2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; --i) {
            System.out.print(array3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.println("Задание №4");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                array1[i] += 1;
            }
        }

        System.out.println(Arrays.toString(array1));

    }
}