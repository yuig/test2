package com.google.protobuf;

/* loaded from: classes.dex */
public final class o2 extends p2 {
    @Override // com.google.protobuf.p2
    public final void c(long j13, byte[] bArr, long j14) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.p2
    public final boolean d(long j13, Object obj) {
        return q2.f33967h ? q2.h(j13, obj) != 0 : q2.i(j13, obj) != 0;
    }

    @Override // com.google.protobuf.p2
    public final byte e(long j13) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.p2
    public final double f(long j13, Object obj) {
        return Double.longBitsToDouble(i(j13, obj));
    }

    @Override // com.google.protobuf.p2
    public final float g(long j13, Object obj) {
        return Float.intBitsToFloat(h(j13, obj));
    }

    @Override // com.google.protobuf.p2
    public final void l(long j13, Object obj, boolean z13) {
        if (q2.f33967h) {
            q2.p(obj, j13, z13 ? (byte) 1 : (byte) 0);
        } else {
            q2.q(obj, j13, z13 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.protobuf.p2
    public final void m(Object obj, long j13, byte b13) {
        if (q2.f33967h) {
            q2.p(obj, j13, b13);
        } else {
            q2.q(obj, j13, b13);
        }
    }

    @Override // com.google.protobuf.p2
    public final void n(Object obj, long j13, double d2) {
        q(j13, obj, Double.doubleToLongBits(d2));
    }

    @Override // com.google.protobuf.p2
    public final void o(Object obj, long j13, float f13) {
        p(Float.floatToIntBits(f13), j13, obj);
    }

    @Override // com.google.protobuf.p2
    public final boolean t() {
        return false;
    }
}
