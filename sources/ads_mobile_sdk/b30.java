package ads_mobile_sdk;

import a.j4;
import a.z1;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class b30 {
    public kk2 A;
    public lk2 B;
    public mk2 C;
    public nk2 D;
    public uk2 E;
    public nj2 F;
    public tk2 G;
    public pj2 H;
    public ok2 I;

    /* renamed from: J, reason: collision with root package name */
    public pk2 f2645J;
    public rk2 K;
    public vj2 L;
    public qk2 M;
    public sk2 N;
    public vk2 O;
    public wk2 P;
    public rj2 Q;
    public gk2 R;
    public ik2 S;
    public wj2 T;
    public ek2 U;
    public ck2 V;
    public qf2 W;
    public xv0 X;
    public i01 Y;
    public r01 Z;

    /* renamed from: a, reason: collision with root package name */
    public final n20 f2646a;

    /* renamed from: a0, reason: collision with root package name */
    public m01 f2647a0;

    /* renamed from: b, reason: collision with root package name */
    public a.o8 f2648b;

    /* renamed from: b0, reason: collision with root package name */
    public o01 f2649b0;

    /* renamed from: c, reason: collision with root package name */
    public a.o8 f2650c;

    /* renamed from: c0, reason: collision with root package name */
    public xv0 f2651c0;

    /* renamed from: d, reason: collision with root package name */
    public a.o8 f2652d;

    /* renamed from: d0, reason: collision with root package name */
    public a.o8 f2653d0;

    /* renamed from: e, reason: collision with root package name */
    public a.o8 f2654e;

    /* renamed from: e0, reason: collision with root package name */
    public wl2 f2655e0;

    /* renamed from: f, reason: collision with root package name */
    public xx0 f2656f;

    /* renamed from: f0, reason: collision with root package name */
    public uf2 f2657f0;

    /* renamed from: g, reason: collision with root package name */
    public oj2 f2658g;

    /* renamed from: g0, reason: collision with root package name */
    public a.o8 f2659g0;

    /* renamed from: h, reason: collision with root package name */
    public xv0 f2660h;

    /* renamed from: h0, reason: collision with root package name */
    public a.o8 f2661h0;

    /* renamed from: i, reason: collision with root package name */
    public xv0 f2662i;

    /* renamed from: i0, reason: collision with root package name */
    public z92 f2663i0;

    /* renamed from: j, reason: collision with root package name */
    public e40 f2664j;

    /* renamed from: j0, reason: collision with root package name */
    public h01 f2665j0;

    /* renamed from: k, reason: collision with root package name */
    public xv0 f2666k;

    /* renamed from: k0, reason: collision with root package name */
    public l01 f2667k0;

    /* renamed from: l, reason: collision with root package name */
    public qj2 f2668l;

    /* renamed from: l0, reason: collision with root package name */
    public p01 f2669l0;

    /* renamed from: m, reason: collision with root package name */
    public tj2 f2670m;

    /* renamed from: m0, reason: collision with root package name */
    public n01 f2671m0;

    /* renamed from: n, reason: collision with root package name */
    public sj2 f2672n;

    /* renamed from: n0, reason: collision with root package name */
    public a.o8 f2673n0;

    /* renamed from: o, reason: collision with root package name */
    public s01 f2674o;

    /* renamed from: o0, reason: collision with root package name */
    public a.o8 f2675o0;

    /* renamed from: p, reason: collision with root package name */
    public uj2 f2676p;

    /* renamed from: p0, reason: collision with root package name */
    public e40 f2677p0;

    /* renamed from: q, reason: collision with root package name */
    public xj2 f2678q;

    /* renamed from: q0, reason: collision with root package name */
    public a.o8 f2679q0;

    /* renamed from: r, reason: collision with root package name */
    public mj2 f2680r;

    /* renamed from: r0, reason: collision with root package name */
    public a.o8 f2681r0;

    /* renamed from: s, reason: collision with root package name */
    public yj2 f2682s;

    /* renamed from: s0, reason: collision with root package name */
    public a.o8 f2683s0;

    /* renamed from: t, reason: collision with root package name */
    public zj2 f2684t;

    /* renamed from: u, reason: collision with root package name */
    public ak2 f2685u;

    /* renamed from: v, reason: collision with root package name */
    public bk2 f2686v;

    /* renamed from: w, reason: collision with root package name */
    public dk2 f2687w;

    /* renamed from: x, reason: collision with root package name */
    public fk2 f2688x;

    /* renamed from: y, reason: collision with root package name */
    public hk2 f2689y;

    /* renamed from: z, reason: collision with root package name */
    public jk2 f2690z;

    public b30(n20 n20Var, h92 h92Var, wi.k kVar, o52 o52Var, v01 v01Var, ws0 ws0Var, Boolean bool, j4 j4Var, z1 z1Var, Boolean bool2, vi.d dVar) {
        this.f2646a = n20Var;
        a(h92Var, kVar, bool, bool2, dVar);
        a();
        a(ws0Var, j4Var);
        a(o52Var, v01Var, z1Var);
        b();
    }

    public final void a(o52 o52Var, v01 v01Var, z1 z1Var) {
        xv0 xv0Var = v81.f12395b;
        LinkedHashMap c13 = a.l9.c(5);
        lf lfVar = this.f2646a.O1;
        if (lfVar == null) {
            throw new NullPointerException("provider");
        }
        c13.put("configLoaderRefreshSignalRequestedListener", lfVar);
        i01 i01Var = this.Y;
        if (i01Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("InspectorAdLifecycleMonitorRequestListener", i01Var);
        m01 m01Var = this.f2647a0;
        if (m01Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("adUnitStatsTrackerSignalsRequestedListener", m01Var);
        o01 o01Var = this.f2649b0;
        if (o01Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("customTabsConnectionInitializationTask", o01Var);
        xv0 xv0Var2 = this.f2651c0;
        if (xv0Var2 == null) {
            throw new NullPointerException("provider");
        }
        c13.put("BannerRefreshHelper", xv0Var2);
        a.o8 fx0Var = new fx0(this.f2646a.f8566p, new v81(c13));
        Object obj = u90.f11887c;
        a.o8 u90Var = fx0Var instanceof u90 ? fx0Var : new u90(fx0Var);
        this.f2653d0 = u90Var;
        qf2 qf2Var = this.W;
        n20 n20Var = this.f2646a;
        this.f2655e0 = new wl2(qf2Var, n20Var.f8574r, n20Var.f8566p, n20Var.f8550l, this.f2660h, u90Var);
        this.f2657f0 = new uf2(n20Var.S);
        LinkedHashMap c14 = a.l9.c(5);
        uf2 uf2Var = this.f2657f0;
        if (uf2Var == null) {
            throw new NullPointerException("provider");
        }
        c14.put("setCookie", uf2Var);
        a.o8 o8Var = this.f2646a.X1;
        if (o8Var == null) {
            throw new NullPointerException("provider");
        }
        c14.put("invokeGetTopicsApiWithRecordObservation", o8Var);
        a.o8 o8Var2 = this.f2646a.Y1;
        if (o8Var2 == null) {
            throw new NullPointerException("provider");
        }
        c14.put("setInspectorGesture", o8Var2);
        a.o8 o8Var3 = this.f2646a.Z1;
        if (o8Var3 == null) {
            throw new NullPointerException("provider");
        }
        c14.put("setInspectorServerData", o8Var3);
        a.o8 o8Var4 = this.f2646a.f8510a2;
        if (o8Var4 == null) {
            throw new NullPointerException("provider");
        }
        a.o8 mVar = new m(a.c.f(c14, "setTestMode", o8Var4, c14));
        if (!(mVar instanceof u90)) {
            mVar = new u90(mVar);
        }
        this.f2659g0 = mVar;
        xv0 xv0Var3 = a.p8.f142a;
        n20 n20Var2 = this.f2646a;
        a.o8 o82Var = new o82(n20Var2.f8550l, n20Var2.Q, n20Var2.f8554m, n20Var2.P1, xv0Var3, n20Var2.f8516c0, n20Var2.V);
        a.o8 u90Var2 = o82Var instanceof u90 ? o82Var : new u90(o82Var);
        n20 n20Var3 = this.f2646a;
        a.o8 ro1Var = new ro1(n20Var3.V, this.f2654e, this.f2655e0, this.f2660h, this.f2653d0, this.f2659g0, u90Var2, n20Var3.f8514b2, n20Var3.f8550l, n20Var3.f8516c0, n20Var3.f8554m);
        if (!(ro1Var instanceof u90)) {
            ro1Var = new u90(ro1Var);
        }
        this.f2661h0 = ro1Var;
        n20 n20Var4 = this.f2646a;
        a.o8 o8Var5 = n20Var4.f8550l;
        a.o8 o8Var6 = n20Var4.f8548k1;
        a.o8 o8Var7 = n20Var4.f8530g;
        this.f2663i0 = new z92(o8Var5, o8Var6, o8Var7, n20Var4.f8566p, n20Var4.f8590v, n20Var4.f8559n0);
        this.f2665j0 = new h01(this.X);
        a.o8 w5Var = new w5(this.f2648b, this.f2660h, n20Var4.G1, o8Var7);
        if (!(w5Var instanceof u90)) {
            w5Var = new u90(w5Var);
        }
        this.f2667k0 = new l01(w5Var);
        n20 n20Var5 = this.f2646a;
        this.f2669l0 = new p01(n20Var5.d2);
        this.f2671m0 = new n01(n20Var5.X0);
        LinkedHashMap c15 = a.l9.c(4);
        h01 h01Var = this.f2665j0;
        if (h01Var == null) {
            throw new NullPointerException("provider");
        }
        c15.put("InspectorAdLifecycleMonitorLoadListener", h01Var);
        l01 l01Var = this.f2667k0;
        if (l01Var == null) {
            throw new NullPointerException("provider");
        }
        c15.put("adUnitStatsTrackerAdLoadListener", l01Var);
        p01 p01Var = this.f2669l0;
        if (p01Var == null) {
            throw new NullPointerException("provider");
        }
        c15.put("debugSignalsAdLoadListener", p01Var);
        n01 n01Var = this.f2671m0;
        if (n01Var == null) {
            throw new NullPointerException("provider");
        }
        c15.put("customTabsConnectionInitializationTaskInternalAdLoadListener", n01Var);
        a.o8 qw0Var = new qw0(this.f2646a.f8566p, new v81(c15));
        a.o8 u90Var3 = qw0Var instanceof u90 ? qw0Var : new u90(qw0Var);
        this.f2673n0 = u90Var3;
        n20 n20Var6 = this.f2646a;
        a.o8 v72Var = new v72(n20Var6.f8566p, n20Var6.f8530g, this.f2663i0, n20Var6.f8518c2, u90Var3, this.f2652d, this.f2650c);
        if (!(v72Var instanceof u90)) {
            v72Var = new u90(v72Var);
        }
        this.f2675o0 = v72Var;
        this.f2677p0 = new e40(xv0.a(o52Var));
        a.o8 u01Var = new u01(this.f2677p0, new e40(xv0.a(v01Var)));
        if (!(u01Var instanceof u90)) {
            u01Var = new u90(u01Var);
        }
        this.f2679q0 = u01Var;
        a.o8 oiVar = new oi(this.f2646a.f8525e2, this.f2679q0, this.f2660h, this.f2662i, xv0.a(z1Var), this.Z, this.f2650c, this.f2648b);
        if (!(oiVar instanceof u90)) {
            oiVar = new u90(oiVar);
        }
        this.f2681r0 = oiVar;
    }

    public final void b() {
        n20 n20Var = this.f2646a;
        a.o8 zw0Var = new zw0(this.f2648b, this.f2650c, this.f2652d, this.f2661h0, new iv1(n20Var.f8566p, n20Var.f8562o, n20Var.f8514b2, n20Var.f8530g, this.f2675o0, this.f2681r0), this.f2679q0, this.f2653d0, n20Var.f8550l, this.f2673n0);
        Object obj = u90.f11887c;
        if (!(zw0Var instanceof u90)) {
            zw0Var = new u90(zw0Var);
        }
        this.f2683s0 = zw0Var;
    }

    public final void a(ws0 ws0Var, j4 j4Var) {
        n20 n20Var = this.f2646a;
        this.L = new vj2(n20Var.H1);
        xv0 xv0Var = a.p8.f142a;
        a.o8 o8Var = n20Var.f8550l;
        xv0 xv0Var2 = n20Var.f8519d;
        this.M = new qk2(new yc2(o8Var, this.f2664j, xv0Var, new qc2(o8Var, xv0Var2, n20Var.f8530g, n20Var.f8583t0, n20Var.J0, n20Var.f8566p, n20Var.f8554m, n20Var.C), this.f2666k, this.f2660h));
        this.N = new sk2(n20Var.I1);
        this.O = new vk2(n20Var.J1, o8Var);
        this.P = new wk2(new fu2(o8Var, n20Var.S, xv0Var), o8Var);
        this.Q = new rj2(n20Var.K1, o8Var);
        this.R = new gk2(n20Var.L1);
        this.S = new ik2(new uv0(n20Var.C0));
        this.T = new wj2(n20Var.M1);
        this.U = new ek2(new p90(xv0Var2));
        this.V = new ck2(n20Var.N1);
        int i13 = qf2.f10067c;
        this.W = new pf2(38).a(this.f2656f).a(this.f2658g).a(this.f2668l).a(this.f2670m).a(this.f2672n).a(this.f2676p).a(this.f2678q).a(this.f2680r).a(this.f2682s).a(this.f2684t).a(this.f2685u).a(this.f2686v).a(this.f2687w).a(this.f2688x).a(this.f2689y).a(this.f2690z).a(this.A).a(this.B).a(this.C).a(this.D).a(this.E).a(this.F).a(this.G).a(this.H).a(this.I).a(this.f2645J).a(this.K).a(this.L).a(this.M).a(this.N).a(this.O).a(this.P).a(this.Q).a(this.R).a(this.S).a(this.T).a(this.U).a(this.V).a();
        xv0 a13 = xv0.a(ws0Var);
        this.X = a13;
        this.Y = new i01(a13);
        n20 n20Var2 = this.f2646a;
        r01 r01Var = new r01(n20Var2.f8530g);
        this.Z = r01Var;
        a.o8 jn2Var = new jn2(n20Var2.G1, n20Var2.f8584t1, this.f2648b, r01Var);
        Object obj = u90.f11887c;
        if (!(jn2Var instanceof u90)) {
            jn2Var = new u90(jn2Var);
        }
        this.f2647a0 = new m01(jn2Var);
        this.f2649b0 = new o01(this.f2646a.X0);
        this.f2651c0 = xv0.a(j4Var);
    }

    public final void a(h92 h92Var, wi.k kVar, Boolean bool, Boolean bool2, vi.d dVar) {
        a.o8 q01Var = new q01(this.f2646a.f8516c0);
        Object obj = u90.f11887c;
        if (!(q01Var instanceof u90)) {
            q01Var = new u90(q01Var);
        }
        this.f2648b = q01Var;
        a.o8 t01Var = new t01(this.f2646a.f8584t1);
        if (!(t01Var instanceof u90)) {
            t01Var = new u90(t01Var);
        }
        this.f2650c = t01Var;
        a.o8 o8Var = a.bb.f17h;
        if (!(o8Var instanceof u90)) {
            o8Var = new u90(o8Var);
        }
        this.f2652d = o8Var;
        n20 n20Var = this.f2646a;
        this.f2654e = am2.a(new do1(n20Var.V, n20Var.S, n20Var.f8590v, n20Var.f8586u, n20Var.f8550l, n20Var.f8530g));
        a.o8 eiVar = new ei(xv0.a(bool2));
        if (!(eiVar instanceof u90)) {
            eiVar = new u90(eiVar);
        }
        this.f2656f = new xx0(eiVar);
        this.f2658g = new oj2(this.f2646a.f8592v1);
        this.f2660h = xv0.a(kVar);
        xv0 a13 = xv0.a(dVar);
        this.f2662i = a13;
        this.f2664j = new e40(a13);
        this.f2666k = xv0.a(h92Var);
        xv0 a14 = xv0.a(bool);
        n20 n20Var2 = this.f2646a;
        a.o8 k3Var = new k3(n20Var2.f8530g, this.f2660h, this.f2664j, n20Var2.f8591v0, n20Var2.f8519d, this.f2666k, a14);
        if (!(k3Var instanceof u90)) {
            k3Var = new u90(k3Var);
        }
        this.f2668l = new qj2(k3Var);
        n20 n20Var3 = this.f2646a;
        this.f2670m = new tj2(new c5(n20Var3.H));
        e40 e40Var = this.f2664j;
        xv0 xv0Var = this.f2666k;
        this.f2672n = new sj2(new u4(e40Var, xv0Var, n20Var3.f8519d, n20Var3.f8550l));
        this.f2674o = new s01(xv0Var);
        int i13 = qf2.f10067c;
        List f13 = a.l9.f(1);
        List f14 = a.l9.f(0);
        s01 s01Var = this.f2674o;
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
        this.f2676p = new uj2(new l5(new qf2(f13, f14)));
        n20 n20Var4 = this.f2646a;
        this.f2678q = new xj2(n20Var4.f8596w1);
        this.f2680r = new mj2(n20Var4.S0);
    }

    public final void a() {
        n20 n20Var = this.f2646a;
        this.f2682s = new yj2(n20Var.f8600x1);
        this.f2684t = new zj2(n20Var.f8604y1);
        this.f2685u = new ak2(n20Var.f8608z1);
        this.f2686v = new bk2(new gn(this.f2666k, n20Var.f8583t0, this.f2660h, n20Var.L0));
        this.f2687w = new dk2(n20Var.A1);
        this.f2688x = new fk2(am2.a(new hc0(n20Var.f8550l)));
        n20 n20Var2 = this.f2646a;
        this.f2689y = new hk2(n20Var2.B1);
        this.f2690z = new jk2(new ta1(n20Var2.Q));
        this.A = new kk2(n20Var2.C1);
        this.B = new lk2(n20Var2.T0);
        this.C = new mk2(n20Var2.D1);
        this.D = new nk2(n20Var2.E1);
        this.E = new uk2(n20Var2.V0);
        this.F = new nj2(am2.a(new go2(n20Var2.O0)));
        n20 n20Var3 = this.f2646a;
        this.G = new tk2(n20Var3.F1);
        this.H = new pj2(n20Var3.R0);
        a.o8 z52Var = new z52(n20Var3.f8584t1, n20Var3.G1, this.f2660h, n20Var3.Q);
        Object obj = u90.f11887c;
        if (!(z52Var instanceof u90)) {
            z52Var = new u90(z52Var);
        }
        this.I = new ok2(z52Var);
        a.o8 u82Var = new u82(this.f2648b);
        if (!(u82Var instanceof u90)) {
            u82Var = new u90(u82Var);
        }
        this.f2645J = new pk2(u82Var);
        this.K = new rk2(this.f2646a.U0);
    }
}
