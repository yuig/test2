package v9;

import d7.k0;
import d7.n0;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: c, reason: collision with root package name */
    public boolean f124840c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f124841d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f124842e;

    /* renamed from: a, reason: collision with root package name */
    public final k0 f124838a = new k0(0);

    /* renamed from: f, reason: collision with root package name */
    public long f124843f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f124844g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f124845h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final d7.d0 f124839b = new d7.d0();

    public static int b(int i13, byte[] bArr) {
        return (bArr[i13 + 3] & 255) | ((bArr[i13] & 255) << 24) | ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13 + 2] & 255) << 8);
    }

    public static long c(d7.d0 d0Var) {
        int i13 = d0Var.f53807b;
        if (d0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        d0Var.i(bArr, 0, 9);
        d0Var.K(i13);
        byte b13 = bArr[0];
        if ((b13 & 196) == 68) {
            byte b14 = bArr[2];
            if ((b14 & 4) == 4) {
                byte b15 = bArr[4];
                if ((b15 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j13 = b13;
                    long j14 = b14;
                    return ((j14 & 3) << 13) | ((j13 & 3) << 28) | (((56 & j13) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j14 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b15 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(q8.t tVar) {
        byte[] bArr = n0.f53868c;
        d7.d0 d0Var = this.f124839b;
        d0Var.getClass();
        d0Var.I(bArr.length, bArr);
        this.f124840c = true;
        tVar.g();
    }
}
