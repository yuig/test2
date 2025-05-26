package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f33597a;

    public c2(Unsafe unsafe) {
        this.f33597a = unsafe;
    }

    public final int a(Class cls) {
        return this.f33597a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f33597a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j13, Object obj);

    public abstract byte d(long j13, Object obj);

    public abstract double e(long j13, Object obj);

    public abstract float f(long j13, Object obj);

    public final int g(long j13, Object obj) {
        return this.f33597a.getInt(obj, j13);
    }

    public final long h(long j13, Object obj) {
        return this.f33597a.getLong(obj, j13);
    }

    public final Object i(long j13, Object obj) {
        return this.f33597a.getObject(obj, j13);
    }

    public final long j(Field field) {
        return this.f33597a.objectFieldOffset(field);
    }

    public abstract void k(long j13, Object obj, boolean z13);

    public abstract void l(Object obj, long j13, byte b13);

    public abstract void m(Object obj, long j13, double d2);

    public abstract void n(Object obj, long j13, float f13);

    public final void o(int i13, long j13, Object obj) {
        this.f33597a.putInt(obj, j13, i13);
    }

    public final void p(long j13, Object obj, long j14) {
        this.f33597a.putLong(obj, j13, j14);
    }

    public final void q(long j13, Object obj, Object obj2) {
        this.f33597a.putObject(obj, j13, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f33597a;
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
            d2.a(th3);
            return false;
        }
    }

    public abstract boolean s();
}
