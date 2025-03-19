package com.smu.mscda;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {
    public static String capitalizeString(String input) {
        return StringUtils.capitalize(input);
    }
    public static String generateMD5(String input) {
        return DigestUtils.md5Hex(input);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in lowercase:");
        String userInput = scanner.nextLine();
        scanner.close();

        String capitalized = capitalizeString(userInput);
        String md5Hash = generateMD5(capitalized);
        System.out.println("Capitalized string: " + capitalized);
        System.out.println("MD5 Hash: " + md5Hash);
    }
}