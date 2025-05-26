package m7;

import android.content.Context;
import android.os.Looper;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f86452a;

    /* renamed from: b, reason: collision with root package name */
    public final d7.g0 f86453b;

    /* renamed from: c, reason: collision with root package name */
    public ok.g0 f86454c;

    /* renamed from: d, reason: collision with root package name */
    public ok.g0 f86455d;

    /* renamed from: e, reason: collision with root package name */
    public ok.g0 f86456e;

    /* renamed from: f, reason: collision with root package name */
    public ok.g0 f86457f;

    /* renamed from: g, reason: collision with root package name */
    public ok.g0 f86458g;

    /* renamed from: h, reason: collision with root package name */
    public ok.t f86459h;

    /* renamed from: i, reason: collision with root package name */
    public final Looper f86460i;

    /* renamed from: j, reason: collision with root package name */
    public final int f86461j;

    /* renamed from: k, reason: collision with root package name */
    public final a7.f f86462k;

    /* renamed from: l, reason: collision with root package name */
    public final int f86463l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f86464m;

    /* renamed from: n, reason: collision with root package name */
    public final x1 f86465n;

    /* renamed from: o, reason: collision with root package name */
    public final long f86466o;

    /* renamed from: p, reason: collision with root package name */
    public final long f86467p;

    /* renamed from: q, reason: collision with root package name */
    public final long f86468q;

    /* renamed from: r, reason: collision with root package name */
    public final k f86469r;

    /* renamed from: s, reason: collision with root package name */
    public final long f86470s;

    /* renamed from: t, reason: collision with root package name */
    public final long f86471t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f86472u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f86473v;

    /* renamed from: w, reason: collision with root package name */
    public final String f86474w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f86475x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f86476y;

    public x(Context context) {
        e eVar = new e(context, 1);
        e eVar2 = new e(context, 2);
        e eVar3 = new e(context, 3);
        t tVar = new t(0);
        e eVar4 = new e(context, 4);
        u uVar = new u(0);
        context.getClass();
        this.f86452a = context;
        this.f86454c = eVar;
        this.f86455d = eVar2;
        this.f86456e = eVar3;
        this.f86457f = tVar;
        this.f86458g = eVar4;
        this.f86459h = uVar;
        int i13 = d7.n0.f53866a;
        Looper myLooper = Looper.myLooper();
        this.f86460i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f86462k = a7.f.f987g;
        this.f86463l = 1;
        this.f86464m = true;
        this.f86465n = x1.f86481d;
        this.f86466o = 5000L;
        this.f86467p = 15000L;
        this.f86468q = 3000L;
        this.f86469r = new k(d7.n0.X(20L), d7.n0.X(500L), 0.999f);
        this.f86453b = d7.e.f53809a;
        this.f86470s = 500L;
        this.f86471t = CameraPreview.AUTOFOCUS_INTERVAL_MILLIS;
        this.f86472u = true;
        this.f86474w = "";
        this.f86461j = -1000;
        new h1.b(15);
        this.f86476y = true;
    }

    public final l0 a() {
        bf.b.t(!this.f86473v);
        this.f86473v = true;
        return new l0(this);
    }

    public final void b(boolean z13) {
        bf.b.t(!this.f86473v);
        this.f86475x = z13;
    }

    public final void c(l8.e eVar) {
        bf.b.t(!this.f86473v);
        eVar.getClass();
        this.f86458g = new v(eVar, 1);
    }

    public final void d(n nVar) {
        bf.b.t(!this.f86473v);
        this.f86457f = new v(nVar, 0);
    }

    public final void e(g8.d0 d0Var) {
        bf.b.t(!this.f86473v);
        this.f86455d = new v(d0Var, 3);
    }

    public final void f(q qVar) {
        bf.b.t(!this.f86473v);
        this.f86454c = new v(qVar, 4);
    }
}
