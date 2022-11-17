package AdvancedConditions.NestedLoops.Homework;

import java.util.Scanner;

public class HappyNumbers {
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                for (int k = 1; k <= 9; k++){
                    for (int l = 1; l <= 9; l++){
                        if ((i + j) == (k + l)) {
                            if (n % (i + j) == 0){
                                System.out.print("" + i + j + k + l + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
