package com.amazonaws.logging;

import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class LogFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f28627a = new HashMap();

    public enum Level {
        ALL(Integer.MIN_VALUE),
        TRACE(0),
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        OFF(Integer.MAX_VALUE);

        private final int value;

        Level(int i13) {
            this.value = i13;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static synchronized Log a(Class cls) {
        Log b13;
        synchronized (LogFactory.class) {
            String simpleName = cls.getSimpleName();
            if (simpleName.length() > 23) {
                b("LogFactory").h("Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
                simpleName = simpleName.substring(0, 23);
            }
            b13 = b(simpleName);
        }
        return b13;
    }

    public static synchronized Log b(String str) {
        Log androidLog;
        synchronized (LogFactory.class) {
            try {
                int i13 = 0;
                if (str.length() > 23) {
                    b("LogFactory").h("Truncating log tag length as it exceed 23, the limit imposed by Android on certain API Levels");
                    str = str.substring(0, 23);
                }
                Log log = (Log) f28627a.get(str);
                if (log != null) {
                    return log;
                }
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i13 >= length) {
                        androidLog = new AndroidLog(str);
                        break;
                    }
                    if (stackTrace[i13].getClassName().startsWith("org.junit.")) {
                        androidLog = new ConsoleLog(str);
                        break;
                    }
                    i13++;
                }
                f28627a.put(str, androidLog);
                return androidLog;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
