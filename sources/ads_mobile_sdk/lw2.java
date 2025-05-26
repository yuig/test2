package ads_mobile_sdk;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class lw2 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f8015a;

    public lw2(Unsafe unsafe) {
        this.f8015a = unsafe;
    }

    public abstract byte a(long j13);

    public final int a(Class cls) {
        return this.f8015a.arrayBaseOffset(cls);
    }

    public abstract void a(long j13, byte[] bArr, long j14, long j15);

    public abstract void a(Object obj, long j13, byte b13);

    public abstract void a(Object obj, long j13, double d2);

    public abstract void a(Object obj, long j13, float f13);

    public abstract void a(Object obj, long j13, boolean z13);

    public abstract boolean a(Object obj, long j13);

    public abstract byte b(Object obj, long j13);

    public final int b(Class cls) {
        return this.f8015a.arrayIndexScale(cls);
    }

    public abstract double c(Object obj, long j13);

    public abstract float d(Object obj, long j13);

    public final int e(Object obj, long j13) {
        return this.f8015a.getInt(obj, j13);
    }

    public final long f(Object obj, long j13) {
        return this.f8015a.getLong(obj, j13);
    }

    public final Object g(Object obj, long j13) {
        return this.f8015a.getObject(obj, j13);
    }

    public final long a(Field field) {
        return this.f8015a.objectFieldOffset(field);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r0.getType() == java.lang.Long.TYPE) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b() {
        /*
            r6 = this;
            sun.misc.Unsafe r0 = r6.f8015a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "objectFieldOffset"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<java.lang.reflect.Field> r5 = java.lang.reflect.Field.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> L3d
            r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r2 = "getLong"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r4[r1] = r5     // Catch: java.lang.Throwable -> L3d
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L3d
            r4[r3] = r5     // Catch: java.lang.Throwable -> L3d
            r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L3d
            sun.misc.Unsafe r0 = ads_mobile_sdk.mw2.f8406a     // Catch: java.lang.Throwable -> L3d
            boolean r0 = ads_mobile_sdk.vc.b()     // Catch: java.lang.Throwable -> L3d
            java.lang.Class<java.nio.Buffer> r2 = java.nio.Buffer.class
            r4 = 0
            if (r0 == 0) goto L3f
            java.lang.String r0 = "effectiveDirectAddress"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L38
            goto L39
        L38:
            r0 = r4
        L39:
            if (r0 == 0) goto L3f
        L3b:
            r4 = r0
            goto L52
        L3d:
            r0 = move-exception
            goto L56
        L3f:
            java.lang.String r0 = "address"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L46
            goto L47
        L46:
            r0 = r4
        L47:
            if (r0 == 0) goto L52
            java.lang.Class r2 = r0.getType()     // Catch: java.lang.Throwable -> L3d
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L3d
            if (r2 != r5) goto L52
            goto L3b
        L52:
            if (r4 != 0) goto L55
            return r1
        L55:
            return r3
        L56:
            ads_mobile_sdk.mw2.a(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.lw2.b():boolean");
    }

    public final void a(int i13, long j13, Object obj) {
        this.f8015a.putInt(obj, j13, i13);
    }

    public final void a(Object obj, long j13, long j14) {
        this.f8015a.putLong(obj, j13, j14);
    }

    public final void a(long j13, Object obj, Object obj2) {
        this.f8015a.putObject(obj, j13, obj2);
    }

    public boolean a() {
        Unsafe unsafe = this.f8015a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th3) {
            mw2.a(th3);
            return false;
        }
    }
}
