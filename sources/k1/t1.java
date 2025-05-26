package k1;

import android.view.View;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class t1 extends u2.p implements s3.s, s3.r, s3.g2, s3.u1 {
    public i2.o0 B;
    public n4.j D;
    public co2.m E;

    /* renamed from: n, reason: collision with root package name */
    public Function1 f78013n;

    /* renamed from: o, reason: collision with root package name */
    public Function1 f78014o;

    /* renamed from: p, reason: collision with root package name */
    public Function1 f78015p;

    /* renamed from: q, reason: collision with root package name */
    public float f78016q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f78017r;

    /* renamed from: s, reason: collision with root package name */
    public long f78018s;

    /* renamed from: t, reason: collision with root package name */
    public float f78019t;

    /* renamed from: u, reason: collision with root package name */
    public float f78020u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f78021v;

    /* renamed from: w, reason: collision with root package name */
    public g2 f78022w;

    /* renamed from: x, reason: collision with root package name */
    public View f78023x;

    /* renamed from: y, reason: collision with root package name */
    public n4.b f78024y;

    /* renamed from: z, reason: collision with root package name */
    public f2 f78025z;
    public final ParcelableSnapshotMutableState A = bs1.c.u1(null, i2.r1.f71258a);
    public long C = y2.h.f136670b;

    public t1(Function1 function1, Function1 function12, Function1 function13, float f13, boolean z13, long j13, float f14, float f15, boolean z14, g2 g2Var) {
        this.f78013n = function1;
        this.f78014o = function12;
        this.f78015p = function13;
        this.f78016q = f13;
        this.f78017r = z13;
        this.f78018s = j13;
        this.f78019t = f14;
        this.f78020u = f15;
        this.f78021v = z14;
        this.f78022w = g2Var;
    }

    @Override // u2.p
    public final void D0() {
        P();
        this.E = lb.l0.b(0, null, 7);
        kotlin.jvm.internal.j.z(z0(), null, null, new s1(this, null), 3);
    }

    @Override // s3.s
    public final void E(s3.q1 q1Var) {
        this.A.setValue(q1Var);
    }

    @Override // u2.p
    public final void E0() {
        f2 f2Var = this.f78025z;
        if (f2Var != null) {
            ((h2) f2Var).b();
        }
        this.f78025z = null;
    }

    public final long M0() {
        if (this.B == null) {
            this.B = bs1.c.S(new r1(this, 0));
        }
        i2.o0 o0Var = this.B;
        return o0Var != null ? ((a3.c) o0Var.getValue()).f482a : y2.h.f136670b;
    }

    public final void N0() {
        f2 f2Var = this.f78025z;
        if (f2Var != null) {
            ((h2) f2Var).b();
        }
        View view = this.f78023x;
        if (view == null) {
            view = bp1.h.G(this);
        }
        View view2 = view;
        this.f78023x = view2;
        n4.b bVar = this.f78024y;
        if (bVar == null) {
            bVar = com.bumptech.glide.c.U0(this).f110830r;
        }
        n4.b bVar2 = bVar;
        this.f78024y = bVar2;
        this.f78025z = this.f78022w.a(view2, this.f78017r, this.f78018s, this.f78019t, this.f78020u, this.f78021v, bVar2, this.f78016q);
        P0();
    }

    public final void O0() {
        n4.b bVar = this.f78024y;
        if (bVar == null) {
            bVar = com.bumptech.glide.c.U0(this).f110830r;
            this.f78024y = bVar;
        }
        long j13 = ((a3.c) this.f78013n.invoke(bVar)).f482a;
        boolean y03 = com.bumptech.glide.c.y0(j13);
        long j14 = y2.h.f136670b;
        if (!y03 || !com.bumptech.glide.c.y0(M0())) {
            this.C = y2.h.f136670b;
            f2 f2Var = this.f78025z;
            if (f2Var != null) {
                ((h2) f2Var).b();
                return;
            }
            return;
        }
        this.C = a3.c.h(M0(), j13);
        Function1 function1 = this.f78014o;
        if (function1 != null) {
            long j15 = ((a3.c) function1.invoke(bVar)).f482a;
            a3.c cVar = new a3.c(j15);
            if (!com.bumptech.glide.c.y0(j15)) {
                cVar = null;
            }
            if (cVar != null) {
                j14 = a3.c.h(M0(), cVar.f482a);
            }
        }
        long j16 = j14;
        if (this.f78025z == null) {
            N0();
        }
        f2 f2Var2 = this.f78025z;
        if (f2Var2 != null) {
            f2Var2.a(this.C, j16, this.f78016q);
        }
        P0();
    }

    @Override // s3.u1
    public final void P() {
        com.bumptech.glide.c.L0(this, new r1(this, 2));
    }

    public final void P0() {
        n4.b bVar;
        f2 f2Var = this.f78025z;
        if (f2Var == null || (bVar = this.f78024y) == null) {
            return;
        }
        h2 h2Var = (h2) f2Var;
        long c13 = h2Var.c();
        n4.j jVar = this.D;
        if ((jVar instanceof n4.j) && c13 == jVar.f89186a) {
            return;
        }
        Function1 function1 = this.f78015p;
        if (function1 != null) {
            function1.invoke(new n4.g(bVar.p(lb.l0.y1(h2Var.c()))));
        }
        this.D = new n4.j(h2Var.c());
    }

    @Override // s3.r
    public final void f(d3.e eVar) {
        ((s3.m0) eVar).a();
        co2.m mVar = this.E;
        if (mVar != null) {
            mVar.g(Unit.f80348a);
        }
    }

    @Override // s3.g2
    public final void m0(z3.j jVar) {
        jVar.e(u1.f78043a, new r1(this, 1));
    }
}
