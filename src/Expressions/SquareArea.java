package Expressions;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        int area = a * a;

        System.out.printf("%d", area);
    }
}
