package BT2;

import java.util.*;

public class SearchAny {

    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static Boolean searchNumber(int[][] arr, int number) {
        List<Map<Integer, Integer>> positions = new ArrayList<>();

        boolean check = false;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {

                    Map<Integer, Integer> position = new HashMap<>();
                    position.put(i, j);
                    positions.add(position);

                    check = true;
                }
            }
        }


        if (check) {
            System.out.println("Số " + number + " xuất hiện tại các vị trí:");
            for (Map<Integer, Integer> pos : positions) {
                for (Map.Entry<Integer, Integer> entry : pos.entrySet()) {
                    System.out.println("Hàng: " + entry.getKey() + ", Cột: " + entry.getValue());
                }
            }
        } else {
            System.out.println("Số " + number + " không có trong mảng.");
        }

        return check;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] arr = getArr();


        System.out.println("Mảng 2 chiều ngẫu nhiên 20x20:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.print("Nhập số cần tìm trong mảng: ");
        int number = scanner.nextInt();


        Boolean found = searchNumber(arr, number);

        if (found) {
            System.out.println("Tìm kiếm thành công.");
        } else {
            System.out.println("Không tìm thấy số trong mảng.");
        }

        scanner.close();
    }
}
