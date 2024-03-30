public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] arr = new int[]{1, 2, 3};
        float[] arr1 = {1.57f, 7.654f, 9.986f};
        double[] arr2 = {12.456, 56.45, 85.001, 99.25};

        //Задача 2
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println();
        for (int i = 0; i < arr1.length - 1; i++) {
            System.out.print(arr1[i] + ",");
        }
        System.out.print(arr1[arr1.length - 1]);
        System.out.println();
        for (int i = 0; i < arr2.length - 1; i++) {
            System.out.print(arr2[i] + ",");
        }
        System.out.print(arr2[arr2.length - 1]);
        System.out.println();

        //Задача 3
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[0]);
        System.out.println();
        for (int i = arr1.length - 1; i > 0; i--) {
            System.out.print(arr1[i] + ",");
        }
        System.out.print(arr1[0]);
        System.out.println();
        for (int i = arr2.length - 1; i > 0; i--) {
            System.out.print(arr2[i] + ",");
        }
        System.out.print(arr2[0]);
        System.out.println();

        //Задача 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
            }
            System.out.print(arr[i]);
            if (i != arr.length) {
                System.out.print(",");
            }
        }

    }
}