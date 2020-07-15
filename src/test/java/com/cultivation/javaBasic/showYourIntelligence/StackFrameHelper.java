package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        StackTraceElement frame = ste[2];
        return frame.getClassName() + "." + frame.getMethodName();
    }
}
