package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class b2 extends c2 {
    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final boolean c(long j13, Object obj) {
        return this.f33597a.getBoolean(obj, j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final byte d(long j13, Object obj) {
        return this.f33597a.getByte(obj, j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final double e(long j13, Object obj) {
        return this.f33597a.getDouble(obj, j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final float f(long j13, Object obj) {
        return this.f33597a.getFloat(obj, j13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final void k(long j13, Object obj, boolean z13) {
        this.f33597a.putBoolean(obj, j13, z13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final void l(Object obj, long j13, byte b13) {
        this.f33597a.putByte(obj, j13, b13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final void m(Object obj, long j13, double d2) {
        this.f33597a.putDouble(obj, j13, d2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final void n(Object obj, long j13, float f13) {
        this.f33597a.putFloat(obj, j13, f13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f33597a.getClass();
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
            d2.a(th3);
            return false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final boolean s() {
        Unsafe unsafe = this.f33597a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (d2.e() != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th3) {
                        d2.a(th3);
                        return false;
                    }
                }
            } catch (Throwable th4) {
                d2.a(th4);
            }
        }
        return false;
    }
}
