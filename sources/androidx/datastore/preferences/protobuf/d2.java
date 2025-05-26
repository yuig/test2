package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class d2 extends g2 {
    @Override // androidx.datastore.preferences.protobuf.g2
    public final boolean c(long j13, Object obj) {
        return h2.f18074h ? h2.h(j13, obj) != 0 : h2.i(j13, obj) != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final byte d(long j13, Object obj) {
        return h2.f18074h ? h2.h(j13, obj) : h2.i(j13, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final double e(long j13, Object obj) {
        return Double.longBitsToDouble(h(j13, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final float f(long j13, Object obj) {
        return Float.intBitsToFloat(g(j13, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final void k(long j13, Object obj, boolean z13) {
        if (h2.f18074h) {
            h2.o(obj, j13, z13 ? (byte) 1 : (byte) 0);
        } else {
            h2.p(obj, j13, z13 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final void l(Object obj, long j13, byte b13) {
        if (h2.f18074h) {
            h2.o(obj, j13, b13);
        } else {
            h2.p(obj, j13, b13);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final void m(Object obj, long j13, double d2) {
        p(j13, obj, Double.doubleToLongBits(d2));
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final void n(Object obj, long j13, float f13) {
        o(Float.floatToIntBits(f13), j13, obj);
    }
}
