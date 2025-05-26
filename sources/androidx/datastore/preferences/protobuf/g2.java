package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f18066a;

    public g2(Unsafe unsafe) {
        this.f18066a = unsafe;
    }

    public final int a(Class cls) {
        return this.f18066a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f18066a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j13, Object obj);

    public abstract byte d(long j13, Object obj);

    public abstract double e(long j13, Object obj);

    public abstract float f(long j13, Object obj);

    public final int g(long j13, Object obj) {
        return this.f18066a.getInt(obj, j13);
    }

    public final long h(long j13, Object obj) {
        return this.f18066a.getLong(obj, j13);
    }

    public final Object i(long j13, Object obj) {
        return this.f18066a.getObject(obj, j13);
    }

    public final long j(Field field) {
        return this.f18066a.objectFieldOffset(field);
    }

    public abstract void k(long j13, Object obj, boolean z13);

    public abstract void l(Object obj, long j13, byte b13);

    public abstract void m(Object obj, long j13, double d2);

    public abstract void n(Object obj, long j13, float f13);

    public final void o(int i13, long j13, Object obj) {
        this.f18066a.putInt(obj, j13, i13);
    }

    public final void p(long j13, Object obj, long j14) {
        this.f18066a.putLong(obj, j13, j14);
    }

    public final void q(long j13, Object obj, Object obj2) {
        this.f18066a.putObject(obj, j13, obj2);
    }
}
