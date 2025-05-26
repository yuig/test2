package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class d2 {

    /* renamed from: a */
    public static final Unsafe f33600a;

    /* renamed from: b */
    public static final Class f33601b;

    /* renamed from: c */
    public static final c2 f33602c;

    /* renamed from: d */
    public static final boolean f33603d;

    /* renamed from: e */
    public static final boolean f33604e;

    /* renamed from: f */
    public static final long f33605f;

    /* renamed from: g */
    public static final boolean f33606g;

    static {
        Unsafe j13 = j();
        f33600a = j13;
        f33601b = d.f33598a;
        boolean f13 = f(Long.TYPE);
        boolean f14 = f(Integer.TYPE);
        c2 c2Var = null;
        if (j13 != null) {
            if (!d.a()) {
                c2Var = new b2(j13);
            } else if (f13) {
                c2Var = new a2(j13, 1);
            } else if (f14) {
                c2Var = new a2(j13, 0);
            }
        }
        f33602c = c2Var;
        f33603d = c2Var == null ? false : c2Var.s();
        f33604e = c2Var == null ? false : c2Var.r();
        f33605f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field e13 = e();
        if (e13 != null && c2Var != null) {
            c2Var.j(e13);
        }
        f33606g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th3) {
        Logger.getLogger(d2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
    }

    public static Object b(Class cls) {
        try {
            return f33600a.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static int c(Class cls) {
        if (f33604e) {
            return f33602c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f33604e) {
            f33602c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (d.a()) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = f33601b;
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

    public static byte g(long j13, byte[] bArr) {
        return f33602c.d(f33605f + j13, bArr);
    }

    public static byte h(long j13, Object obj) {
        return (byte) ((f33602c.g((-4) & j13, obj) >>> ((int) (((~j13) & 3) << 3))) & 255);
    }

    public static byte i(long j13, Object obj) {
        return (byte) ((f33602c.g((-4) & j13, obj) >>> ((int) ((j13 & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new z1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(long j13, Object obj, boolean z13) {
        f33602c.k(j13, obj, z13);
    }

    public static void l(byte[] bArr, long j13, byte b13) {
        f33602c.l(bArr, f33605f + j13, b13);
    }

    public static void m(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int g13 = f33602c.g(j14, obj);
        int i13 = ((~((int) j13)) & 3) << 3;
        q(((255 & b13) << i13) | (g13 & (~(255 << i13))), j14, obj);
    }

    public static void n(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        q(((255 & b13) << i13) | (f33602c.g(j14, obj) & (~(255 << i13))), j14, obj);
    }

    public static void o(Object obj, long j13, double d2) {
        f33602c.m(obj, j13, d2);
    }

    public static void p(Object obj, long j13, float f13) {
        f33602c.n(obj, j13, f13);
    }

    public static void q(int i13, long j13, Object obj) {
        f33602c.o(i13, j13, obj);
    }

    public static void r(long j13, Object obj, long j14) {
        f33602c.p(j13, obj, j14);
    }

    public static void s(long j13, Object obj, Object obj2) {
        f33602c.q(j13, obj, obj2);
    }
}
