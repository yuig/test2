package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f33598a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f33599b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f33598a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f33599b = cls2 != null;
    }

    public static boolean a() {
        return (f33598a == null || f33599b) ? false : true;
    }
}
