package com.company.exceptionTree;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Tree {
    private final static String PASSWORD = "password";
    private final static String USER_NAME = "userName";

    static void checkValidSignInDetails(String userName, String password) {
        Map<String, String> db = new HashMap<>();
        db.put(USER_NAME, "furkan");
        db.put(PASSWORD, "folksdev");

        if (!db.containsValue(userName) || !db.containsValue(password)) {
            throw new UserNameNotFoundException("Geçersiz Bİlgiler", userName);
        }
        System.out.println("oturum açıldı : " + db.get(PASSWORD) + StringUtils.SPACE + db.get(USER_NAME));
        System.out.printf("oturum açıldı : %s %n", db);
    }

    static void readFile() {
        File file = new File("folksdev.txt");

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            System.out.println(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("OK");
        }
        System.out.println("DOSYA OKUNAMADI AMA İŞLEM DEVAM ETTİ");

    }

    public static void main(String[] args) {
        int a = 2;

        if (a == 2) {
            throw new RuntimeException("SDJFBDS");
        }
        System.out.println("OK");
        if (true) {
            System.out.println("OK");
        }

}
}
