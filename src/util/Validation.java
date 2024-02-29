package util;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static double getDouble(String inputMsg) {
        Scanner sc = new Scanner(System.in);
        double result;
        do {
            try {
                System.out.print(inputMsg);
                result = Double.parseDouble(sc.nextLine());

                if (result >= 0) {
                    return result;
                } else {
                    System.err.println("Value must be >= 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter a positive double! Try again!");
            }
        } while (true);
    }
    
    public static int getInt(String msg, int min, int max) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            try {
                int n = Integer.parseInt(s);
                // if n not in range min max, re-input n
                if (n < min || n > max) {
                    System.err.println("n must be in range " + min + " -> " + max);
                    continue;
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Must be a number! Enter again please.");
            }
        }
    }
    
    public static String getString(String inputMsg) {
        Scanner sc = new Scanner(System.in);
        String result;
        do{
            try {
                System.out.print(inputMsg);
                result = sc.nextLine().trim();
                if(result.isEmpty() == true) {
                    System.out.println(">>You input nothing?");
                } else { return result; }
            } catch (Exception e) {
                System.err.println("Pls enter again!");
            }
        } while (true);
    }

    public static String getString(String msg, String pattern) {
        while (true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            // if user input character without pattern then Re-input
            if (!s.matches(pattern)) {
                System.err.println("Invalid input! Please between 1(code) 0(remain) to 50 characters( letters, numbers, and/or spaces)");
                continue;
            }
            return s;
        }
    }
    
    public static LocalDate getDate(String msg) {
        Scanner sc = new Scanner(System.in);
        String result;
        do {            
            try {
                String dateStr = getString(msg);
                // Định dạng cho chuỗi ngày tháng
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                // Parse chuỗi thành đối tượng LocalDate
                LocalDate date = LocalDate.parse(dateStr, formatter);
                return date;
            } catch (DateTimeParseException e) {
                // Xử lý nếu chuỗi không hợp lệ
                System.out.println("Date not valid!");
                e.printStackTrace();
            }
        } while (true);
        
    }
    
    public static String getYN(String msg){
        while (true) {            
            System.out.print(msg);
            String s=sc.nextLine();
            // return y or n ( yes or no )
            if(s.equalsIgnoreCase("Y")||s.equalsIgnoreCase("N")){
                return s;
            }
            else{
                System.err.println("Input Y or N please!");
            }
        }
    }

}