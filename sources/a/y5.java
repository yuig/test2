package a;

import ads_mobile_sdk.lw2;
import ads_mobile_sdk.mw2;
import ads_mobile_sdk.qa1;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class y5 extends lw2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f189b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(Unsafe unsafe, int i13) {
        super(unsafe);
        this.f189b = i13;
    }

    @Override // ads_mobile_sdk.lw2
    public final byte a(long j13) {
        switch (this.f189b) {
            case 0:
                return qa1.a((int) j13);
            default:
                return qa1.a(j13);
        }
    }

    @Override // ads_mobile_sdk.lw2
    public final byte b(Object obj, long j13) {
        switch (this.f189b) {
            case 0:
                if (mw2.f8413h) {
                    return mw2.a(obj, j13);
                }
                return (byte) ((mw2.f8408c.e(obj, (-4) & j13) >>> ((int) ((j13 & 3) << 3))) & 255);
            default:
                if (mw2.f8413h) {
                    return mw2.a(obj, j13);
                }
                return (byte) ((mw2.f8408c.e(obj, (-4) & j13) >>> ((int) ((j13 & 3) << 3))) & 255);
        }
    }

    @Override // ads_mobile_sdk.lw2
    public final double c(Object obj, long j13) {
        switch (this.f189b) {
        }
        return Double.longBitsToDouble(f(obj, j13));
    }

    @Override // ads_mobile_sdk.lw2
    public final float d(Object obj, long j13) {
        switch (this.f189b) {
        }
        return Float.intBitsToFloat(e(obj, j13));
    }

    @Override // ads_mobile_sdk.lw2
    public final void a(long j13, byte[] bArr, long j14, long j15) {
        switch (this.f189b) {
            case 0:
                qa1.a((int) j13, (int) j14, (int) j15, bArr);
                break;
            default:
                qa1.a((int) j14, (int) j15, j13, bArr);
                break;
        }
    }

    @Override // ads_mobile_sdk.lw2
    public final void a(Object obj, long j13, byte b13) {
        switch (this.f189b) {
            case 0:
                if (mw2.f8413h) {
                    mw2.a(obj, j13, b13);
                    break;
                } else {
                    mw2.b(obj, j13, b13);
                    break;
                }
            default:
                if (mw2.f8413h) {
                    mw2.a(obj, j13, b13);
                    break;
                } else {
                    mw2.b(obj, j13, b13);
                    break;
                }
        }
    }

    @Override // ads_mobile_sdk.lw2
    public final boolean b() {
        switch (this.f189b) {
        }
        return super.b();
    }

    @Override // ads_mobile_sdk.lw2
    public final void a(Object obj, long j13, double d2) {
        switch (this.f189b) {
            case 0:
                a(obj, j13, Double.doubleToLongBits(d2));
                break;
            default:
                a(obj, j13, Double.doubleToLongBits(d2));
                break;
        }
    }

    @Override // ads_mobile_sdk.lw2
    public final void a(Object obj, long j13, float f13) {
        switch (this.f189b) {
            case 0:
                a(Float.floatToIntBits(f13), j13, obj);
                break;
            default:
                a(Float.floatToIntBits(f13), j13, obj);
                break;
        }
    }

    @Override // ads_mobile_sdk.lw2
    public final void a(Object obj, long j13, boolean z13) {
        switch (this.f189b) {
            case 0:
                if (mw2.f8413h) {
                    mw2.a(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    mw2.b(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                }
            default:
                if (mw2.f8413h) {
                    mw2.a(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                } else {
                    mw2.b(obj, j13, z13 ? (byte) 1 : (byte) 0);
                    break;
                }
        }
    }

    @Override // ads_mobile_sdk.lw2
    public final boolean a(Object obj, long j13) {
        switch (this.f189b) {
            case 0:
                if (mw2.f8413h) {
                    if (mw2.a(obj, j13) != 0) {
                    }
                } else {
                    if (((byte) ((mw2.f8408c.e(obj, (-4) & j13) >>> ((int) ((j13 & 3) << 3))) & 255)) != 0) {
                    }
                }
                break;
            default:
                if (mw2.f8413h) {
                    if (mw2.a(obj, j13) != 0) {
                    }
                } else {
                    if (((byte) ((mw2.f8408c.e(obj, (-4) & j13) >>> ((int) ((j13 & 3) << 3))) & 255)) != 0) {
                    }
                }
                break;
        }
        return false;
    }
}
