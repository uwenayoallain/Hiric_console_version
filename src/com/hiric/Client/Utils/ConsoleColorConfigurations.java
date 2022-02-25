package com.hiric.Client.Utils;

/**
 * @author : Abijuru Seth
 * This file contains all console color configurations;
 */

public class ConsoleColorConfigurations {
    private static String RED = "\u001B[31m";
    private static String GREEN = "\u001B[32m";
    private static String YELLOW = "\u001B[33m";
    private static String BLUE = "\u001B[34m";
    private static String RESET = "\u001B[0m";

    public static String getRED() {
        return RED;
    }

    public static String getGREEN() {
        return GREEN;
    }

    public static String getYELLOW() {
        return YELLOW;
    }

    public static String getBLUE() {
        return BLUE;
    }

    public static String getRESET() {
        return RESET;
    }
}
