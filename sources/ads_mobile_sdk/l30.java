package ads_mobile_sdk;

import bj.n;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class l30 {

    /* renamed from: a, reason: collision with root package name */
    public final n20 f7631a;

    /* renamed from: b, reason: collision with root package name */
    public a.o8 f7632b;

    /* renamed from: c, reason: collision with root package name */
    public a.o8 f7633c;

    /* renamed from: d, reason: collision with root package name */
    public a.o8 f7634d;

    /* renamed from: e, reason: collision with root package name */
    public xv0 f7635e;

    /* renamed from: f, reason: collision with root package name */
    public xv0 f7636f;

    /* renamed from: g, reason: collision with root package name */
    public xv0 f7637g;

    /* renamed from: h, reason: collision with root package name */
    public a.o8 f7638h;

    /* renamed from: i, reason: collision with root package name */
    public z92 f7639i;

    /* renamed from: j, reason: collision with root package name */
    public l01 f7640j;

    /* renamed from: k, reason: collision with root package name */
    public p01 f7641k;

    /* renamed from: l, reason: collision with root package name */
    public n01 f7642l;

    /* renamed from: m, reason: collision with root package name */
    public a.o8 f7643m;

    /* renamed from: n, reason: collision with root package name */
    public a.o8 f7644n;

    /* renamed from: o, reason: collision with root package name */
    public e40 f7645o;

    /* renamed from: p, reason: collision with root package name */
    public a.o8 f7646p;

    /* renamed from: q, reason: collision with root package name */
    public xv0 f7647q;

    /* renamed from: r, reason: collision with root package name */
    public r01 f7648r;

    /* renamed from: s, reason: collision with root package name */
    public a.o8 f7649s;

    /* renamed from: t, reason: collision with root package name */
    public a.o8 f7650t;

    /* renamed from: u, reason: collision with root package name */
    public iv1 f7651u;

    /* renamed from: v, reason: collision with root package name */
    public m01 f7652v;

    /* renamed from: w, reason: collision with root package name */
    public o01 f7653w;

    /* renamed from: x, reason: collision with root package name */
    public a.o8 f7654x;

    public l30(n20 n20Var, mh2 mh2Var, String str, wi.k kVar, h92 h92Var, o52 o52Var, v01 v01Var, n nVar) {
        this.f7631a = n20Var;
        a(mh2Var, str, kVar, h92Var, o52Var, v01Var, nVar);
        a();
    }

    public final void a(mh2 mh2Var, String str, wi.k kVar, h92 h92Var, o52 o52Var, v01 v01Var, n nVar) {
        a.o8 q01Var = new q01(this.f7631a.f8516c0);
        Object obj = u90.f11887c;
        if (!(q01Var instanceof u90)) {
            q01Var = new u90(q01Var);
        }
        this.f7632b = q01Var;
        a.o8 t01Var = new t01(this.f7631a.f8584t1);
        if (!(t01Var instanceof u90)) {
            t01Var = new u90(t01Var);
        }
        this.f7633c = t01Var;
        a.o8 o8Var = a.bb.f17h;
        if (!(o8Var instanceof u90)) {
            o8Var = new u90(o8Var);
        }
        this.f7634d = o8Var;
        this.f7635e = xv0.a(str);
        this.f7636f = xv0.a(mh2Var);
        xv0 a13 = xv0.a(kVar);
        this.f7637g = a13;
        a.o8 f5Var = new f5(this.f7631a.V, this.f7635e, this.f7636f, a13);
        if (!(f5Var instanceof u90)) {
            f5Var = new u90(f5Var);
        }
        this.f7638h = f5Var;
        n20 n20Var = this.f7631a;
        a.o8 o8Var2 = n20Var.f8550l;
        a.o8 o8Var3 = n20Var.f8548k1;
        a.o8 o8Var4 = n20Var.f8530g;
        this.f7639i = new z92(o8Var2, o8Var3, o8Var4, n20Var.f8566p, n20Var.f8590v, n20Var.f8559n0);
        a.o8 w5Var = new w5(this.f7632b, this.f7637g, n20Var.G1, o8Var4);
        if (!(w5Var instanceof u90)) {
            w5Var = new u90(w5Var);
        }
        this.f7640j = new l01(w5Var);
        n20 n20Var2 = this.f7631a;
        this.f7641k = new p01(n20Var2.d2);
        this.f7642l = new n01(n20Var2.X0);
        xv0 xv0Var = v81.f12395b;
        LinkedHashMap c13 = a.l9.c(3);
        l01 l01Var = this.f7640j;
        if (l01Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("adUnitStatsTrackerAdLoadListener", l01Var);
        p01 p01Var = this.f7641k;
        if (p01Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("debugSignalsAdLoadListener", p01Var);
        n01 n01Var = this.f7642l;
        if (n01Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("customTabsConnectionInitializationTaskInternalAdLoadListener", n01Var);
        a.o8 qw0Var = new qw0(this.f7631a.f8566p, new v81(c13));
        a.o8 u90Var = qw0Var instanceof u90 ? qw0Var : new u90(qw0Var);
        this.f7643m = u90Var;
        n20 n20Var3 = this.f7631a;
        a.o8 v72Var = new v72(n20Var3.f8566p, n20Var3.f8530g, this.f7639i, n20Var3.f8518c2, u90Var, this.f7634d, this.f7633c);
        if (!(v72Var instanceof u90)) {
            v72Var = new u90(v72Var);
        }
        this.f7644n = v72Var;
        this.f7645o = new e40(xv0.a(o52Var));
        a.o8 u01Var = new u01(this.f7645o, new e40(xv0.a(v01Var)));
        if (!(u01Var instanceof u90)) {
            u01Var = new u90(u01Var);
        }
        this.f7646p = u01Var;
        xv0 a14 = xv0.a(nVar);
        this.f7647q = a14;
        n20 n20Var4 = this.f7631a;
        r01 r01Var = new r01(n20Var4.f8530g);
        this.f7648r = r01Var;
        a.o8 oiVar = new oi(n20Var4.f8525e2, this.f7646p, this.f7637g, a14, a.l9.f85f, r01Var, this.f7633c, this.f7632b);
        if (!(oiVar instanceof u90)) {
            oiVar = new u90(oiVar);
        }
        this.f7649s = oiVar;
        a.o8 sm1Var = new sm1(this.f7631a.f8533g2, this.f7646p, this.f7637g, this.f7647q, this.f7648r, this.f7633c, this.f7632b, xv0.a(h92Var), a.l9.f95p);
        if (!(sm1Var instanceof u90)) {
            sm1Var = new u90(sm1Var);
        }
        this.f7650t = sm1Var;
    }

    public final void a() {
        a.o8 te1Var = new te1(this.f7649s, this.f7650t);
        Object obj = u90.f11887c;
        a.o8 u90Var = te1Var instanceof u90 ? te1Var : new u90(te1Var);
        n20 n20Var = this.f7631a;
        this.f7651u = new iv1(n20Var.f8566p, n20Var.f8562o, n20Var.f8514b2, n20Var.f8530g, this.f7644n, u90Var);
        a.o8 jn2Var = new jn2(n20Var.G1, n20Var.f8584t1, this.f7632b, this.f7648r);
        if (!(jn2Var instanceof u90)) {
            jn2Var = new u90(jn2Var);
        }
        this.f7652v = new m01(jn2Var);
        this.f7653w = new o01(this.f7631a.X0);
        xv0 xv0Var = v81.f12395b;
        LinkedHashMap c13 = a.l9.c(3);
        lf lfVar = this.f7631a.O1;
        if (lfVar == null) {
            throw new NullPointerException("provider");
        }
        c13.put("configLoaderRefreshSignalRequestedListener", lfVar);
        m01 m01Var = this.f7652v;
        if (m01Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("adUnitStatsTrackerSignalsRequestedListener", m01Var);
        o01 o01Var = this.f7653w;
        if (o01Var != null) {
            c13.put("customTabsConnectionInitializationTask", o01Var);
            a.o8 fx0Var = new fx0(this.f7631a.f8566p, new v81(c13));
            a.o8 zw0Var = new zw0(this.f7632b, this.f7633c, this.f7634d, this.f7638h, this.f7651u, this.f7646p, fx0Var instanceof u90 ? fx0Var : new u90(fx0Var), this.f7631a.f8550l, this.f7643m);
            if (!(zw0Var instanceof u90)) {
                zw0Var = new u90(zw0Var);
            }
            this.f7654x = zw0Var;
            return;
        }
        throw new NullPointerException("provider");
    }
}
