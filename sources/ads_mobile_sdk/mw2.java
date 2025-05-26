package ads_mobile_sdk;

import java.io.Serializable;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class mw2 {

    /* renamed from: a */
    public static final Unsafe f8406a;

    /* renamed from: b */
    public static final Class f8407b;

    /* renamed from: c */
    public static final lw2 f8408c;

    /* renamed from: d */
    public static final boolean f8409d;

    /* renamed from: e */
    public static final boolean f8410e;

    /* renamed from: f */
    public static final long f8411f;

    /* renamed from: g */
    public static final long f8412g;

    /* renamed from: h */
    public static final boolean f8413h;

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(17:3|(1:(1:6)(1:(1:43)))(1:44)|7|(1:9)(1:41)|10|(1:12)(1:40)|13|(3:15|16|17)|32|33|34|(1:36)|(1:29)(1:22)|23|(1:25)|26|27)|45|7|(0)(0)|10|(0)(0)|13|(0)|32|33|34|(0)|(0)|29|23|(0)|26|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009a, code lost:
    
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        if (r0.getType() == java.lang.Long.TYPE) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    static {
        /*
            sun.misc.Unsafe r0 = a()
            ads_mobile_sdk.mw2.f8406a = r0
            java.lang.Class r1 = ads_mobile_sdk.vc.a()
            ads_mobile_sdk.mw2.f8407b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = d(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = d(r2)
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 != 0) goto L1e
            goto L34
        L1e:
            boolean r6 = ads_mobile_sdk.vc.b()
            if (r6 == 0) goto L36
            if (r1 == 0) goto L2c
            a.y5 r1 = new a.y5
            r1.<init>(r0, r3)
            goto L3b
        L2c:
            if (r2 == 0) goto L34
            a.y5 r1 = new a.y5
            r1.<init>(r0, r4)
            goto L3b
        L34:
            r1 = r5
            goto L3b
        L36:
            a.f7 r1 = new a.f7
            r1.<init>(r0)
        L3b:
            ads_mobile_sdk.mw2.f8408c = r1
            if (r1 != 0) goto L41
            r0 = r4
            goto L45
        L41:
            boolean r0 = r1.b()
        L45:
            ads_mobile_sdk.mw2.f8409d = r0
            if (r1 != 0) goto L4b
            r0 = r4
            goto L4f
        L4b:
            boolean r0 = r1.a()
        L4f:
            ads_mobile_sdk.mw2.f8410e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = b(r0)
            long r6 = (long) r0
            ads_mobile_sdk.mw2.f8411f = r6
            java.lang.Class<boolean[]> r0 = boolean[].class
            b(r0)
            c(r0)
            java.lang.Class<int[]> r0 = int[].class
            b(r0)
            c(r0)
            java.lang.Class<long[]> r0 = long[].class
            b(r0)
            c(r0)
            java.lang.Class<float[]> r0 = float[].class
            b(r0)
            c(r0)
            java.lang.Class<double[]> r0 = double[].class
            b(r0)
            c(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            b(r0)
            c(r0)
            boolean r0 = ads_mobile_sdk.vc.b()
            java.lang.Class<java.nio.Buffer> r2 = java.nio.Buffer.class
            if (r0 == 0) goto L9e
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L99
            goto L9a
        L99:
            r0 = r5
        L9a:
            if (r0 == 0) goto L9e
        L9c:
            r5 = r0
            goto Lb1
        L9e:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.Throwable -> La5
            goto La6
        La5:
            r0 = r5
        La6:
            if (r0 == 0) goto Lb1
            java.lang.Class r2 = r0.getType()
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r2 != r6) goto Lb1
            goto L9c
        Lb1:
            if (r5 == 0) goto Lbb
            if (r1 != 0) goto Lb6
            goto Lbb
        Lb6:
            long r0 = r1.a(r5)
            goto Lbd
        Lbb:
            r0 = -1
        Lbd:
            ads_mobile_sdk.mw2.f8412g = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Lc8
            goto Lc9
        Lc8:
            r3 = r4
        Lc9:
            ads_mobile_sdk.mw2.f8413h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mw2.<clinit>():void");
    }

    public static byte a(Object obj, long j13) {
        return (byte) ((f8408c.e(obj, (-4) & j13) >>> ((int) (((~j13) & 3) << 3))) & 255);
    }

    public static void b(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        lw2 lw2Var = f8408c;
        int i13 = (((int) j13) & 3) << 3;
        lw2Var.a(((255 & b13) << i13) | (lw2Var.e(obj, j14) & (~(255 << i13))), j14, obj);
    }

    public static void c(Class cls) {
        if (f8410e) {
            f8408c.b(cls);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(Class cls) {
        if (!vc.b()) {
            return false;
        }
        try {
            Class cls2 = f8407b;
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

    public static Unsafe a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a.f5());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int b(Class cls) {
        if (f8410e) {
            return f8408c.a(cls);
        }
        return -1;
    }

    public static void a(Object obj, long j13, byte b13) {
        long j14 = (-4) & j13;
        lw2 lw2Var = f8408c;
        int e13 = lw2Var.e(obj, j14);
        int i13 = ((~((int) j13)) & 3) << 3;
        lw2Var.a(((255 & b13) << i13) | (e13 & (~(255 << i13))), j14, obj);
    }

    public static Object a(Class cls) {
        try {
            return f8406a.allocateInstance(cls);
        } catch (InstantiationException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public static void a(int i13, long j13, Object obj) {
        f8408c.a(i13, j13, obj);
    }

    public static void a(Object obj, long j13, boolean z13) {
        f8408c.a(obj, j13, z13);
    }

    public static void a(Object obj, long j13, float f13) {
        f8408c.a(obj, j13, f13);
    }

    public static void a(Object obj, long j13, double d2) {
        f8408c.a(obj, j13, d2);
    }

    public static void a(long j13, Object obj, Serializable serializable) {
        f8408c.a(j13, obj, serializable);
    }

    public static void a(byte[] bArr, long j13, byte b13) {
        f8408c.a((Object) bArr, f8411f + j13, b13);
    }

    public static void a(Throwable th3) {
        Logger.getLogger(mw2.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th3)));
    }
}
