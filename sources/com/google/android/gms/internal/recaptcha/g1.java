package com.google.android.gms.internal.recaptcha;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public final class g1 extends h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31751b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(Unsafe unsafe, int i13) {
        super(unsafe);
        this.f31751b = i13;
    }

    @Override // com.google.android.gms.internal.recaptcha.h1
    public final byte a(long j13, Object obj) {
        switch (this.f31751b) {
            case 0:
                if (!j1.f31764h) {
                    break;
                } else {
                    break;
                }
            default:
                if (!j1.f31764h) {
                    break;
                } else {
                    break;
                }
        }
        return j1.n(j13, obj);
    }

    @Override // com.google.android.gms.internal.recaptcha.h1
    public final void d(long j13, Object obj, boolean z13) {
        switch (this.f31751b) {
            case 0:
                if (!j1.f31764h) {
                    j1.i(obj, j13, z13);
                    break;
                } else {
                    j1.f(j13, obj, z13);
                    break;
                }
            default:
                if (!j1.f31764h) {
                    j1.i(obj, j13, z13);
                    break;
                } else {
                    j1.f(j13, obj, z13);
                    break;
                }
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.h1
    public final void e(Object obj, long j13, double d2) {
        switch (this.f31751b) {
            case 0:
                c(j13, obj, Double.doubleToLongBits(d2));
                break;
            default:
                c(j13, obj, Double.doubleToLongBits(d2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.h1
    public final void f(Object obj, long j13, float f13) {
        switch (this.f31751b) {
            case 0:
                b(Float.floatToIntBits(f13), j13, obj);
                break;
            default:
                b(Float.floatToIntBits(f13), j13, obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.recaptcha.h1
    public final boolean g(long j13, Object obj) {
        switch (this.f31751b) {
            case 0:
                if (j1.f31764h) {
                    if (j1.m(j13, obj) == 0) {
                    }
                } else if (j1.n(j13, obj) == 0) {
                }
                break;
            default:
                if (j1.f31764h) {
                    if (j1.m(j13, obj) == 0) {
                    }
                } else if (j1.n(j13, obj) == 0) {
                }
                break;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.recaptcha.h1
    public final float h(long j13, Object obj) {
        switch (this.f31751b) {
        }
        return Float.intBitsToFloat(j(j13, obj));
    }

    @Override // com.google.android.gms.internal.recaptcha.h1
    public final double i(long j13, Object obj) {
        switch (this.f31751b) {
        }
        return Double.longBitsToDouble(k(j13, obj));
    }
}
