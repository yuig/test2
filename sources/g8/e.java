package g8;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* loaded from: classes3.dex */
public final class e extends t {

    /* renamed from: c, reason: collision with root package name */
    public final long f64229c;

    /* renamed from: d, reason: collision with root package name */
    public final long f64230d;

    /* renamed from: e, reason: collision with root package name */
    public final long f64231e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f64232f;

    public e(a7.b1 b1Var, long j13, long j14) {
        super(b1Var);
        if (j14 != Long.MIN_VALUE && j14 < j13) {
            throw new ClippingMediaSource$IllegalClippingException(2, j13, j14);
        }
        boolean z13 = false;
        if (b1Var.i() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        a7.a1 n13 = b1Var.n(0, new a7.a1(), 0L);
        long max = Math.max(0L, j13);
        if (!n13.f939k && max != 0 && !n13.f936h) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long max2 = j14 == Long.MIN_VALUE ? n13.f941m : Math.max(0L, j14);
        long j15 = n13.f941m;
        if (j15 != -9223372036854775807L) {
            max2 = max2 > j15 ? j15 : max2;
            if (max > max2) {
                max = max2;
            }
        }
        this.f64229c = max;
        this.f64230d = max2;
        this.f64231e = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
        if (n13.f937i && (max2 == -9223372036854775807L || (j15 != -9223372036854775807L && max2 == j15))) {
            z13 = true;
        }
        this.f64232f = z13;
    }

    @Override // g8.t, a7.b1
    public final a7.z0 g(int i13, a7.z0 z0Var, boolean z13) {
        this.f64402b.g(0, z0Var, z13);
        long j13 = z0Var.f1255e - this.f64229c;
        long j14 = this.f64231e;
        z0Var.o(z0Var.f1251a, z0Var.f1252b, 0, j14 == -9223372036854775807L ? -9223372036854775807L : j14 - j13, j13, a7.b.f945g, false);
        return z0Var;
    }

    @Override // g8.t, a7.b1
    public final a7.a1 n(int i13, a7.a1 a1Var, long j13) {
        this.f64402b.n(0, a1Var, 0L);
        long j14 = a1Var.f944p;
        long j15 = this.f64229c;
        a1Var.f944p = j14 + j15;
        a1Var.f941m = this.f64231e;
        a1Var.f937i = this.f64232f;
        long j16 = a1Var.f940l;
        if (j16 != -9223372036854775807L) {
            long max = Math.max(j16, j15);
            a1Var.f940l = max;
            long j17 = this.f64230d;
            if (j17 != -9223372036854775807L) {
                max = Math.min(max, j17);
            }
            a1Var.f940l = max - j15;
        }
        long o03 = d7.n0.o0(j15);
        long j18 = a1Var.f933e;
        if (j18 != -9223372036854775807L) {
            a1Var.f933e = j18 + o03;
        }
        long j19 = a1Var.f934f;
        if (j19 != -9223372036854775807L) {
            a1Var.f934f = j19 + o03;
        }
        return a1Var;
    }
}
