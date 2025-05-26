package com.google.android.gms.internal.recaptcha;

import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f31735a;

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f31736b;

    /* renamed from: c, reason: collision with root package name */
    public static final e1 f31737c;

    /* renamed from: d, reason: collision with root package name */
    public static final e1 f31738d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f31735a = cls;
        f31736b = a(false);
        f31737c = a(true);
        f31738d = new e1();
    }

    public static e1 a(boolean z13) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (e1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z13));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void b(e1 e1Var, Object obj, Object obj2) {
        e1Var.getClass();
        b0 b0Var = (b0) obj;
        c1 c1Var = b0Var.zzb;
        c1 c1Var2 = ((b0) obj2).zzb;
        if (!c1Var2.equals(c1.f31741d)) {
            int i13 = c1Var.f31742a;
            int i14 = c1Var2.f31742a;
            int i15 = i13 + i14;
            int[] copyOf = Arrays.copyOf(c1Var.f31743b, i15);
            int[] iArr = c1Var2.f31743b;
            int i16 = c1Var.f31742a;
            System.arraycopy(iArr, 0, copyOf, i16, i14);
            Object[] copyOf2 = Arrays.copyOf(c1Var.f31744c, i15);
            System.arraycopy(c1Var2.f31744c, 0, copyOf2, i16, i14);
            c1Var = new c1(i15, copyOf, copyOf2);
        }
        b0Var.zzb = c1Var;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
