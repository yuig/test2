package androidx.datastore.preferences.protobuf;

/* loaded from: classes3.dex */
public final class f2 extends g2 {
    @Override // androidx.datastore.preferences.protobuf.g2
    public final boolean c(long j13, Object obj) {
        return this.f18066a.getBoolean(obj, j13);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final byte d(long j13, Object obj) {
        return this.f18066a.getByte(obj, j13);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final double e(long j13, Object obj) {
        return this.f18066a.getDouble(obj, j13);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final float f(long j13, Object obj) {
        return this.f18066a.getFloat(obj, j13);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final void k(long j13, Object obj, boolean z13) {
        this.f18066a.putBoolean(obj, j13, z13);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final void l(Object obj, long j13, byte b13) {
        this.f18066a.putByte(obj, j13, b13);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final void m(Object obj, long j13, double d2) {
        this.f18066a.putDouble(obj, j13, d2);
    }

    @Override // androidx.datastore.preferences.protobuf.g2
    public final void n(Object obj, long j13, float f13) {
        this.f18066a.putFloat(obj, j13, f13);
    }
}
