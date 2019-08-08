package com.lichunorz.netty.starter.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

public class N {
    private static ThreadLocal<DateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    public static void log(String msg) {
        System.out.printf("\033[31m%s\033[0m:  %s\n",
                formatter.get().format(new Date()),
                msg);
    }

    public static void log() {
        final StackTraceElement caller = new Throwable().getStackTrace()[1];
//        final String[] clazz = caller.getClassName().split("[.]");
//        final String className = clazz[clazz.length - 1];
        System.out.printf("\033[31m%s\033[0m:  [%d]%-20s\n",
                formatter.get().format(new Date()),
                caller.getLineNumber(),
                caller.getMethodName());
    }

    public static void Create(WithNIOGroup withNIOGroup) {
        try {
            withNIOGroup.work();
        }finally {

        }
    }

    @FunctionalInterface
    private interface WithNIOGroup {
        void work();
    }
}
