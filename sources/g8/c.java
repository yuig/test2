package g8;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import m7.x1;

/* loaded from: classes3.dex */
public final class c implements c0, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f64215a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f64216b;

    /* renamed from: c, reason: collision with root package name */
    public b[] f64217c = new b[0];

    /* renamed from: d, reason: collision with root package name */
    public long f64218d;

    /* renamed from: e, reason: collision with root package name */
    public long f64219e;

    /* renamed from: f, reason: collision with root package name */
    public long f64220f;

    /* renamed from: g, reason: collision with root package name */
    public ClippingMediaSource$IllegalClippingException f64221g;

    public c(c0 c0Var, boolean z13, long j13, long j14) {
        this.f64215a = c0Var;
        this.f64218d = z13 ? j13 : -9223372036854775807L;
        this.f64219e = j13;
        this.f64220f = j14;
    }

    @Override // g8.d1
    public final long a() {
        long a13 = this.f64215a.a();
        if (a13 != Long.MIN_VALUE) {
            long j13 = this.f64220f;
            if (j13 == Long.MIN_VALUE || a13 < j13) {
                return a13;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean b() {
        return this.f64218d != -9223372036854775807L;
    }

    @Override // g8.c0
    public final long c(long j13, x1 x1Var) {
        long j14 = this.f64219e;
        if (j13 == j14) {
            return j14;
        }
        long j15 = d7.n0.j(x1Var.f86482a, 0L, j13 - j14);
        long j16 = this.f64220f;
        long j17 = d7.n0.j(x1Var.f86483b, 0L, j16 == Long.MIN_VALUE ? Long.MAX_VALUE : j16 - j13);
        if (j15 != x1Var.f86482a || j17 != x1Var.f86483b) {
            x1Var = new x1(j15, j17);
        }
        return this.f64215a.c(j13, x1Var);
    }

    public final void d(long j13) {
        this.f64219e = 0L;
        this.f64220f = j13;
    }

    @Override // g8.b0
    public final void e(c0 c0Var) {
        if (this.f64221g != null) {
            return;
        }
        b0 b0Var = this.f64216b;
        b0Var.getClass();
        b0Var.e(this);
    }

    @Override // g8.c0
    public final long f(long j13) {
        this.f64218d = -9223372036854775807L;
        for (b bVar : this.f64217c) {
            if (bVar != null) {
                bVar.f64213b = false;
            }
        }
        long f13 = this.f64215a.f(j13);
        long j14 = this.f64219e;
        long j15 = this.f64220f;
        long max = Math.max(f13, j14);
        return j15 != Long.MIN_VALUE ? Math.min(max, j15) : max;
    }

    @Override // g8.d1
    public final boolean g() {
        return this.f64215a.g();
    }

    @Override // g8.c0
    public final void h(b0 b0Var, long j13) {
        this.f64216b = b0Var;
        this.f64215a.h(this, j13);
    }

    @Override // g8.c1
    public final void i(d1 d1Var) {
        b0 b0Var = this.f64216b;
        b0Var.getClass();
        b0Var.i(this);
    }

    @Override // g8.c0
    public final long k() {
        if (b()) {
            long j13 = this.f64218d;
            this.f64218d = -9223372036854775807L;
            long k13 = k();
            return k13 != -9223372036854775807L ? k13 : j13;
        }
        long k14 = this.f64215a.k();
        if (k14 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j14 = this.f64219e;
        long j15 = this.f64220f;
        long max = Math.max(k14, j14);
        return j15 != Long.MIN_VALUE ? Math.min(max, j15) : max;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    @Override // g8.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l(k8.t[] r18, boolean[] r19, g8.b1[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r0 = r17
            r8 = r18
            r9 = r20
            r10 = r22
            int r1 = r9.length
            g8.b[] r1 = new g8.b[r1]
            r0.f64217c = r1
            int r1 = r9.length
            g8.b1[] r12 = new g8.b1[r1]
            r13 = 0
            r1 = r13
        L12:
            int r2 = r9.length
            r14 = 0
            if (r1 >= r2) goto L27
            g8.b[] r2 = r0.f64217c
            r3 = r9[r1]
            g8.b r3 = (g8.b) r3
            r2[r1] = r3
            if (r3 == 0) goto L22
            g8.b1 r14 = r3.f64212a
        L22:
            r12[r1] = r14
            int r1 = r1 + 1
            goto L12
        L27:
            g8.c0 r1 = r0.f64215a
            r2 = r18
            r3 = r19
            r4 = r12
            r5 = r21
            r6 = r22
            long r1 = r1.l(r2, r3, r4, r5, r6)
            long r3 = r0.f64220f
            long r5 = java.lang.Math.max(r1, r10)
            r15 = -9223372036854775808
            int r7 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r7 == 0) goto L46
            long r5 = java.lang.Math.min(r5, r3)
        L46:
            boolean r3 = r17.b()
            if (r3 == 0) goto L72
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 >= 0) goto L51
            goto L6d
        L51:
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L72
            int r1 = r8.length
            r2 = r13
        L59:
            if (r2 >= r1) goto L72
            r3 = r8[r2]
            if (r3 == 0) goto L6f
            androidx.media3.common.b r3 = r3.r()
            java.lang.String r4 = r3.f18765o
            java.lang.String r3 = r3.f18761k
            boolean r3 = a7.o0.a(r4, r3)
            if (r3 != 0) goto L6f
        L6d:
            r1 = r5
            goto L77
        L6f:
            int r2 = r2 + 1
            goto L59
        L72:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L77:
            r0.f64218d = r1
        L79:
            int r1 = r9.length
            if (r13 >= r1) goto L9f
            r1 = r12[r13]
            if (r1 != 0) goto L85
            g8.b[] r1 = r0.f64217c
            r1[r13] = r14
            goto L96
        L85:
            g8.b[] r2 = r0.f64217c
            r3 = r2[r13]
            if (r3 == 0) goto L8f
            g8.b1 r3 = r3.f64212a
            if (r3 == r1) goto L96
        L8f:
            g8.b r3 = new g8.b
            r3.<init>(r0, r1)
            r2[r13] = r3
        L96:
            g8.b[] r1 = r0.f64217c
            r1 = r1[r13]
            r9[r13] = r1
            int r13 = r13 + 1
            goto L79
        L9f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.c.l(k8.t[], boolean[], g8.b1[], boolean[], long):long");
    }

    @Override // g8.c0
    public final void n() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.f64221g;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.f64215a.n();
    }

    @Override // g8.d1
    public final boolean q(m7.y0 y0Var) {
        return this.f64215a.q(y0Var);
    }

    @Override // g8.c0
    public final m1 r() {
        return this.f64215a.r();
    }

    @Override // g8.d1
    public final long t() {
        long t13 = this.f64215a.t();
        if (t13 != Long.MIN_VALUE) {
            long j13 = this.f64220f;
            if (j13 == Long.MIN_VALUE || t13 < j13) {
                return t13;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // g8.c0
    public final void u(long j13, boolean z13) {
        this.f64215a.u(j13, z13);
    }

    @Override // g8.d1
    public final void v(long j13) {
        this.f64215a.v(j13);
    }
}
