package ru.mirea.prak5.ex6;

import java.io.Serializable;
import java.util.Scanner;

public class Prosto {
    public  static Serializable recursion(int n, int i) {
        if (n < 2) {
            return "NO";
        }
        else if (n == 2) {
            return "YES";
        }
        else if (n % i == 0) {
            return "NO";
        }
        else if (i < n / 2) {
            return recursion(n, i + 1);
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(recursion(n, 2));
    }
}
