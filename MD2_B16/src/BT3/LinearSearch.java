package BT3;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];


        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }


        System.out.print("Nhập giá trị cần tìm: ");
        int target = scanner.nextInt();


        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                position = i;
                break;
            }
        }


        if (position != -1) {
            System.out.println("Giá trị " + target + " xuất hiện tại vị trí: " + position + 1);
        } else {
            System.out.println("Không tìm thấy giá trị " + target + " trong mảng.");
        }

        scanner.close();
    }
}
