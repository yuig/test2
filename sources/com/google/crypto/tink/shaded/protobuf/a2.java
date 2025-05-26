package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class a2 extends c2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33592b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(Unsafe unsafe, int i13) {
        super(unsafe);
        this.f33592b = i13;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final boolean c(long j13, Object obj) {
        switch (this.f33592b) {
            case 0:
                if (d2.f33606g) {
                    if (d2.h(j13, obj) == 0) {
                    }
                } else if (d2.i(j13, obj) == 0) {
                }
                break;
            default:
                if (d2.f33606g) {
                    if (d2.h(j13, obj) == 0) {
                    }
                } else if (d2.i(j13, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final byte d(long j13, Object obj) {
        switch (this.f33592b) {
            case 0:
                if (!d2.f33606g) {
                    break;
                } else {
                    break;
                }
            default:
                if (!d2.f33606g) {
                    break;
                } else {
                    break;
                }
        }
        return d2.i(j13, obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final double e(long j13, Object obj) {
        switch (this.f33592b) {
        }
        return Double.longBitsToDouble(h(j13, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final float f(long j13, Object obj) {
        switch (this.f33592b) {
        }
        return Float.intBitsToFloat(g(j13, obj));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final void k(long j13, Object obj, boolean z13) {
        switch (this.f33592b) {
            case 0:
                if (!d2.f33606g) {
                    d2.n(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d2.m(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (!d2.f33606g) {
                    d2.n(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    d2.m(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final void l(Object obj, long j13, byte b13) {
        switch (this.f33592b) {
            case 0:
                if (!d2.f33606g) {
                    d2.n(obj, j13, b13);
                    break;
                } else {
                    d2.m(obj, j13, b13);
                    break;
                }
            default:
                if (!d2.f33606g) {
                    d2.n(obj, j13, b13);
                    break;
                } else {
                    d2.m(obj, j13, b13);
                    break;
                }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final void m(Object obj, long j13, double d2) {
        switch (this.f33592b) {
            case 0:
                p(j13, obj, Double.doubleToLongBits(d2));
                break;
            default:
                p(j13, obj, Double.doubleToLongBits(d2));
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final void n(Object obj, long j13, float f13) {
        switch (this.f33592b) {
            case 0:
                o(Float.floatToIntBits(f13), j13, obj);
                break;
            default:
                o(Float.floatToIntBits(f13), j13, obj);
                break;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c2
    public final boolean s() {
        return false;
    }
}
