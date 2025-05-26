package kh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s2 implements q2 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f79686r;

    /* renamed from: a, reason: collision with root package name */
    public final b1 f79687a;

    /* renamed from: b, reason: collision with root package name */
    public final zi2.b f79688b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f79689c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f79690d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f79691e;

    /* renamed from: f, reason: collision with root package name */
    public final xk2.v f79692f;

    /* renamed from: g, reason: collision with root package name */
    public final xk2.v f79693g;

    /* renamed from: h, reason: collision with root package name */
    public tg2.p f79694h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f79695i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f79696j;

    /* renamed from: k, reason: collision with root package name */
    public final c0 f79697k;

    /* renamed from: l, reason: collision with root package name */
    public final c0 f79698l;

    /* renamed from: m, reason: collision with root package name */
    public final xk2.v f79699m;

    /* renamed from: n, reason: collision with root package name */
    public final xk2.v f79700n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.v f79701o;

    /* renamed from: p, reason: collision with root package name */
    public final xk2.v f79702p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f79703q;

    static {
        kotlin.jvm.internal.d0 d0Var = new kotlin.jvm.internal.d0(s2.class, "embraceSpanFactory", "getEmbraceSpanFactory()Lio/embrace/android/embracesdk/internal/spans/EmbraceSpanFactory;", 0);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f79686r = new rl2.u[]{l0Var.g(d0Var), a.c.l(s2.class, "spanService", "getSpanService()Lio/embrace/android/embracesdk/internal/spans/SpanService;", 0, l0Var), a.c.l(s2.class, "embraceTracer", "getEmbraceTracer()Lio/embrace/android/embracesdk/internal/spans/EmbraceTracer;", 0, l0Var)};
    }

    public s2(b1 initModule) {
        nf2.m openTelemetryClock = new nf2.m(((d1) initModule).f79455a);
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        Intrinsics.checkNotNullParameter(openTelemetryClock, "openTelemetryClock");
        this.f79687a = initModule;
        this.f79688b = openTelemetryClock;
        this.f79689c = xk2.m.b(g.f79507u);
        this.f79690d = xk2.m.b(g.f79508v);
        this.f79691e = xk2.m.b(new r2(this, 9));
        this.f79692f = xk2.m.b(new r2(this, 10));
        this.f79693g = xk2.m.b(new r2(this, 11));
        r2 r2Var = new r2(this, 2);
        g1 g1Var = g1.LAZY;
        this.f79695i = new c0(g1Var, r2Var);
        this.f79696j = xk2.m.b(new r2(this, 1));
        this.f79697k = new c0(g1Var, new r2(this, 13));
        this.f79698l = new c0(g1Var, new r2(this, 3));
        this.f79699m = xk2.m.b(new r2(this, 7));
        this.f79700n = xk2.m.b(new r2(this, 8));
        this.f79701o = xk2.m.b(g.f79506t);
        this.f79702p = xk2.m.b(new r2(this, 5));
        this.f79703q = xk2.m.b(new r2(this, 6));
    }

    public final ei2.a a() {
        return (ei2.a) this.f79696j.getValue();
    }

    public final ei2.h b() {
        return (ei2.h) this.f79695i.a(this, f79686r[0]);
    }

    public final sh2.j c() {
        return (sh2.j) this.f79691e.getValue();
    }

    public final ei2.u d() {
        return (ei2.u) this.f79689c.getValue();
    }

    public final ei2.v e() {
        return (ei2.v) this.f79697k.a(this, f79686r[1]);
    }
}
