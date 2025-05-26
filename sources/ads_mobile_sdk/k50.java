package ads_mobile_sdk;

import a.m4;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class k50 implements m4 {
    public a.o8 A;
    public a.o8 B;
    public a.o8 C;
    public a.o8 D;
    public a.o8 E;
    public xv0 F;
    public a.o8 G;
    public a.o8 H;
    public dq2 I;

    /* renamed from: J, reason: collision with root package name */
    public v81 f7105J;
    public a.o8 K;

    /* renamed from: a, reason: collision with root package name */
    public final n20 f7106a;

    /* renamed from: b, reason: collision with root package name */
    public a.o8 f7107b;

    /* renamed from: c, reason: collision with root package name */
    public xv0 f7108c;

    /* renamed from: d, reason: collision with root package name */
    public xv0 f7109d;

    /* renamed from: e, reason: collision with root package name */
    public e40 f7110e;

    /* renamed from: f, reason: collision with root package name */
    public e40 f7111f;

    /* renamed from: g, reason: collision with root package name */
    public e40 f7112g;

    /* renamed from: h, reason: collision with root package name */
    public a.o8 f7113h;

    /* renamed from: i, reason: collision with root package name */
    public xv0 f7114i;

    /* renamed from: j, reason: collision with root package name */
    public y92 f7115j;

    /* renamed from: k, reason: collision with root package name */
    public xv0 f7116k;

    /* renamed from: l, reason: collision with root package name */
    public xv0 f7117l;

    /* renamed from: m, reason: collision with root package name */
    public xv0 f7118m;

    /* renamed from: n, reason: collision with root package name */
    public a.o8 f7119n;

    /* renamed from: o, reason: collision with root package name */
    public a.o8 f7120o;

    /* renamed from: p, reason: collision with root package name */
    public xv0 f7121p;

    /* renamed from: q, reason: collision with root package name */
    public a.o8 f7122q;

    /* renamed from: r, reason: collision with root package name */
    public a.o8 f7123r;

    /* renamed from: s, reason: collision with root package name */
    public v81 f7124s;

    /* renamed from: t, reason: collision with root package name */
    public a.o8 f7125t;

    /* renamed from: u, reason: collision with root package name */
    public xv0 f7126u;

    /* renamed from: v, reason: collision with root package name */
    public a.o8 f7127v;

    /* renamed from: w, reason: collision with root package name */
    public a.o8 f7128w;

    /* renamed from: x, reason: collision with root package name */
    public a.o8 f7129x;

    /* renamed from: y, reason: collision with root package name */
    public a.o8 f7130y;

    /* renamed from: z, reason: collision with root package name */
    public a.o8 f7131z;

    public k50(n20 n20Var, wi.k kVar, h92 h92Var, Integer num, r0 r0Var, vo voVar, cf2 cf2Var, o52 o52Var, v01 v01Var, k72 k72Var, g5 g5Var, a.p1 p1Var, if1 if1Var) {
        this.f7106a = n20Var;
        a(kVar, num, r0Var, voVar, cf2Var, o52Var, v01Var, k72Var, g5Var);
        a(h92Var, p1Var, if1Var);
        g();
    }

    public final void a(h92 h92Var, a.p1 p1Var, if1 if1Var) {
        a.o8 o1Var = new o1(this.f7106a.f8566p, this.f7124s, this.f7108c);
        Object obj = u90.f11887c;
        if (!(o1Var instanceof u90)) {
            o1Var = new u90(o1Var);
        }
        this.f7125t = o1Var;
        this.f7126u = xv0.a(if1Var);
        xv0 a13 = xv0.a(p1Var);
        n20 n20Var = this.f7106a;
        a.o8 zp2Var = new zp2(n20Var.f8566p, a13, this.f7125t, this.f7108c, n20Var.S2);
        if (!(zp2Var instanceof u90)) {
            zp2Var = new u90(zp2Var);
        }
        this.f7127v = zp2Var;
        a.o8 uy0Var = new uy0(this.f7126u);
        a.o8 u90Var = uy0Var instanceof u90 ? uy0Var : new u90(uy0Var);
        this.f7128w = u90Var;
        n20 n20Var2 = this.f7106a;
        a.o8 o8Var = n20Var2.f8574r;
        a.o8 o8Var2 = n20Var2.f8566p;
        xv0 xv0Var = this.f7126u;
        a.o8 o8Var3 = n20Var2.f8550l;
        a.o8 o8Var4 = n20Var2.N0;
        xv0 xv0Var2 = this.f7121p;
        a.h hVar = a.l9.f83d;
        a.o8 di1Var = new di1(o8Var, o8Var2, xv0Var, o8Var3, u90Var, o8Var4, xv0Var2, hVar);
        if (!(di1Var instanceof u90)) {
            di1Var = new u90(di1Var);
        }
        this.f7129x = di1Var;
        a.o8 j03Var = new j03(this.f7114i, this.f7106a.f8574r);
        if (!(j03Var instanceof u90)) {
            j03Var = new u90(j03Var);
        }
        this.f7130y = j03Var;
        a.o8 l6Var = new l6(this.f7106a.f8574r, this.f7114i);
        if (!(l6Var instanceof u90)) {
            l6Var = new u90(l6Var);
        }
        this.f7131z = l6Var;
        xv0 xv0Var3 = this.f7121p;
        n20 n20Var3 = this.f7106a;
        a.o8 bd0Var = new bd0(xv0Var3, n20Var3.f8512b0, this.f7108c, n20Var3.f8566p);
        if (!(bd0Var instanceof u90)) {
            bd0Var = new u90(bd0Var);
        }
        this.A = bd0Var;
        a.o8 hi1Var = new hi1(this.f7127v);
        if (!(hi1Var instanceof u90)) {
            hi1Var = new u90(hi1Var);
        }
        this.B = hi1Var;
        xv0 xv0Var4 = v81.f12395b;
        LinkedHashMap c13 = a.l9.c(4);
        a.o8 o8Var5 = this.f7130y;
        if (o8Var5 == null) {
            throw new NullPointerException("provider");
        }
        c13.put("WebViewPauseResumeListener", o8Var5);
        a.o8 o8Var6 = this.f7131z;
        if (o8Var6 == null) {
            throw new NullPointerException("provider");
        }
        c13.put("AdVisibilityChangedAfmaEventListener", o8Var6);
        a.o8 o8Var7 = this.A;
        if (o8Var7 == null) {
            throw new NullPointerException("provider");
        }
        c13.put("FirebaseAnalyticsAdEventListener", o8Var7);
        a.o8 o8Var8 = this.B;
        if (o8Var8 == null) {
            throw new NullPointerException("provider");
        }
        a.o8 uy2Var = new uy2(this.f7106a.f8574r, a.c.f(c13, "NativeAdViewVisibilityChangedEventListener", o8Var8, c13));
        if (!(uy2Var instanceof u90)) {
            uy2Var = new u90(uy2Var);
        }
        this.C = uy2Var;
        n20 n20Var4 = this.f7106a;
        a.o8 de1Var = new de1(n20Var4.M2, this.f7114i, n20Var4.f8574r);
        if (!(de1Var instanceof u90)) {
            de1Var = new u90(de1Var);
        }
        this.D = de1Var;
        LinkedHashMap c14 = a.l9.c(2);
        a.o8 o8Var9 = this.C;
        if (o8Var9 == null) {
            throw new NullPointerException("provider");
        }
        c14.put("VisibilityChangedEventEmitter", o8Var9);
        a.o8 o8Var10 = this.D;
        if (o8Var10 == null) {
            throw new NullPointerException("provider");
        }
        a.o8 ly2Var = new ly2(this.f7106a.f8574r, a.c.f(c14, "MraidViewabilityEventListener", o8Var10, c14));
        a.o8 u90Var2 = ly2Var instanceof u90 ? ly2Var : new u90(ly2Var);
        n20 n20Var5 = this.f7106a;
        a.o8 ji1Var = new ji1(n20Var5.f8574r, hVar, u90Var2, n20Var5.f8568p1, n20Var5.f8530g);
        if (!(ji1Var instanceof u90)) {
            ji1Var = new u90(ji1Var);
        }
        a.o8 li1Var = new li1(ji1Var, this.B);
        if (!(li1Var instanceof u90)) {
            li1Var = new u90(li1Var);
        }
        this.E = li1Var;
        this.F = a.p8.f142a;
        xv0 a14 = xv0.a(h92Var);
        n20 n20Var6 = this.f7106a;
        a.o8 fd2Var = new fd2(n20Var6.f8582t, this.f7108c, n20Var6.G, n20Var6.f8590v, a14);
        a.o8 zz0Var = new zz0(this.f7107b, this.f7108c, this.f7109d, this.f7113h, this.f7114i, this.f7125t, this.f7120o, this.f7126u, this.f7127v, this.f7129x, this.E, this.f7128w, this.F, this.f7106a.Q0, fd2Var instanceof u90 ? fd2Var : new u90(fd2Var));
        if (!(zz0Var instanceof u90)) {
            zz0Var = new u90(zz0Var);
        }
        this.G = zz0Var;
        a.o8 xa2Var = new xa2(this.f7106a.f8566p, v81.f12395b);
        if (!(xa2Var instanceof u90)) {
            xa2Var = new u90(xa2Var);
        }
        this.H = xa2Var;
        a.o8 br2Var = new br2(this.f7126u, this.f7106a.f8574r);
        if (!(br2Var instanceof u90)) {
            br2Var = new u90(br2Var);
        }
        this.I = new dq2(br2Var);
        LinkedHashMap c15 = a.l9.c(1);
        dq2 dq2Var = this.I;
        if (dq2Var == null) {
            throw new NullPointerException("provider");
        }
        c15.put("provideThirdPartyVideoEventListener", dq2Var);
        this.f7105J = new v81(c15);
    }

    @Override // a.m4
    public final a.le f() {
        return (a.le) this.K.get();
    }

    public final void g() {
        a.o8 rq2Var = new rq2(this.f7106a.f8566p, this.f7105J);
        Object obj = u90.f11887c;
        a.o8 np2Var = new np2(this.f7106a.f8566p, this.f7108c, this.f7125t, this.H, rq2Var instanceof u90 ? rq2Var : new u90(rq2Var));
        if (!(np2Var instanceof u90)) {
            np2Var = new u90(np2Var);
        }
        this.K = np2Var;
        n20 n20Var = this.f7106a;
        ds1 ds1Var = new ds1(n20Var.D, this.f7108c, n20Var.f8550l);
        if (ds1Var instanceof u90) {
            return;
        }
        new u90(ds1Var);
    }

    public final void a(wi.k kVar, Integer num, r0 r0Var, vo voVar, cf2 cf2Var, o52 o52Var, v01 v01Var, k72 k72Var, g5 g5Var) {
        a.o8 o8Var = a.bb.f14e;
        Object obj = u90.f11887c;
        if (!(o8Var instanceof u90)) {
            o8Var = new u90(o8Var);
        }
        this.f7107b = o8Var;
        this.f7108c = xv0.a(r0Var);
        this.f7109d = xv0.a(voVar);
        this.f7110e = new e40(xv0.a(o52Var));
        this.f7111f = new e40(xv0.a(v01Var));
        this.f7112g = new e40(xv0.a(k72Var));
        a.o8 toVar = new to(this.f7110e, this.f7111f, this.f7112g, new e40(xv0.a(g5Var)));
        if (!(toVar instanceof u90)) {
            toVar = new u90(toVar);
        }
        this.f7113h = toVar;
        xv0 xv0Var = a.p8.f142a;
        this.f7114i = xv0Var;
        n20 n20Var = this.f7106a;
        this.f7115j = new y92(this.f7108c, this.f7109d, new z92(n20Var.f8550l, n20Var.f8548k1, n20Var.f8530g, n20Var.f8566p, n20Var.f8590v, n20Var.f8559n0));
        this.f7116k = xv0Var;
        this.f7117l = xv0.a(cf2Var);
        this.f7118m = xv0.a(num);
        a.o8 o8Var2 = a.l9.f80a;
        a.o8 u90Var = o8Var2 instanceof u90 ? o8Var2 : new u90(o8Var2);
        n20 n20Var2 = this.f7106a;
        a.o8 rt2Var = new rt2(n20Var2.C, n20Var2.f8518c2, n20Var2.H, this.f7115j, this.f7116k, this.f7117l, this.f7108c, this.f7113h, this.f7118m, n20Var2.f8530g, u90Var, n20Var2.N2);
        if (!(rt2Var instanceof u90)) {
            rt2Var = new u90(rt2Var);
        }
        this.f7119n = rt2Var;
        n20 n20Var3 = this.f7106a;
        a.o8 g80Var = new g80(n20Var3.f8566p, n20Var3.f8550l, this.f7113h, n20Var3.C);
        if (!(g80Var instanceof u90)) {
            g80Var = new u90(g80Var);
        }
        this.f7120o = g80Var;
        xv0 a13 = xv0.a(kVar);
        this.f7121p = a13;
        a.o8 y5Var = new y5(this.f7106a.G1, a13);
        if (!(y5Var instanceof u90)) {
            y5Var = new u90(y5Var);
        }
        this.f7122q = y5Var;
        xv0 xv0Var2 = this.f7108c;
        n20 n20Var4 = this.f7106a;
        a.o8 vw1Var = new vw1(xv0Var2, n20Var4.O2, n20Var4.f8550l);
        if (!(vw1Var instanceof u90)) {
            vw1Var = new u90(vw1Var);
        }
        this.f7123r = vw1Var;
        xv0 xv0Var3 = v81.f12395b;
        LinkedHashMap c13 = a.l9.c(4);
        a.o8 o8Var3 = this.f7119n;
        if (o8Var3 == null) {
            throw new NullPointerException("provider");
        }
        c13.put("TrackingPingMonitorAsAdEventListener", o8Var3);
        a.o8 o8Var4 = this.f7120o;
        if (o8Var4 == null) {
            throw new NullPointerException("provider");
        }
        c13.put("DelegatingAdEventListener", o8Var4);
        a.o8 o8Var5 = this.f7122q;
        if (o8Var5 == null) {
            throw new NullPointerException("provider");
        }
        c13.put("AdStatsTrackerListener", o8Var5);
        a.o8 o8Var6 = this.f7123r;
        if (o8Var6 != null) {
            this.f7124s = a.c.f(c13, "PlayPrewarmListener", o8Var6, c13);
            return;
        }
        throw new NullPointerException("provider");
    }

    @Override // a.m4
    public final a.x5 a() {
        return (InternalNativeAd) this.G.get();
    }
}
