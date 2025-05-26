package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f18067a = Logger.getLogger(h2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f18068b;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f18069c;

    /* renamed from: d, reason: collision with root package name */
    public static final g2 f18070d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f18071e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f18072f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f18073g;

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f18074h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h2.<clinit>():void");
    }

    public static Object b(Class cls) {
        try {
            return f18068b.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static int c(Class cls) {
        if (f18072f) {
            return f18070d.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f18072f) {
            f18070d.b(cls);
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
            Class cls2 = f18069c;
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
        return f18070d.d(f18073g + j13, bArr);
    }

    public static byte h(long j13, Object obj) {
        return (byte) ((f18070d.g((-4) & j13, obj) >>> ((int) (((~j13) & 3) << 3))) & 255);
    }

    public static byte i(long j13, Object obj) {
        return (byte) ((f18070d.g((-4) & j13, obj) >>> ((int) ((j13 & 3) << 3))) & 255);
    }

    public static int j(long j13, Object obj) {
        return f18070d.g(j13, obj);
    }

    public static long k(long j13, Object obj) {
        return f18070d.h(j13, obj);
    }

    public static Object l(long j13, Object obj) {
        return f18070d.i(j13, obj);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new c2());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(byte[] bArr, long j13, byte b13) {
        f18070d.l(bArr, f18073g + j13, b13);
    }

    public static void o(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int g13 = f18070d.g(j14, obj);
        int i13 = ((~((int) j13)) & 3) << 3;
        q(((255 & b13) << i13) | (g13 & (~(255 << i13))), j14, obj);
    }

    public static void p(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        int i13 = (((int) j13) & 3) << 3;
        q(((255 & b13) << i13) | (f18070d.g(j14, obj) & (~(255 << i13))), j14, obj);
    }

    public static void q(int i13, long j13, Object obj) {
        f18070d.o(i13, j13, obj);
    }

    public static void r(long j13, Object obj, long j14) {
        f18070d.p(j13, obj, j14);
    }

    public static void s(long j13, Object obj, Object obj2) {
        f18070d.q(j13, obj, obj2);
    }
}
