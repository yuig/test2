package ads_mobile_sdk;

import a.md;
import bj.n;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class b40 {
    public xv0 A;
    public a.o8 B;
    public lm1 C;
    public a.o8 D;
    public om1 E;
    public nm1 F;
    public e40 G;
    public qm1 H;
    public pm1 I;

    /* renamed from: J, reason: collision with root package name */
    public a.o8 f2710J;

    /* renamed from: a, reason: collision with root package name */
    public final n20 f2711a;

    /* renamed from: b, reason: collision with root package name */
    public xv0 f2712b;

    /* renamed from: c, reason: collision with root package name */
    public xv0 f2713c;

    /* renamed from: d, reason: collision with root package name */
    public y92 f2714d;

    /* renamed from: e, reason: collision with root package name */
    public xv0 f2715e;

    /* renamed from: f, reason: collision with root package name */
    public a.o8 f2716f;

    /* renamed from: g, reason: collision with root package name */
    public xj1 f2717g;

    /* renamed from: h, reason: collision with root package name */
    public xv0 f2718h;

    /* renamed from: i, reason: collision with root package name */
    public a.o8 f2719i;

    /* renamed from: j, reason: collision with root package name */
    public yk1 f2720j;

    /* renamed from: k, reason: collision with root package name */
    public xk1 f2721k;

    /* renamed from: l, reason: collision with root package name */
    public uk1 f2722l;

    /* renamed from: m, reason: collision with root package name */
    public zk1 f2723m;

    /* renamed from: n, reason: collision with root package name */
    public wk1 f2724n;

    /* renamed from: o, reason: collision with root package name */
    public tk1 f2725o;

    /* renamed from: p, reason: collision with root package name */
    public vk1 f2726p;

    /* renamed from: q, reason: collision with root package name */
    public a.o8 f2727q;

    /* renamed from: r, reason: collision with root package name */
    public cy1 f2728r;

    /* renamed from: s, reason: collision with root package name */
    public by1 f2729s;

    /* renamed from: t, reason: collision with root package name */
    public dy1 f2730t;

    /* renamed from: u, reason: collision with root package name */
    public ey1 f2731u;

    /* renamed from: v, reason: collision with root package name */
    public e40 f2732v;

    /* renamed from: w, reason: collision with root package name */
    public a.o8 f2733w;

    /* renamed from: x, reason: collision with root package name */
    public xv0 f2734x;

    /* renamed from: y, reason: collision with root package name */
    public xv0 f2735y;

    /* renamed from: z, reason: collision with root package name */
    public xv0 f2736z;

    public b40(n20 n20Var, vo voVar, r0 r0Var, cf2 cf2Var, Long l13, Integer num, wi.k kVar, h92 h92Var, o52 o52Var, v01 v01Var, Integer num2, n nVar) {
        this.f2711a = n20Var;
        a(voVar, r0Var, h92Var, nVar);
        a(cf2Var, l13, num, kVar, o52Var, v01Var, num2);
        a();
    }

    public final void a(cf2 cf2Var, Long l13, Integer num, wi.k kVar, o52 o52Var, v01 v01Var, Integer num2) {
        xv0 xv0Var = v81.f12395b;
        LinkedHashMap c13 = a.l9.c(2);
        cy1 cy1Var = this.f2728r;
        if (cy1Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("/canOpenURLs", cy1Var);
        by1 by1Var = this.f2729s;
        if (by1Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("/canOpenIntents", by1Var);
        this.f2730t = new dy1(new v81(c13));
        LinkedHashMap c14 = a.l9.c(1);
        dy1 dy1Var = this.f2730t;
        if (dy1Var == null) {
            throw new NullPointerException("provider");
        }
        c14.put("GmsgHandlerInstaller", dy1Var);
        this.f2731u = new ey1(new v81(c14));
        this.f2732v = new e40(xv0.a(o52Var));
        a.o8 xoVar = new xo(this.f2732v, new e40(xv0.a(v01Var)));
        Object obj = u90.f11887c;
        if (!(xoVar instanceof u90)) {
            xoVar = new u90(xoVar);
        }
        this.f2733w = xoVar;
        this.f2734x = xv0.a(kVar);
        this.f2735y = xv0.a(l13);
        this.f2736z = xv0.a(num);
        this.A = xv0.a(cf2Var);
        a.o8 woVar = new wo(this.f2711a.f8516c0);
        if (!(woVar instanceof u90)) {
            woVar = new u90(woVar);
        }
        this.B = woVar;
        xv0 a13 = xv0.a(num2);
        a.o8 o8Var = this.f2716f;
        n20 n20Var = this.f2711a;
        a.o8 og1Var = new og1(o8Var, n20Var.f8561n2, n20Var.f8565o2, this.f2717g, this.f2727q, this.f2718h, this.f2731u, n20Var.C, this.f2733w, this.f2734x, this.f2715e, this.f2735y, this.f2736z, this.f2712b, this.f2713c, this.A, this.B, n20Var.f8566p, a13);
        if (!(og1Var instanceof u90)) {
            og1Var = new u90(og1Var);
        }
        this.C = new lm1(og1Var);
        a.o8 o8Var2 = a.l9.f93n;
        a.o8 u90Var = o8Var2 instanceof u90 ? o8Var2 : new u90(o8Var2);
        this.D = u90Var;
        xv0 xv0Var2 = this.f2734x;
        xv0 xv0Var3 = this.f2718h;
        n20 n20Var2 = this.f2711a;
        a.o8 ni1Var = new ni1(xv0Var2, xv0Var3, n20Var2.f8591v0, n20Var2.f8519d, n20Var2.B, u90Var, n20Var2.H2);
        if (!(ni1Var instanceof u90)) {
            ni1Var = new u90(ni1Var);
        }
        this.E = new om1(ni1Var);
        xv0 xv0Var4 = this.f2734x;
        xv0 xv0Var5 = this.f2718h;
        n20 n20Var3 = this.f2711a;
        a.o8 um1Var = new um1(xv0Var4, xv0Var5, n20Var3.f8591v0, n20Var3.f8519d, n20Var3.B, this.D, n20Var3.H2);
        if (!(um1Var instanceof u90)) {
            um1Var = new u90(um1Var);
        }
        this.F = new nm1(um1Var);
        xv0 xv0Var6 = this.f2734x;
        xv0 xv0Var7 = this.f2718h;
        n20 n20Var4 = this.f2711a;
        a.o8 dl1Var = new dl1(xv0Var6, xv0Var7, n20Var4.f8591v0, n20Var4.f8519d, n20Var4.B, this.D, n20Var4.H2);
        if (!(dl1Var instanceof u90)) {
            dl1Var = new u90(dl1Var);
        }
        this.G = new e40(new mm1(dl1Var));
    }

    public final void a(vo voVar, r0 r0Var, h92 h92Var, n nVar) {
        this.f2712b = xv0.a(r0Var);
        xv0 a13 = xv0.a(voVar);
        this.f2713c = a13;
        n20 n20Var = this.f2711a;
        this.f2714d = new y92(this.f2712b, a13, new z92(n20Var.f8550l, n20Var.f8548k1, n20Var.f8530g, n20Var.f8566p, n20Var.f8590v, n20Var.f8559n0));
        xv0 a14 = xv0.a(h92Var);
        this.f2715e = a14;
        n20 n20Var2 = this.f2711a;
        a.o8 ezVar = new ez(n20Var2.f8566p, n20Var2.f8519d, n20Var2.f8550l, n20Var2.f8530g, this.f2714d, a14, n20Var2.f8606z, this.f2713c);
        Object obj = u90.f11887c;
        if (!(ezVar instanceof u90)) {
            ezVar = new u90(ezVar);
        }
        this.f2716f = ezVar;
        n20 n20Var3 = this.f2711a;
        this.f2717g = new xj1(n20Var3.f8574r, n20Var3.f8566p, n20Var3.f8550l, n20Var3.f8507J, n20Var3.C, n20Var3.A2, n20Var3.f8609z2);
        this.f2718h = xv0.a(nVar);
        n20 n20Var4 = this.f2711a;
        this.f2719i = am2.a(new vj(n20Var4.f8590v, n20Var4.f8550l, n20Var4.f8554m));
        n20 n20Var5 = this.f2711a;
        this.f2720j = new yk1(n20Var5.B2);
        this.f2721k = new xk1(n20Var5.C2);
        this.f2722l = new uk1(n20Var5.D2);
        this.f2723m = new zk1(n20Var5.E2);
        this.f2724n = new wk1(n20Var5.L);
        this.f2725o = new tk1(n20Var5.F2);
        xv0 xv0Var = v81.f12395b;
        md mdVar = new md(6);
        mdVar.a("/videoMeta", this.f2720j);
        mdVar.a("/video", this.f2721k);
        mdVar.a("/delayPageLoaded", this.f2722l);
        mdVar.a("/getLocationInfo", this.f2723m);
        mdVar.a("/log", this.f2724n);
        mdVar.a("/instrument", this.f2725o);
        this.f2726p = new vk1(new v81(mdVar.f4078a));
        LinkedHashMap c13 = a.l9.c(1);
        vk1 vk1Var = this.f2726p;
        if (vk1Var != null) {
            c13.put("GmsgHandlerInstaller", vk1Var);
            al1 al1Var = new al1(new v81(c13));
            n20 n20Var6 = this.f2711a;
            a.o8 nk1Var = new nk1(n20Var6.f8574r, n20Var6.f8507J, al1Var, n20Var6.f8550l, this.f2718h);
            a.o8 u90Var = nk1Var instanceof u90 ? nk1Var : new u90(nk1Var);
            xv0 xv0Var2 = this.f2718h;
            a.o8 o8Var = this.f2719i;
            n20 n20Var7 = this.f2711a;
            a.o8 ej1Var = new ej1(xv0Var2, o8Var, n20Var7.f8554m, u90Var, n20Var7.f8507J, n20Var7.f8574r, n20Var7.C);
            a.o8 u90Var2 = ej1Var instanceof u90 ? ej1Var : new u90(ej1Var);
            pj1 pj1Var = new pj1(u90Var2);
            n20 n20Var8 = this.f2711a;
            a.o8 vf1Var = new vf1(n20Var8.f8519d, n20Var8.f8562o, u90Var2, pj1Var, this.f2718h);
            if (!(vf1Var instanceof u90)) {
                vf1Var = new u90(vf1Var);
            }
            this.f2727q = vf1Var;
            xv0 xv0Var3 = this.f2712b;
            this.f2728r = new cy1(xv0Var3);
            this.f2729s = new by1(xv0Var3, this.f2711a.G2);
            return;
        }
        throw new NullPointerException("provider");
    }

    public final void a() {
        om1 om1Var = this.E;
        nm1 nm1Var = this.F;
        e40 e40Var = this.G;
        n20 n20Var = this.f2711a;
        a.o8 ro2Var = new ro2(om1Var, nm1Var, e40Var, n20Var.J0, this.D, n20Var.f8574r, this.f2733w, this.f2734x, this.f2715e, this.f2735y, this.f2736z, this.f2712b, this.f2713c, this.A, this.B);
        Object obj = u90.f11887c;
        if (!(ro2Var instanceof u90)) {
            ro2Var = new u90(ro2Var);
        }
        this.H = new qm1(ro2Var);
        this.I = new pm1(ro2Var);
        xv0 xv0Var = v81.f12395b;
        LinkedHashMap c13 = a.l9.c(3);
        lm1 lm1Var = this.C;
        if (lm1Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("FirstPartyRenderer", lm1Var);
        qm1 qm1Var = this.H;
        if (qm1Var == null) {
            throw new NullPointerException("provider");
        }
        c13.put("ThirdPartyRenderer", qm1Var);
        pm1 pm1Var = this.I;
        if (pm1Var != null) {
            c13.put("RtbRendererNative", pm1Var);
            a.o8 g3Var = new g3(new v81(c13));
            if (!(g3Var instanceof u90)) {
                g3Var = new u90(g3Var);
            }
            this.f2710J = g3Var;
            return;
        }
        throw new NullPointerException("provider");
    }
}
