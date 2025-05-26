package com.google.android.gms.internal.measurement;

import java.security.AccessController;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class x7 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f31699a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f31700b;

    /* renamed from: c, reason: collision with root package name */
    public static final v7 f31701c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f31702d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f31703e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f31704f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f31705g;

    /* JADX WARN: Can't wrap try/catch for region: R(17:0|1|(14:(1:4)(1:(1:39))|5|(1:7)(1:37)|8|(1:10)(1:36)|11|12|13|(1:15)(4:25|26|27|(1:31))|(1:18)|19|(1:21)|22|23)|40|5|(0)(0)|8|(0)(0)|11|12|13|(0)(0)|(1:18)|19|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    static {
        /*
            sun.misc.Unsafe r0 = j()
            com.google.android.gms.internal.measurement.x7.f31699a = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.j5.f31479a
            com.google.android.gms.internal.measurement.x7.f31700b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = q(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = q(r2)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L2b
            if (r1 == 0) goto L23
            com.google.android.gms.internal.measurement.v7 r1 = new com.google.android.gms.internal.measurement.v7
            r1.<init>(r0, r5)
            goto L2c
        L23:
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.measurement.v7 r1 = new com.google.android.gms.internal.measurement.v7
            r1.<init>(r0, r4)
            goto L2c
        L2b:
            r1 = r3
        L2c:
            com.google.android.gms.internal.measurement.x7.f31701c = r1
            if (r1 != 0) goto L32
            r0 = r5
            goto L36
        L32:
            boolean r0 = r1.d()
        L36:
            com.google.android.gms.internal.measurement.x7.f31702d = r0
            if (r1 != 0) goto L3c
            r0 = r5
            goto L40
        L3c:
            boolean r0 = r1.c()
        L40:
            com.google.android.gms.internal.measurement.x7.f31703e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = i(r0)
            long r6 = (long) r0
            com.google.android.gms.internal.measurement.x7.f31704f = r6
            java.lang.Class<boolean[]> r0 = boolean[].class
            i(r0)
            l(r0)
            java.lang.Class<int[]> r0 = int[].class
            i(r0)
            l(r0)
            java.lang.Class<long[]> r0 = long[].class
            i(r0)
            l(r0)
            java.lang.Class<float[]> r0 = float[].class
            i(r0)
            l(r0)
            java.lang.Class<double[]> r0 = double[].class
            i(r0)
            l(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            i(r0)
            l(r0)
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r2 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L84
            goto L85
        L84:
            r2 = r3
        L85:
            if (r2 == 0) goto L89
            r3 = r2
            goto L9c
        L89:
            java.lang.String r2 = "address"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L90
            goto L91
        L90:
            r0 = r3
        L91:
            if (r0 == 0) goto L9c
            java.lang.Class r2 = r0.getType()
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r2 != r6) goto L9c
            r3 = r0
        L9c:
            if (r3 == 0) goto La6
            if (r1 != 0) goto La1
            goto La6
        La1:
            sun.misc.Unsafe r0 = r1.f31687a
            r0.objectFieldOffset(r3)
        La6:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Laf
            goto Lb0
        Laf:
            r4 = r5
        Lb0:
            com.google.android.gms.internal.measurement.x7.f31705g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x7.<clinit>():void");
    }

    public static double a(Object obj, long j13) {
        v7 v7Var = f31701c;
        switch (v7Var.f31674b) {
        }
        return Double.longBitsToDouble(v7Var.f(j13, obj));
    }

    public static Object b(Class cls) {
        try {
            return f31699a.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static void c(int i13, long j13, Object obj) {
        f31701c.a(i13, j13, obj);
    }

    public static void d(long j13, Object obj, Object obj2) {
        f31701c.f31687a.putObject(obj, j13, obj2);
    }

    public static void e(Object obj, long j13, double d2) {
        v7 v7Var = f31701c;
        switch (v7Var.f31674b) {
            case 0:
                v7Var.b(j13, obj, Double.doubleToLongBits(d2));
                break;
            default:
                v7Var.b(j13, obj, Double.doubleToLongBits(d2));
                break;
        }
    }

    public static void f(Object obj, long j13, float f13) {
        v7 v7Var = f31701c;
        switch (v7Var.f31674b) {
            case 0:
                v7Var.a(Float.floatToIntBits(f13), j13, obj);
                break;
            default:
                v7Var.a(Float.floatToIntBits(f13), j13, obj);
                break;
        }
    }

    public static void g(byte[] bArr, long j13, byte b13) {
        long j14 = f31704f + j13;
        int i13 = f31701c.f31674b;
        boolean z13 = f31705g;
        switch (i13) {
            case 0:
                if (!z13) {
                    p(bArr, j14, b13);
                    break;
                } else {
                    m(bArr, j14, b13);
                    break;
                }
            default:
                if (!z13) {
                    p(bArr, j14, b13);
                    break;
                } else {
                    m(bArr, j14, b13);
                    break;
                }
        }
    }

    public static float h(Object obj, long j13) {
        v7 v7Var = f31701c;
        switch (v7Var.f31674b) {
        }
        return Float.intBitsToFloat(v7Var.e(j13, obj));
    }

    public static int i(Class cls) {
        if (f31703e) {
            return f31701c.f31687a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new u7());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int k(Object obj, long j13) {
        return f31701c.e(j13, obj);
    }

    public static void l(Class cls) {
        if (f31703e) {
            f31701c.f31687a.arrayIndexScale(cls);
        }
    }

    public static void m(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int e13 = f31701c.e(j14, obj);
        int i13 = ((~((int) j13)) & 3) << 3;
        c(((255 & b13) << i13) | (e13 & (~(255 << i13))), j14, obj);
    }

    public static void n(Object obj, long j13, boolean z13) {
        int i13 = f31701c.f31674b;
        boolean z14 = f31705g;
        switch (i13) {
            case 0:
                if (!z14) {
                    p(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    m(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!z14) {
                    p(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    m(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    public static long o(Object obj, long j13) {
        return f31701c.f(j13, obj);
    }

    public static void p(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        c(((255 & b13) << i13) | (f31701c.e(j14, obj) & (~(255 << i13))), j14, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(Class cls) {
        try {
            Class cls2 = f31700b;
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

    public static Object r(long j13, Object obj) {
        return f31701c.f31687a.getObject(obj, j13);
    }

    public static boolean s(long j13, Object obj) {
        v7 v7Var = f31701c;
        int i13 = v7Var.f31674b;
        boolean z13 = f31705g;
        switch (i13) {
            case 0:
                if (z13) {
                    if (((byte) (v7Var.e((-4) & j13, obj) >>> ((int) (((~j13) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else if (((byte) (v7Var.e((-4) & j13, obj) >>> ((int) ((j13 & 3) << 3)))) == 0) {
                    return false;
                }
                break;
            default:
                if (z13) {
                    if (((byte) (v7Var.e((-4) & j13, obj) >>> ((int) (((~j13) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else if (((byte) (v7Var.e((-4) & j13, obj) >>> ((int) ((j13 & 3) << 3)))) == 0) {
                    return false;
                }
                break;
        }
        return true;
    }
}
