package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f33957a;

    public p2(Unsafe unsafe) {
        this.f33957a = unsafe;
    }

    public final int a(Class cls) {
        return this.f33957a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f33957a.arrayIndexScale(cls);
    }

    public abstract void c(long j13, byte[] bArr, long j14);

    public abstract boolean d(long j13, Object obj);

    public abstract byte e(long j13);

    public abstract double f(long j13, Object obj);

    public abstract float g(long j13, Object obj);

    public final int h(long j13, Object obj) {
        return this.f33957a.getInt(obj, j13);
    }

    public final long i(long j13, Object obj) {
        return this.f33957a.getLong(obj, j13);
    }

    public final Object j(long j13, Object obj) {
        return this.f33957a.getObject(obj, j13);
    }

    public final long k(Field field) {
        return this.f33957a.objectFieldOffset(field);
    }

    public abstract void l(long j13, Object obj, boolean z13);

    public abstract void m(Object obj, long j13, byte b13);

    public abstract void n(Object obj, long j13, double d2);

    public abstract void o(Object obj, long j13, float f13);

    public final void p(int i13, long j13, Object obj) {
        this.f33957a.putInt(obj, j13, i13);
    }

    public final void q(long j13, Object obj, long j14) {
        this.f33957a.putLong(obj, j13, j14);
    }

    public final void r(long j13, Object obj, Object obj2) {
        this.f33957a.putObject(obj, j13, obj2);
    }

    public boolean s() {
        Unsafe unsafe = this.f33957a;
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
            q2.a(th3);
            return false;
        }
    }

    public abstract boolean t();
}
