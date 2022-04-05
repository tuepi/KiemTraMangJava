package KiemTraMang;

import java.util.Scanner;

public class KiemTraMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số phần tử muốn có trong mảng : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Thêm phần tử thứ " + i + " vào mảng : ");
            arr[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                sum += arr[j];
            }
        }
        System.out.println("Tổng các giá trị chẵn trong mảng là: " + sum);
        System.out.printf("Nhập giá trị cần tìm trong mảng: ");
        int a = scanner.nextInt();
        int z;
        boolean check = false;
        for (z = 0; z < arr.length; z++) {
            if (a == arr[z]) {
                System.out.println(a + " có vị trí thứ " + (z + 1) + " trong mảng.");
                check = true;
                break;
            }
        }
        if (check == false){
            System.out.println("Số vừa nhập không có trong mảng.");
        }
        if (check == true) {
            System.out.println("Xóa Phần tử vừa nhập có trong mảng thì mảng mới là: ");
            for (int i = z; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
        }
        System.out.println("Nhập vào giá trị cần thêm vào mảng: ");
        int b = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần thêm: ");
        int viTri = scanner.nextInt();
        System.out.println("Mảng mới sau khi thêm là: ");
        int[] newArr = new int[n + 1];
        for (int i = 0; i < viTri - 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[viTri - 1] = b;
        for (int j = viTri; j < newArr.length; j++) {
            newArr[j] = arr[j - 1];
        }
        for (int x = 0; x < newArr.length; x++) {
            System.out.println(newArr[x]);
        }
     }
}
