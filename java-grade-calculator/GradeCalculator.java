package com.example.gradecalculator;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ป้อนชื่อนักศึกษา: ");
        String studentName = scanner.nextLine();

        System.out.print("ป้อนคะแนนของนักศึกษา: ");
        double score = scanner.nextDouble();

        char grade = calculateGrade(score);

        System.out.println("\n--- ผลลัพธ์ ---");
        System.out.println("ชื่อนักศึกษา: " + studentName);
        System.out.println("คะแนน: " + score);
        System.out.println("เกรด: " + grade);

        scanner.close();
    }

    public static char calculateGrade(double score) {
        if (score >= 80) {
            return 'A';
        } else if (score >= 70) {
            return 'B';
        } else if (score >= 60) {
            return 'C';
        } else if (score >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
