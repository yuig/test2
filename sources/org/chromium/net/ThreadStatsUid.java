package org.chromium.net;

import android.net.TrafficStats;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class ThreadStatsUid {
    private static final Method sClearThreadStatsUid;
    private static final Method sSetThreadStatsUid;

    static {
        try {
            sSetThreadStatsUid = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            sClearThreadStatsUid = TrafficStats.class.getMethod("clearThreadStatsUid", new Class[0]);
        } catch (NoSuchMethodException | SecurityException e13) {
            throw new RuntimeException("Unable to get TrafficStats methods", e13);
        }
    }

    public static void clear() {
        try {
            sClearThreadStatsUid.invoke(null, new Object[0]);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e14);
        }
    }

    public static void set(int i13) {
        try {
            sSetThreadStatsUid.invoke(null, Integer.valueOf(i13));
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e14);
        }
    }
}
