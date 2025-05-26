package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f31774a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f31775b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f31774a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f31775b = cls2 != null;
    }

    public static boolean a() {
        return (f31774a == null || f31775b) ? false : true;
    }

    public static Class b() {
        return f31774a;
    }
}
