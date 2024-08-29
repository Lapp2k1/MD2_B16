package BT7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseBinarySearch {

    public static void main(String[] args) {

        Integer[] arr = getArr();
        System.out.println("Mảng đã sắp xếp giảm dần:");
        printArray(arr);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập giá trị max: ");
        int max = scanner.nextInt();


        int start = binarySearchMin(arr, min);
        int end = binarySearchMax(arr, max);


        if (start == -1 || end == -1 || start > end) {
            System.out.println("Không tìm thấy số nào trong khoảng từ " + min + " đến " + max);
        } else {
            System.out.println("Các số trong khoảng từ " + min + " đến " + max + ":");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nSố lượng số tìm thấy: " + (end - start + 1));
        }

        scanner.close();
    }


    private static Integer[] getArr() {
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }


    private static void printArray(Integer[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int binarySearchMin(Integer[] arr, int min) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= min) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right >= 0 && arr[right] >= min ? right : -1;
    }

    private static int binarySearchMax(Integer[] arr, int max) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= max) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left < arr.length && arr[left] <= max ? left : -1;
    }
}
