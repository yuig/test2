package m1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o extends u2.p implements t1.f, s3.a0, s3.l {

    /* renamed from: n, reason: collision with root package name */
    public f1 f85478n;

    /* renamed from: o, reason: collision with root package name */
    public final o2 f85479o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f85480p;

    /* renamed from: q, reason: collision with root package name */
    public e f85481q;

    /* renamed from: s, reason: collision with root package name */
    public q3.x f85483s;

    /* renamed from: t, reason: collision with root package name */
    public a3.d f85484t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f85485u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f85487w;

    /* renamed from: r, reason: collision with root package name */
    public final b f85482r = new b();

    /* renamed from: v, reason: collision with root package name */
    public long f85486v = 0;

    public o(f1 f1Var, o2 o2Var, boolean z13, e eVar) {
        this.f85478n = f1Var;
        this.f85479o = o2Var;
        this.f85480p = z13;
        this.f85481q = eVar;
    }

    public static final float M0(o oVar, e eVar) {
        a3.d dVar;
        float a13;
        int compare;
        if (n4.j.a(oVar.f85486v, 0L)) {
            return 0.0f;
        }
        k2.e eVar2 = oVar.f85482r.f85290a;
        int i13 = eVar2.f78184c;
        if (i13 > 0) {
            int i14 = i13 - 1;
            Object[] objArr = eVar2.f78182a;
            dVar = null;
            while (true) {
                a3.d dVar2 = (a3.d) ((i) objArr[i14]).f85370a.invoke();
                if (dVar2 != null) {
                    long c13 = bs1.c.c(dVar2.d(), dVar2.c());
                    long y13 = lb.l0.y1(oVar.f85486v);
                    int i15 = j.f85382a[oVar.f85478n.ordinal()];
                    if (i15 == 1) {
                        compare = Float.compare(a3.f.b(c13), a3.f.b(y13));
                    } else {
                        if (i15 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        compare = Float.compare(a3.f.d(c13), a3.f.d(y13));
                    }
                    if (compare <= 0) {
                        dVar = dVar2;
                    } else if (dVar == null) {
                        dVar = dVar2;
                    }
                }
                i14--;
                if (i14 < 0) {
                    break;
                }
            }
        } else {
            dVar = null;
        }
        if (dVar == null) {
            a3.d N0 = oVar.f85485u ? oVar.N0() : null;
            if (N0 == null) {
                return 0.0f;
            }
            dVar = N0;
        }
        long y14 = lb.l0.y1(oVar.f85486v);
        int i16 = j.f85382a[oVar.f85478n.ordinal()];
        if (i16 == 1) {
            float f13 = dVar.f487d;
            float f14 = dVar.f485b;
            a13 = eVar.a(f14, f13 - f14, a3.f.b(y14));
        } else {
            if (i16 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            float f15 = dVar.f486c;
            float f16 = dVar.f484a;
            a13 = eVar.a(f16, f15 - f16, a3.f.d(y14));
        }
        return a13;
    }

    @Override // u2.p
    public final boolean A0() {
        return false;
    }

    public final a3.d N0() {
        if (!this.f120054m) {
            return null;
        }
        s3.q1 T0 = com.bumptech.glide.c.T0(this);
        q3.x xVar = this.f85483s;
        if (xVar != null) {
            if (!xVar.h()) {
                xVar = null;
            }
            if (xVar != null) {
                return T0.J(xVar, false);
            }
        }
        return null;
    }

    public final boolean O0(long j13, a3.d dVar) {
        long Q0 = Q0(j13, dVar);
        return Math.abs(a3.c.d(Q0)) <= 0.5f && Math.abs(a3.c.e(Q0)) <= 0.5f;
    }

    public final void P0() {
        e eVar = this.f85481q;
        if (eVar == null) {
            eVar = (e) com.bumptech.glide.c.w(this, h.a());
        }
        if (!(!this.f85487w)) {
            throw new IllegalStateException("launchAnimation called when previous animation was running".toString());
        }
        kotlin.jvm.internal.j.z(z0(), null, ao2.l0.UNDISPATCHED, new n(this, new s3(eVar.b()), eVar, null), 1);
    }

    public final long Q0(long j13, a3.d dVar) {
        long y13 = lb.l0.y1(j13);
        int i13 = j.f85382a[this.f85478n.ordinal()];
        if (i13 == 1) {
            e eVar = this.f85481q;
            if (eVar == null) {
                eVar = (e) com.bumptech.glide.c.w(this, h.a());
            }
            float f13 = dVar.f487d;
            float f14 = dVar.f485b;
            return com.bumptech.glide.c.d(0.0f, eVar.a(f14, f13 - f14, a3.f.b(y13)));
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        e eVar2 = this.f85481q;
        if (eVar2 == null) {
            eVar2 = (e) com.bumptech.glide.c.w(this, h.a());
        }
        float f15 = dVar.f486c;
        float f16 = dVar.f484a;
        return com.bumptech.glide.c.d(eVar2.a(f16, f15 - f16, a3.f.d(y13)), 0.0f);
    }

    @Override // s3.a0
    public final void n(long j13) {
        int i13;
        a3.d N0;
        long j14 = this.f85486v;
        this.f85486v = j13;
        int i14 = j.f85382a[this.f85478n.ordinal()];
        if (i14 == 1) {
            i13 = Intrinsics.i((int) (j13 & 4294967295L), (int) (4294967295L & j14));
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = Intrinsics.i((int) (j13 >> 32), (int) (j14 >> 32));
        }
        if (i13 < 0 && (N0 = N0()) != null) {
            a3.d dVar = this.f85484t;
            if (dVar == null) {
                dVar = N0;
            }
            if (!this.f85487w && !this.f85485u && O0(j14, dVar) && !O0(j13, N0)) {
                this.f85485u = true;
                P0();
            }
            this.f85484t = N0;
        }
    }
}
