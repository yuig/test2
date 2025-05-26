package n60;

import java.util.concurrent.atomic.AtomicBoolean;
import jk2.a0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.q0;
import lh0.z3;
import x02.a2;
import x02.r1;

/* loaded from: classes.dex */
public final class s {
    public final xk2.v A;
    public final xk2.v B;
    public final xk2.v C;

    /* renamed from: a, reason: collision with root package name */
    public final at1.d f89281a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f89282b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f89283c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f89284d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f89285e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f89286f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f89287g;

    /* renamed from: h, reason: collision with root package name */
    public final xk2.v f89288h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f89289i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f89290j;

    /* renamed from: k, reason: collision with root package name */
    public final xk2.v f89291k;

    /* renamed from: l, reason: collision with root package name */
    public final xk2.v f89292l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f89293m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f89294n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f89295o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f89296p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f89297q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.v f89298r;

    /* renamed from: s, reason: collision with root package name */
    public final xk2.v f89299s;

    /* renamed from: t, reason: collision with root package name */
    public final xk2.v f89300t;

    /* renamed from: u, reason: collision with root package name */
    public final xk2.v f89301u;

    /* renamed from: v, reason: collision with root package name */
    public final xk2.v f89302v;

    /* renamed from: w, reason: collision with root package name */
    public final xk2.v f89303w;

    /* renamed from: x, reason: collision with root package name */
    public final xk2.v f89304x;

    /* renamed from: y, reason: collision with root package name */
    public final xk2.v f89305y;

    /* renamed from: z, reason: collision with root package name */
    public final xk2.v f89306z;

    public s(m60.m application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f89281a = application;
        this.f89282b = o.p(this, 14);
        this.f89283c = o.p(this, 22);
        this.f89284d = o.p(this, 15);
        this.f89285e = o.p(this, 5);
        this.f89286f = o.p(this, 3);
        xk2.m.b(new q(this, 10));
        this.f89287g = xk2.m.b(new q(this, 11));
        this.f89288h = o.p(this, 12);
        this.f89289i = o.p(this, 7);
        this.f89290j = o.p(this, 8);
        this.f89291k = o.p(this, 9);
        this.f89292l = o.p(this, 17);
        this.f89293m = o.p(this, 6);
        this.f89294n = o.p(this, 23);
        this.f89295o = o.p(this, 25);
        this.f89296p = o.p(this, 4);
        this.f89297q = o.p(this, 19);
        this.f89298r = o.p(this, 18);
        this.f89299s = o.p(this, 24);
        this.f89300t = o.p(this, 20);
        this.f89301u = o.p(this, 29);
        this.f89302v = o.p(this, 21);
        this.f89303w = o.p(this, 27);
        this.f89304x = o.p(this, 28);
        this.f89305y = o.p(this, 1);
        this.f89306z = o.p(this, 0);
        this.A = o.p(this, 16);
        o.p(this, 26);
        this.B = o.p(this, 13);
        this.C = o.p(this, 2);
    }

    public final q0 a() {
        return (q0) this.f89293m.getValue();
    }

    public final se2.a b() {
        return (se2.a) this.f89289i.getValue();
    }

    public final se2.a c() {
        return (se2.a) this.f89290j.getValue();
    }

    public final se2.a d() {
        return (se2.a) this.f89288h.getValue();
    }

    public final se2.a e() {
        return (se2.a) this.B.getValue();
    }

    public final p f() {
        return (p) this.f89282b.getValue();
    }

    public final se2.a g() {
        return (se2.a) this.f89284d.getValue();
    }

    public final n1 h() {
        return (n1) this.f89292l.getValue();
    }

    public final wk2.a i() {
        return (wk2.a) this.f89298r.getValue();
    }

    public final se2.a j() {
        return (se2.a) this.f89299s.getValue();
    }

    public final void k(com.pinterest.feature.home.model.f fVar) {
        n1 h10 = h();
        h10.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) h10.f83439a;
        int i13 = 1;
        int i14 = 0;
        boolean z13 = g1Var.o("hfp_engaged_topic_tabs_local_nav_android", "enabled", z3Var) || g1Var.l("hfp_engaged_topic_tabs_local_nav_android");
        AtomicBoolean atomicBoolean = fVar.f45791w;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        com.pinterest.feature.home.model.g gVar = new com.pinterest.feature.home.model.g(r1.REQUEST_TYPE_ONLY_REMOTE, true, null, z13, 24);
        uj2.q n13 = fVar.n(gVar);
        ug0.d dVar = new ug0.d(25, new com.pinterest.feature.home.model.e(fVar, gVar, i14));
        a2 a2Var = ck2.i.f27924d;
        ck2.c cVar = ck2.i.f27923c;
        a0 q13 = new jk2.v(new a0(new a0(n13, dVar, a2Var, cVar), a2Var, a2Var, new com.pinterest.feature.home.model.d(fVar, gVar, i14)), a2Var, new com.pinterest.feature.home.model.d(fVar, gVar, i13), i13).q(new ug0.d(26, new com.pinterest.feature.home.model.e(fVar, gVar, i13)));
        uj2.a0 a0Var = tk2.e.f118017c;
        q13.H(a0Var).A(wj2.c.a()).F(a2Var, a2Var, cVar, a2Var);
        com.pinterest.feature.home.model.g gVar2 = new com.pinterest.feature.home.model.g(r1.REQUEST_TYPE_DEFAULT, true, null, false, 56);
        int i15 = 2;
        int i16 = 3;
        new jk2.v(new a0(new a0(fVar.p(gVar2, true), new ug0.d(27, new com.pinterest.feature.home.model.e(fVar, gVar2, i15)), a2Var, cVar), a2Var, a2Var, new com.pinterest.feature.home.model.d(fVar, gVar2, i15)), a2Var, new com.pinterest.feature.home.model.d(fVar, gVar2, i16), i13).q(new ug0.d(28, new com.pinterest.feature.home.model.e(fVar, gVar2, i16))).H(a0Var).F(a2Var, a2Var, cVar, a2Var);
        fVar.f45790v = false;
        fVar.f45789u = true;
    }
}
