package com.modiface.mfecommon.utils;

/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f34298a;

    public static synchronized int a() {
        int i13;
        synchronized (f.class) {
            try {
                if (f34298a >= 2147483646) {
                    f34298a = 0;
                }
                f34298a++;
                i13 = f34298a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return i13;
    }
}
