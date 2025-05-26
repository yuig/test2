package k1;

/* loaded from: classes2.dex */
public final class x0 extends u2.p implements s3.j2, s3.s {

    /* renamed from: p, reason: collision with root package name */
    public static final d0.o f78080p = new d0.o(14, 0);

    /* renamed from: n, reason: collision with root package name */
    public boolean f78081n;

    /* renamed from: o, reason: collision with root package name */
    public q3.x f78082o;

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    @Override // s3.s
    public final void E(s3.q1 q1Var) {
        z0 M0;
        this.f78082o = q1Var;
        if (this.f78081n) {
            if (!q1Var.X0().f120054m) {
                z0 M02 = M0();
                if (M02 != null) {
                    M02.M0(null);
                    return;
                }
                return;
            }
            q3.x xVar = this.f78082o;
            if (xVar == null || !xVar.h() || (M0 = M0()) == null) {
                return;
            }
            M0.M0(this.f78082o);
        }
    }

    public final z0 M0() {
        if (!this.f120054m) {
            return null;
        }
        s3.j2 f03 = kh2.b0.f0(this, z0.f78106o);
        if (f03 instanceof z0) {
            return (z0) f03;
        }
        return null;
    }

    @Override // s3.j2
    public final Object l() {
        return f78080p;
    }
}
