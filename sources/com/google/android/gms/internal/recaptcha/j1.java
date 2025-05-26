package com.google.android.gms.internal.recaptcha;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f31757a = Logger.getLogger(j1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f31758b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f31759c;

    /* renamed from: d, reason: collision with root package name */
    public static final h1 f31760d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f31761e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f31762f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f31763g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f31764h;

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.j1.<clinit>():void");
    }

    public static byte a(long j13, byte[] bArr) {
        return f31760d.a(f31763g + j13, bArr);
    }

    public static Object b(Class cls) {
        try {
            return f31758b.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static void c(int i13, long j13, Object obj) {
        f31760d.b(i13, j13, obj);
    }

    public static void d(long j13, Object obj, Object obj2) {
        f31760d.f31755a.putObject(obj, j13, obj2);
    }

    public static int e(Class cls) {
        if (f31762f) {
            return f31760d.f31755a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void f(long j13, Object obj, boolean z13) {
        byte b13 = z13 ? (byte) 1 : (byte) 0;
        long j14 = (-4) & j13;
        int j15 = f31760d.j(j14, obj);
        int i13 = ((~((int) j13)) & 3) << 3;
        c(((255 & b13) << i13) | (j15 & (~(255 << i13))), j14, obj);
    }

    public static Unsafe g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new f1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void h(Class cls) {
        if (f31762f) {
            f31760d.f31755a.arrayIndexScale(cls);
        }
    }

    public static void i(Object obj, long j13, boolean z13) {
        byte b13 = z13 ? (byte) 1 : (byte) 0;
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        c(((255 & b13) << i13) | (f31760d.j(j14, obj) & (~(255 << i13))), j14, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean j(Class cls) {
        if (!o.a()) {
            return false;
        }
        try {
            Class cls2 = f31759c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object k(Object obj, long j13) {
        return f31760d.f31755a.getObject(obj, j13);
    }

    public static Field l() {
        Field field;
        Field field2;
        if (o.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static byte m(long j13, Object obj) {
        return (byte) (f31760d.j((-4) & j13, obj) >>> ((int) (((~j13) & 3) << 3)));
    }

    public static byte n(long j13, Object obj) {
        return (byte) (f31760d.j((-4) & j13, obj) >>> ((int) ((j13 & 3) << 3)));
    }
}
