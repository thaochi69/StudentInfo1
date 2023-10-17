/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author Thao Chi
 */
public class Validation {
     private static final Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine();
            if (result.length() == 0) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = in.nextLine();
            if (result.length() == 1 && result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.length() == 1 && result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Re-input.");
        }
    }

    public static float checkInputFloat() {
        while (true) {
            try {
                float result = Float.parseFloat(in.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }
}
