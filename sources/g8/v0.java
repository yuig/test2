package g8;

import android.os.Looper;

/* loaded from: classes3.dex */
public final class v0 extends a {

    /* renamed from: h, reason: collision with root package name */
    public final g7.e f64444h;

    /* renamed from: i, reason: collision with root package name */
    public final a8.v f64445i;

    /* renamed from: j, reason: collision with root package name */
    public final s7.q f64446j;

    /* renamed from: k, reason: collision with root package name */
    public final a10.e f64447k;

    /* renamed from: l, reason: collision with root package name */
    public final int f64448l;

    /* renamed from: m, reason: collision with root package name */
    public final int f64449m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.media3.common.b f64450n;

    /* renamed from: r, reason: collision with root package name */
    public boolean f64454r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f64455s;

    /* renamed from: t, reason: collision with root package name */
    public g7.a0 f64456t;

    /* renamed from: u, reason: collision with root package name */
    public a7.i0 f64457u;

    /* renamed from: p, reason: collision with root package name */
    public boolean f64452p = true;

    /* renamed from: q, reason: collision with root package name */
    public long f64453q = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final ok.g0 f64451o = null;

    public v0(a7.i0 i0Var, g7.e eVar, a8.v vVar, s7.q qVar, a10.e eVar2, int i13, int i14, androidx.media3.common.b bVar) {
        this.f64457u = i0Var;
        this.f64444h = eVar;
        this.f64445i = vVar;
        this.f64446j = qVar;
        this.f64447k = eVar2;
        this.f64448l = i13;
        this.f64450n = bVar;
        this.f64449m = i14;
    }

    @Override // g8.a
    public final c0 b(e0 e0Var, l8.m mVar, long j13) {
        g7.f a13 = this.f64444h.a();
        g7.a0 a0Var = this.f64456t;
        if (a0Var != null) {
            a13.f(a0Var);
        }
        a7.d0 d0Var = j().f1073b;
        d0Var.getClass();
        bf.b.w(this.f64178g);
        androidx.appcompat.app.d dVar = new androidx.appcompat.app.d((q8.v) this.f64445i.f1465b);
        s7.m mVar2 = new s7.m(this.f64175d.f111329c, 0, e0Var);
        h0 a14 = a(e0Var);
        long X = d7.n0.X(d0Var.f976h);
        ok.g0 g0Var = this.f64451o;
        return new t0(d0Var.f969a, a13, dVar, this.f64446j, mVar2, this.f64447k, a14, this, mVar, d0Var.f973e, this.f64448l, this.f64449m, this.f64450n, X, g0Var != null ? (m8.a) g0Var.get() : null);
    }

    @Override // g8.a
    public final synchronized a7.i0 j() {
        return this.f64457u;
    }

    @Override // g8.a
    public final void l() {
    }

    @Override // g8.a
    public final void n(g7.a0 a0Var) {
        this.f64456t = a0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        n7.q0 q0Var = this.f64178g;
        bf.b.w(q0Var);
        s7.q qVar = this.f64446j;
        qVar.e(myLooper, q0Var);
        qVar.b();
        x();
    }

    @Override // g8.a
    public final void q(c0 c0Var) {
        t0 t0Var = (t0) c0Var;
        if (t0Var.f64428y) {
            for (a1 a1Var : t0Var.f64425v) {
                a1Var.j();
                s7.j jVar = a1Var.f64193h;
                if (jVar != null) {
                    jVar.c(a1Var.f64190e);
                    a1Var.f64193h = null;
                    a1Var.f64192g = null;
                }
            }
        }
        t0Var.f64417n.f(t0Var);
        t0Var.f64422s.removeCallbacksAndMessages(null);
        t0Var.f64423t = null;
        t0Var.Q = true;
    }

    @Override // g8.a
    public final void t() {
        this.f64446j.a();
    }

    @Override // g8.a
    public final synchronized void w(a7.i0 i0Var) {
        this.f64457u = i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a8.a0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [g8.a, g8.v0] */
    public final void x() {
        f1 f1Var = new f1(this.f64453q, this.f64454r, this.f64455s, j());
        if (this.f64452p) {
            f1Var = new a8.a0(this, f1Var, 1);
        }
        o(f1Var);
    }

    public final void y(long j13, q8.e0 e0Var, boolean z13) {
        if (j13 == -9223372036854775807L) {
            j13 = this.f64453q;
        }
        boolean h10 = e0Var.h();
        if (!this.f64452p && this.f64453q == j13 && this.f64454r == h10 && this.f64455s == z13) {
            return;
        }
        this.f64453q = j13;
        this.f64454r = h10;
        this.f64455s = z13;
        this.f64452p = false;
        x();
    }
}
