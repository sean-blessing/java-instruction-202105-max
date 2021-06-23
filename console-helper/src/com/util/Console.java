package com.util;
import java.util.Scanner;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);

    /**
     * 
     * @param prompt Prompt the user for input 
     * @return the next line from user input
     */
    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    /**
     * 
     * @param prompt Prompt the user for input
     * @return The next line of input from the user
     */
    public static String getLine(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();  // read user entry
        //sc.nextLine();  // discard any other data entered on the line
        return s;
    }
    
    /**
     * 
     * @param prompt Prompt the user for input
     * @param isRequired boolean determining if this input is required
     * @return The next line of input from the user
     */
    public static String getString(String prompt, boolean isRequired) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (isRequired && s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }

    /**
     * 
     * @param prompt Prompt the user for input
     * @param s1 The first acceptable string
     * @param s2 The second acceptable string
     * @return The value entered by the user
     */
    public static String getString(String prompt, String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getString(prompt, true);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" +
                        s2 + "'. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }

    /**
     * 
     * @param prompt Prompt the user for input
     * @return The integer entered by the user
     */
    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    /**
     * This method will return a valid integer within the 
     * min max range (inclusive).
     * @param prompt Prompt the user for input
     * @param min The minimum acceptable value
     * @param max The maximum acceptable value
     * @return The integer entered by the user
     */
    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i < min) {
                System.out.println(
                        "Error! Number must be greater than or equal to " + min + ".");
            } else if (i > max) {
                System.out.println(
                        "Error! Number must be less than or equal to " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    /**
     * 
     * @param prompt Prompt the user for input
     * @return The valid double entered by the user
     */
    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    /**
     * 
     * @param prompt Prompt the user for input
     * @param min The minimum acceptable value
     * @param max The minimum acceptable value
     * @return The valid double entered by the user
     */
    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
    /**
     * Prompt the user for a y/n response and convert to a boolean
     * @param prompt Yes or no reponse
     * @return boolean
     */
    public static boolean getBoolean(String prompt) {
    	String resp = getString(prompt, "y", "n");
    	return resp.equalsIgnoreCase("y") ? true : false;
    	
    }
}