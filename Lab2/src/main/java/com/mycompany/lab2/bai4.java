/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            menu();
            System.out.print("Chọn chức năng: ");
            while (!sc.hasNextInt()) {
                System.out.print("Vui lòng nhập số 1-4: ");
                sc.next();
            }
            chon = sc.nextInt();

            switch (chon) {
                case 1 -> bai1.main(null);
                case 2 -> bai2.main(null);
                case 3 -> aib3.main(null);
                case 4 -> System.out.println("Thoát ứng dụng. Tạm biệt!");
                default -> System.out.println("Lựa chọn không hợp lệ! (1-4)");
            }

            if (chon != 4) {
                System.out.println();
                System.out.print("Nhấn Enter để quay lại menu...");
                sc.nextLine(); // clear
                sc.nextLine(); // wait
            }
        } while (chon != 4);
    }

    private static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }
}


