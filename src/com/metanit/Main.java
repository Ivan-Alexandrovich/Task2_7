package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insert array size:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Insert array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Insert shift:");
        int n = input.nextInt();
        shiftOfNumbers(arr, n);
    }

    private static void shiftOfNumbers(int[] arr, int n) {
        //посмотрим матрицу до сдвига
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\r\n");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int buf = arr[arr.length - 1];
                System.arraycopy(arr, 0, arr, 1, arr.length - 1);
                arr[0] = buf;
                //смотрим матрицу после каждого сдвига
                for (int j : arr) System.out.print(j + " ");
                System.out.println();
            }
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arr[0];
                System.arraycopy(arr, 1, arr, 0, arr.length - 1);
                arr[arr.length - 1] = buf;
                //смотрим матрицу после каждого сдвига
                for (int i : arr) System.out.print(i + " ");
                System.out.print("\r\n");
            }
        }
    }
}