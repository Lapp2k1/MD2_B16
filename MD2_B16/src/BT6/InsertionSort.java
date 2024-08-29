package BT6;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();


        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mảng ban đầu:");
        printArray(arr);


        insertionSortWithSteps(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);

        scanner.close();
    }


    public static void insertionSortWithSteps(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;


            System.out.println("Bước " + i + ":");
            printArray(arr);
        }
    }


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
