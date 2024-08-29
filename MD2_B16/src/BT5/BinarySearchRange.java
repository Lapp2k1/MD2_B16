package BT5;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Integer[] arr = getArr();
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(arr));


        System.out.print("Nhập giá trị min: ");
        int min = scanner.nextInt();
        System.out.print("Nhập giá trị max: ");
        int max = scanner.nextInt();


        int startPos = findCeil(arr, min);
        int endPos = findFloor(arr, max);


        if (startPos <= endPos && startPos != -1 && endPos != -1) {
            System.out.println("Các số trong khoảng [" + min + ", " + max + "] là:");
            for (int i = startPos; i <= endPos; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nSố lượng số tìm thấy: " + (endPos - startPos + 1));
        } else {
            System.out.println("Không tìm thấy số nào trong khoảng [" + min + ", " + max + "].");
        }

        scanner.close();
    }

    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }


    private static int findCeil(Integer[] arr, int min) {
        int left = 0;
        int right = arr.length - 1;
        int ceil = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= min) {
                ceil = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ceil;
    }


    private static int findFloor(Integer[] arr, int max) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= max) {
                floor = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return floor;
    }
}
