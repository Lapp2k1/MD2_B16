package BT4;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];


        System.out.println("Nhập các phần tử của mảng đã sắp xếp tăng dần:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();


        int position = binarySearch(arr, target);


        if (position != -1) {
            System.out.println("Giá trị " + target + " xuất hiện tại vị trí: " + position);
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }

        scanner.close();
    }


    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (arr[mid] == target) {
                return mid;
            }


            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
