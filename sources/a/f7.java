package a;

import ads_mobile_sdk.lw2;
import ads_mobile_sdk.mw2;

/* loaded from: classes2.dex */
public final class f7 extends lw2 {
    @Override // ads_mobile_sdk.lw2
    public final void a(long j13, byte[] bArr, long j14, long j15) {
        this.f8015a.copyMemory((Object) null, j13, bArr, mw2.f8411f + j14, j15);
    }

    @Override // ads_mobile_sdk.lw2
    public final byte b(Object obj, long j13) {
        return this.f8015a.getByte(obj, j13);
    }

    @Override // ads_mobile_sdk.lw2
    public final double c(Object obj, long j13) {
        return this.f8015a.getDouble(obj, j13);
    }

    @Override // ads_mobile_sdk.lw2
    public final float d(Object obj, long j13) {
        return this.f8015a.getFloat(obj, j13);
    }

    @Override // ads_mobile_sdk.lw2
    public final boolean b() {
        if (!super.b()) {
            return false;
        }
        try {
            Class<?> cls = this.f8015a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th3) {
            mw2.a(th3);
            return false;
        }
    }

    @Override // ads_mobile_sdk.lw2
    public final boolean a(Object obj, long j13) {
        return this.f8015a.getBoolean(obj, j13);
    }

    @Override // ads_mobile_sdk.lw2
    public final byte a(long j13) {
        return this.f8015a.getByte(j13);
    }

    @Override // ads_mobile_sdk.lw2
    public final void a(Object obj, long j13, boolean z13) {
        this.f8015a.putBoolean(obj, j13, z13);
    }

    @Override // ads_mobile_sdk.lw2
    public final void a(Object obj, long j13, byte b13) {
        this.f8015a.putByte(obj, j13, b13);
    }

    @Override // ads_mobile_sdk.lw2
    public final void a(Object obj, long j13, double d2) {
        this.f8015a.putDouble(obj, j13, d2);
    }

    @Override // ads_mobile_sdk.lw2
    public final void a(Object obj, long j13, float f13) {
        this.f8015a.putFloat(obj, j13, f13);
    }

    @Override // ads_mobile_sdk.lw2
    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        try {
            Class<?> cls = this.f8015a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th3) {
            mw2.a(th3);
            return false;
        }
    }
}
