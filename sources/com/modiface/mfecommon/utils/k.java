package com.modiface.mfecommon.utils;

import android.util.Log;

/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34331a = "MFEJNIUtil";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f34332b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f34333c;

    public static void a(String str) {
        b();
        b(str);
    }

    private static boolean b() {
        if (f34332b) {
            return true;
        }
        boolean c13 = c("gnustl_shared");
        if (!c13) {
            c13 = c("c++_shared");
        }
        f34332b = c13;
        if (!c13) {
            Log.e(f34331a, "could not load any default c++ libraries");
        }
        return c13;
    }

    private static boolean c(String str) {
        try {
            b(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.modiface.mfecommon.utils.k.a():java.lang.String");
    }

    private static void b(String str) {
        try {
            System.loadLibrary(str + "-" + a());
        } catch (UnsatisfiedLinkError unused) {
            System.loadLibrary(str);
        }
    }
}
