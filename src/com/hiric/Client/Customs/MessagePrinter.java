package com.hiric.Client.Customs;

import com.hiric.Client.EnvironmentVariables.MessageTypes;
import com.hiric.Client.Utils.ConsoleColorConfigurations;

/**
 * @author : Abijuru Seth
 * This file contains all console color configurations;
 */

public class MessagePrinter {
    public static void printConsoleMessage(MessageTypes msgType, String msg) {
        if (msgType == MessageTypes.ERROR) {
            System.out.println(ConsoleColorConfigurations.getRED()+msg+ConsoleColorConfigurations.getRESET());
        } else if (msgType == MessageTypes.SUCCESS) {
            System.out.println(ConsoleColorConfigurations.getGREEN()+msg+ConsoleColorConfigurations.getRESET());
        } else if (msgType == MessageTypes.WARNING) {
            System.out.println(ConsoleColorConfigurations.getYELLOW()+msg+ConsoleColorConfigurations.getRESET());
        } else if (msgType == MessageTypes.ACTION) {
            System.out.println(ConsoleColorConfigurations.getBLUE()+msg+ConsoleColorConfigurations.getRESET());
        } else {
            System.out.println("Something went wrong getting console colors!");
        }
    }
}
