/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author ICT
 */

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Tính tiền điện ===");
        System.out.print("Nhập số điện đã dùng: ");
        int soDien = sc.nextInt();
        int tien;
        
        if (soDien <= 50) {
            tien = soDien * 1000;
        } else {
            tien = 50*1000 + (soDien - 50)*1200;
        }

        System.out.println("Tiền điện phải trả: " + tien + " đồng");
    }
}
