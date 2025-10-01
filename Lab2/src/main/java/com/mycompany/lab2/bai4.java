/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author ICT
 */
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("==== MENU ====");
            System.out.println("1. Giải PT bậc nhất");
            System.out.println("2. Giải PT bậc hai");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1: bai1.main(null); break;
                case 2: bai2.main(null); break;
                case 3: bai3.main(null); break;
                case 4: System.out.println("Thoát chương trình."); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.println();
        } while (chon != 4);
    }
}

