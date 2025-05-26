package w1;

/* loaded from: classes2.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public final b4.m0 f127471a;

    /* renamed from: b, reason: collision with root package name */
    public q3.x f127472b = null;

    /* renamed from: c, reason: collision with root package name */
    public q3.x f127473c;

    public r2(b4.m0 m0Var, q3.x xVar) {
        this.f127471a = m0Var;
        this.f127473c = xVar;
    }

    public final long a(long j13) {
        a3.d dVar;
        q3.x xVar = this.f127472b;
        a3.d dVar2 = a3.d.f483e;
        if (xVar != null) {
            if (xVar.h()) {
                q3.x xVar2 = this.f127473c;
                dVar = xVar2 != null ? xVar2.J(xVar, true) : null;
            } else {
                dVar = dVar2;
            }
            if (dVar != null) {
                dVar2 = dVar;
            }
        }
        float d2 = a3.c.d(j13);
        float f13 = dVar2.f484a;
        if (d2 >= f13) {
            float d13 = a3.c.d(j13);
            f13 = dVar2.f486c;
            if (d13 <= f13) {
                f13 = a3.c.d(j13);
            }
        }
        float e13 = a3.c.e(j13);
        float f14 = dVar2.f485b;
        if (e13 >= f14) {
            float e14 = a3.c.e(j13);
            f14 = dVar2.f487d;
            if (e14 <= f14) {
                f14 = a3.c.e(j13);
            }
        }
        return com.bumptech.glide.c.d(f13, f14);
    }

    public final int b(long j13, boolean z13) {
        if (z13) {
            j13 = a(j13);
        }
        return this.f127471a.f21616b.e(d(j13));
    }

    public final boolean c(long j13) {
        long d2 = d(a(j13));
        float e13 = a3.c.e(d2);
        b4.m0 m0Var = this.f127471a;
        int c13 = m0Var.f21616b.c(e13);
        return a3.c.d(d2) >= m0Var.g(c13) && a3.c.d(d2) <= m0Var.h(c13);
    }

    public final long d(long j13) {
        q3.x xVar;
        q3.x xVar2 = this.f127472b;
        if (xVar2 == null) {
            return j13;
        }
        if (!xVar2.h()) {
            xVar2 = null;
        }
        if (xVar2 == null || (xVar = this.f127473c) == null) {
            return j13;
        }
        q3.x xVar3 = xVar.h() ? xVar : null;
        return xVar3 == null ? j13 : xVar2.e(xVar3, j13);
    }

    public final long e(long j13) {
        q3.x xVar;
        q3.x xVar2 = this.f127472b;
        if (xVar2 == null) {
            return j13;
        }
        if (!xVar2.h()) {
            xVar2 = null;
        }
        if (xVar2 == null || (xVar = this.f127473c) == null) {
            return j13;
        }
        q3.x xVar3 = xVar.h() ? xVar : null;
        return xVar3 == null ? j13 : xVar3.e(xVar2, j13);
    }
}
