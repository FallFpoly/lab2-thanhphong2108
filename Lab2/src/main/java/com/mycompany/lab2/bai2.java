/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- BÀI 2: Giải PT bậc hai ax^2 + bx + c = 0 ---");
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            // quay về bậc nhất
            System.out.println("a = 0 => Phương trình trở thành bậc nhất bx + c = 0");
            if (b == 0) {
                if (c == 0) System.out.println("=> Vô số nghiệm");
                else System.out.println("=> Vô nghiệm");
            } else {
                double x = -c / b;
                System.out.printf("=> Nghiệm x = %.4f%n", x);
            }
            return;
        }

        double delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("=> Vô nghiệm");
        } else if (delta == 0) {
            double x = -b / (2*a);
            System.out.printf("=> Nghiệm kép x1 = x2 = %.4f%n", x);
        } else {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2*a);
            double x2 = (-b - sqrtDelta) / (2*a);
            System.out.printf("=> Hai nghiệm phân biệt:%n   x1 = %.4f%n   x2 = %.4f%n", x1, x2);
        }
    }
}


