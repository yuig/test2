package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f33960a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f33961b;

    /* renamed from: c, reason: collision with root package name */
    public static final p2 f33962c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f33963d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f33964e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f33965f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f33966g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f33967h;

    static {
        Unsafe m13 = m();
        f33960a = m13;
        f33961b = d.f33867a;
        boolean g13 = g(Long.TYPE);
        boolean g14 = g(Integer.TYPE);
        p2 p2Var = null;
        if (m13 != null) {
            if (g13) {
                p2Var = new o2(m13);
            } else if (g14) {
                p2Var = new n2(m13);
            }
        }
        f33962c = p2Var;
        f33963d = p2Var == null ? false : p2Var.t();
        f33964e = p2Var == null ? false : p2Var.s();
        f33965f = d(byte[].class);
        d(boolean[].class);
        e(boolean[].class);
        d(int[].class);
        e(int[].class);
        d(long[].class);
        e(long[].class);
        d(float[].class);
        e(float[].class);
        d(double[].class);
        e(double[].class);
        d(Object[].class);
        e(Object[].class);
        Field f13 = f();
        f33966g = (f13 == null || p2Var == null) ? -1L : p2Var.k(f13);
        f33967h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th3) {
        Logger.getLogger(q2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
    }

    public static Object c(Class cls) {
        try {
            return f33960a.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static int d(Class cls) {
        if (f33964e) {
            return f33962c.a(cls);
        }
        return -1;
    }

    public static void e(Class cls) {
        if (f33964e) {
            f33962c.b(cls);
        }
    }

    public static Field f() {
        Field field;
        Field field2;
        Class cls = d.f33867a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field != null) {
            return field;
        }
        try {
            field2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field2 = null;
        }
        if (field2 == null || field2.getType() != Long.TYPE) {
            return null;
        }
        return field2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean g(Class cls) {
        Class cls2 = d.f33867a;
        try {
            Class cls3 = f33961b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", cls, cls4);
            cls3.getMethod("pokeLong", cls, Long.TYPE, cls4);
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", cls, cls5, cls4);
            cls3.getMethod("peekInt", cls, cls4);
            cls3.getMethod("pokeByte", cls, Byte.TYPE);
            cls3.getMethod("peekByte", cls);
            cls3.getMethod("pokeByteArray", cls, byte[].class, cls5, cls5);
            cls3.getMethod("peekByteArray", cls, byte[].class, cls5, cls5);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte h(long j13, Object obj) {
        return (byte) ((f33962c.h((-4) & j13, obj) >>> ((int) (((~j13) & 3) << 3))) & 255);
    }

    public static byte i(long j13, Object obj) {
        return (byte) ((f33962c.h((-4) & j13, obj) >>> ((int) ((j13 & 3) << 3))) & 255);
    }

    public static int j(long j13, Object obj) {
        return f33962c.h(j13, obj);
    }

    public static long k(long j13, Object obj) {
        return f33962c.i(j13, obj);
    }

    public static Object l(long j13, Object obj) {
        return f33962c.j(j13, obj);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new m2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(long j13, Object obj, boolean z13) {
        f33962c.l(j13, obj, z13);
    }

    public static void o(byte[] bArr, long j13, byte b13) {
        f33962c.m(bArr, f33965f + j13, b13);
    }

    public static void p(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int h10 = f33962c.h(j14, obj);
        int i13 = ((~((int) j13)) & 3) << 3;
        t(((255 & b13) << i13) | (h10 & (~(255 << i13))), j14, obj);
    }

    public static void q(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        t(((255 & b13) << i13) | (f33962c.h(j14, obj) & (~(255 << i13))), j14, obj);
    }

    public static void r(Object obj, long j13, double d2) {
        f33962c.n(obj, j13, d2);
    }

    public static void s(Object obj, long j13, float f13) {
        f33962c.o(obj, j13, f13);
    }

    public static void t(int i13, long j13, Object obj) {
        f33962c.p(i13, j13, obj);
    }

    public static void u(long j13, Object obj, long j14) {
        f33962c.q(j13, obj, j14);
    }

    public static void v(long j13, Object obj, Object obj2) {
        f33962c.r(j13, obj, obj2);
    }
}
