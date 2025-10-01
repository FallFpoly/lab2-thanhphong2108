/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author I
 */

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Giải phương trình bậc hai ax^2 + bx + c = 0 ===");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println(c == 0 ? "Vô số nghiệm" : "Vô nghiệm");
            } else {
                System.out.println("Nghiệm x = " + (-c / b));
            }
        } else {
            double delta = b*b - 4*a*c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Nghiệm kép x = " + (-b / (2*a)));
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
