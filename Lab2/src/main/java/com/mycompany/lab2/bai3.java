/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- BÀI 3: Tính tiền điện ---");
        System.out.print("Nhập số điện sử dụng trong tháng (kWh): ");
        int soDien = sc.nextInt();

        if (soDien < 0) {
            System.out.println("Số điện không hợp lệ!");
            return;
        }

        long tien;
        if (soDien <= 50) {
            tien = soDien * 1000L;
        } else {
            tien = 50 * 1000L + (long)(soDien - 50) * 1200L;
        }

        System.out.printf("=> Tiền điện phải trả: %,d VND%n", tien);
    }
}


