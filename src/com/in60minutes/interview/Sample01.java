package com.in60minutes.interview;

public class Sample01 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for (int i = n; i >=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for (int i =1; i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for (int i = n; i >= 1; i--) {
            for (int j= i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for (int i =1;i<=n;i++){
            for (int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i= n-1;i>=1;i--){
            for (int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1;i>=1;i--){
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        for (int i = 1; i<=n; i++){
            for (int j = i; j<n; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++){
                if (j == 1 || j== (2 * i - 1) || i == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
        }

        System.out.println("-----------------------------------------");


        for (int i = 1; i <=n; i++){
            for (int j = 1; j<=n; j++){
                if (j == i || j == n - i + 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}