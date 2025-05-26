package ads_mobile_sdk;

import a.n7;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class e10 implements n7 {
    public jk2 A;
    public kk2 B;
    public lk2 C;
    public mk2 D;
    public nk2 E;
    public uk2 F;
    public nj2 G;
    public tk2 H;
    public pj2 I;

    /* renamed from: J, reason: collision with root package name */
    public ok2 f4544J;
    public pk2 K;
    public rk2 L;
    public vj2 M;
    public qk2 N;
    public sk2 O;
    public vk2 P;
    public wk2 Q;
    public rj2 R;
    public gk2 S;
    public ik2 T;
    public wj2 U;
    public ek2 V;
    public ck2 W;
    public qf2 X;
    public m01 Y;
    public o01 Z;

    /* renamed from: a, reason: collision with root package name */
    public final n20 f4545a;

    /* renamed from: a0, reason: collision with root package name */
    public wl2 f4546a0;

    /* renamed from: b, reason: collision with root package name */
    public a.o8 f4547b;

    /* renamed from: b0, reason: collision with root package name */
    public a.o8 f4548b0;

    /* renamed from: c, reason: collision with root package name */
    public a.o8 f4549c;

    /* renamed from: d, reason: collision with root package name */
    public xv0 f4550d;

    /* renamed from: e, reason: collision with root package name */
    public a.o8 f4551e;

    /* renamed from: f, reason: collision with root package name */
    public bi2 f4552f;

    /* renamed from: g, reason: collision with root package name */
    public ai2 f4553g;

    /* renamed from: h, reason: collision with root package name */
    public oj2 f4554h;

    /* renamed from: i, reason: collision with root package name */
    public xv0 f4555i;

    /* renamed from: j, reason: collision with root package name */
    public e40 f4556j;

    /* renamed from: k, reason: collision with root package name */
    public wh2 f4557k;

    /* renamed from: l, reason: collision with root package name */
    public qj2 f4558l;

    /* renamed from: m, reason: collision with root package name */
    public tj2 f4559m;

    /* renamed from: n, reason: collision with root package name */
    public sj2 f4560n;

    /* renamed from: o, reason: collision with root package name */
    public s01 f4561o;

    /* renamed from: p, reason: collision with root package name */
    public l5 f4562p;

    /* renamed from: q, reason: collision with root package name */
    public uj2 f4563q;

    /* renamed from: r, reason: collision with root package name */
    public xj2 f4564r;

    /* renamed from: s, reason: collision with root package name */
    public mj2 f4565s;

    /* renamed from: t, reason: collision with root package name */
    public yj2 f4566t;

    /* renamed from: u, reason: collision with root package name */
    public zj2 f4567u;

    /* renamed from: v, reason: collision with root package name */
    public ak2 f4568v;

    /* renamed from: w, reason: collision with root package name */
    public bk2 f4569w;

    /* renamed from: x, reason: collision with root package name */
    public dk2 f4570x;

    /* renamed from: y, reason: collision with root package name */
    public fk2 f4571y;

    /* renamed from: z, reason: collision with root package name */
    public hk2 f4572z;

    public e10(n20 n20Var, dj.e eVar, wi.k kVar, Boolean bool, vi.d dVar) {
        this.f4545a = n20Var;
        a(eVar, kVar, bool, dVar);
        b();
        c();
        d();
    }

    public final void a(dj.e eVar, wi.k kVar, Boolean bool, vi.d dVar) {
        a.o8 q01Var = new q01(this.f4545a.f8516c0);
        Object obj = u90.f11887c;
        if (!(q01Var instanceof u90)) {
            q01Var = new u90(q01Var);
        }
        this.f4547b = q01Var;
        a.o8 t01Var = new t01(this.f4545a.f8584t1);
        if (!(t01Var instanceof u90)) {
            t01Var = new u90(t01Var);
        }
        this.f4549c = t01Var;
        this.f4550d = xv0.a(eVar);
        xv0 xv0Var = a.p8.f142a;
        a.o8 u01Var = new u01(xv0Var, xv0Var);
        if (!(u01Var instanceof u90)) {
            u01Var = new u90(u01Var);
        }
        this.f4551e = u01Var;
        n20 n20Var = this.f4545a;
        a.o8 o8Var = n20Var.f8550l;
        a.o8 o8Var2 = n20Var.M0;
        xv0 xv0Var2 = this.f4550d;
        this.f4552f = new bi2(new zh2(o8Var, o8Var2, xv0Var2));
        this.f4553g = new ai2(new rd2(xv0Var2));
        this.f4554h = new oj2(n20Var.f8592v1);
        this.f4555i = xv0.a(kVar);
        this.f4556j = new e40(xv0.a(dVar));
        this.f4557k = new wh2(this.f4550d);
        xv0 a13 = xv0.a(bool);
        n20 n20Var2 = this.f4545a;
        a.o8 k3Var = new k3(n20Var2.f8530g, this.f4555i, this.f4556j, n20Var2.f8591v0, n20Var2.f8519d, this.f4557k, a13);
        if (!(k3Var instanceof u90)) {
            k3Var = new u90(k3Var);
        }
        this.f4558l = new qj2(k3Var);
        n20 n20Var3 = this.f4545a;
        this.f4559m = new tj2(new c5(n20Var3.H));
        e40 e40Var = this.f4556j;
        wh2 wh2Var = this.f4557k;
        this.f4560n = new sj2(new u4(e40Var, wh2Var, n20Var3.f8519d, n20Var3.f8550l));
        this.f4561o = new s01(wh2Var);
        int i13 = qf2.f10067c;
        List f13 = a.l9.f(1);
        List f14 = a.l9.f(0);
        s01 s01Var = this.f4561o;
        boolean z13 = pf2.f9667c;
        if (!z13 && s01Var == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        f13.add(s01Var);
        if (!z13 && a.l9.d(f13)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        if (!z13 && a.l9.d(f14)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        this.f4562p = new l5(new qf2(f13, f14));
    }

    public final void b() {
        this.f4563q = new uj2(this.f4562p);
        n20 n20Var = this.f4545a;
        this.f4564r = new xj2(n20Var.f8596w1);
        this.f4565s = new mj2(n20Var.S0);
        this.f4566t = new yj2(n20Var.f8600x1);
        this.f4567u = new zj2(n20Var.f8604y1);
        this.f4568v = new ak2(n20Var.f8608z1);
        this.f4569w = new bk2(new gn(this.f4557k, n20Var.f8583t0, this.f4555i, n20Var.L0));
        this.f4570x = new dk2(n20Var.A1);
        this.f4571y = new fk2(am2.a(new hc0(n20Var.f8550l)));
        n20 n20Var2 = this.f4545a;
        this.f4572z = new hk2(n20Var2.B1);
        this.A = new jk2(new ta1(n20Var2.Q));
        this.B = new kk2(n20Var2.C1);
        this.C = new lk2(n20Var2.T0);
        this.D = new mk2(n20Var2.D1);
        this.E = new nk2(n20Var2.E1);
        this.F = new uk2(n20Var2.V0);
        this.G = new nj2(am2.a(new go2(n20Var2.O0)));
        n20 n20Var3 = this.f4545a;
        this.H = new tk2(n20Var3.F1);
        this.I = new pj2(n20Var3.R0);
        a.o8 z52Var = new z52(n20Var3.f8584t1, n20Var3.G1, this.f4555i, n20Var3.Q);
        Object obj = u90.f11887c;
        if (!(z52Var instanceof u90)) {
            z52Var = new u90(z52Var);
        }
        this.f4544J = new ok2(z52Var);
    }

    public final void c() {
        a.o8 u82Var = new u82(this.f4547b);
        Object obj = u90.f11887c;
        if (!(u82Var instanceof u90)) {
            u82Var = new u90(u82Var);
        }
        this.K = new pk2(u82Var);
        n20 n20Var = this.f4545a;
        this.L = new rk2(n20Var.U0);
        this.M = new vj2(n20Var.H1);
        e40 e40Var = new e40(this.f4550d);
        n20 n20Var2 = this.f4545a;
        a.o8 o8Var = n20Var2.f8550l;
        xv0 xv0Var = n20Var2.f8519d;
        this.N = new qk2(new yc2(o8Var, this.f4556j, e40Var, new qc2(o8Var, xv0Var, n20Var2.f8530g, n20Var2.f8583t0, n20Var2.J0, n20Var2.f8566p, n20Var2.f8554m, n20Var2.C), this.f4557k, this.f4555i));
        this.O = new sk2(n20Var2.I1);
        this.P = new vk2(n20Var2.J1, o8Var);
        this.Q = new wk2(new fu2(o8Var, n20Var2.S, e40Var), o8Var);
        this.R = new rj2(n20Var2.K1, o8Var);
        this.S = new gk2(n20Var2.L1);
        this.T = new ik2(new uv0(n20Var2.C0));
        this.U = new wj2(n20Var2.M1);
        this.V = new ek2(new p90(xv0Var));
        this.W = new ck2(n20Var2.N1);
        int i13 = qf2.f10067c;
        this.X = new pf2(39).a(this.f4552f).a(this.f4553g).a(this.f4554h).a(this.f4558l).a(this.f4559m).a(this.f4560n).a(this.f4563q).a(this.f4564r).a(this.f4565s).a(this.f4566t).a(this.f4567u).a(this.f4568v).a(this.f4569w).a(this.f4570x).a(this.f4571y).a(this.f4572z).a(this.A).a(this.B).a(this.C).a(this.D).a(this.E).a(this.F).a(this.G).a(this.H).a(this.I).a(this.f4544J).a(this.K).a(this.L).a(this.M).a(this.N).a(this.O).a(this.P).a(this.Q).a(this.R).a(this.S).a(this.T).a(this.U).a(this.V).a(this.W).a();
        n20 n20Var3 = this.f4545a;
        a.o8 jn2Var = new jn2(n20Var3.G1, n20Var3.f8584t1, this.f4547b, new r01(n20Var3.f8530g));
        if (!(jn2Var instanceof u90)) {
            jn2Var = new u90(jn2Var);
        }
        this.Y = new m01(jn2Var);
        this.Z = new o01(this.f4545a.X0);
    }

    public final void d() {
        xv0 xv0Var = v81.f12395b;
        LinkedHashMap c13 = a.l9.c(3);
        lf lfVar = this.f4545a.O1;
        if (lfVar == null) {
            throw new NullPointerException("provider");
        }
        c13.put("configLoaderRefreshSignalRequestedListener", lfVar);
        m01 m01Var = this.Y;
        if (m01Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("adUnitStatsTrackerSignalsRequestedListener", m01Var);
        o01 o01Var = this.Z;
        if (o01Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("customTabsConnectionInitializationTask", o01Var);
        a.o8 fx0Var = new fx0(this.f4545a.f8566p, new v81(c13));
        Object obj = u90.f11887c;
        a.o8 u90Var = fx0Var instanceof u90 ? fx0Var : new u90(fx0Var);
        qf2 qf2Var = this.X;
        n20 n20Var = this.f4545a;
        a.o8 o8Var = n20Var.f8574r;
        a.o8 o8Var2 = n20Var.f8566p;
        a.o8 o8Var3 = n20Var.f8550l;
        this.f4546a0 = new wl2(qf2Var, o8Var, o8Var2, o8Var3, this.f4555i, u90Var);
        a.o8 o82Var = new o82(o8Var3, n20Var.Q, n20Var.f8554m, n20Var.P1, a.p8.f142a, n20Var.f8516c0, n20Var.V);
        a.o8 u90Var2 = o82Var instanceof u90 ? o82Var : new u90(o82Var);
        n20 n20Var2 = this.f4545a;
        a.o8 wi2Var = new wi2(n20Var2.f8556m1, n20Var2.f8562o, this.f4547b, this.f4549c, this.f4550d, n20Var2.C, this.f4551e, n20Var2.f8588u1, this.f4546a0, n20Var2.V, n20Var2.f8516c0, n20Var2.f8550l, u90Var2, n20Var2.f8554m);
        if (!(wi2Var instanceof u90)) {
            wi2Var = new u90(wi2Var);
        }
        this.f4548b0 = wi2Var;
    }

    @Override // a.n7
    public final vi2 a() {
        return (vi2) this.f4548b0.get();
    }
}
