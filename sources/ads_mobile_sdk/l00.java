package ads_mobile_sdk;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class l00 {
    public a.o8 A;

    /* renamed from: a, reason: collision with root package name */
    public final i4 f7571a;

    /* renamed from: b, reason: collision with root package name */
    public final l00 f7572b = this;

    /* renamed from: c, reason: collision with root package name */
    public xv0 f7573c;

    /* renamed from: d, reason: collision with root package name */
    public a.o8 f7574d;

    /* renamed from: e, reason: collision with root package name */
    public xv0 f7575e;

    /* renamed from: f, reason: collision with root package name */
    public xv0 f7576f;

    /* renamed from: g, reason: collision with root package name */
    public a.o8 f7577g;

    /* renamed from: h, reason: collision with root package name */
    public qf2 f7578h;

    /* renamed from: i, reason: collision with root package name */
    public a.o8 f7579i;

    /* renamed from: j, reason: collision with root package name */
    public a.o8 f7580j;

    /* renamed from: k, reason: collision with root package name */
    public a.o8 f7581k;

    /* renamed from: l, reason: collision with root package name */
    public a.o8 f7582l;

    /* renamed from: m, reason: collision with root package name */
    public a.o8 f7583m;

    /* renamed from: n, reason: collision with root package name */
    public a.o8 f7584n;

    /* renamed from: o, reason: collision with root package name */
    public a.o8 f7585o;

    /* renamed from: p, reason: collision with root package name */
    public a.o8 f7586p;

    /* renamed from: q, reason: collision with root package name */
    public a.o8 f7587q;

    /* renamed from: r, reason: collision with root package name */
    public a.o8 f7588r;

    /* renamed from: s, reason: collision with root package name */
    public a.o8 f7589s;

    /* renamed from: t, reason: collision with root package name */
    public a.o8 f7590t;

    /* renamed from: u, reason: collision with root package name */
    public a.o8 f7591u;

    /* renamed from: v, reason: collision with root package name */
    public a.o8 f7592v;

    /* renamed from: w, reason: collision with root package name */
    public a.o8 f7593w;

    /* renamed from: x, reason: collision with root package name */
    public a.o8 f7594x;

    /* renamed from: y, reason: collision with root package name */
    public a.o8 f7595y;

    /* renamed from: z, reason: collision with root package name */
    public a.o8 f7596z;

    public l00(a.f3 f3Var, ExecutorService executorService, Context context, i4 i4Var) {
        this.f7571a = i4Var;
        a(f3Var, executorService, context, i4Var);
        g();
    }

    public final void a(a.f3 f3Var, ExecutorService executorService, Context context, i4 i4Var) {
        this.f7573c = xv0.a(context);
        a.o8 o8Var = a.l9.f89j;
        Object obj = u90.f11887c;
        if (!(o8Var instanceof u90)) {
            o8Var = new u90(o8Var);
        }
        this.f7574d = o8Var;
        this.f7575e = xv0.a(executorService);
        xv0 a13 = xv0.a(i4Var);
        this.f7576f = a13;
        a.o8 d4Var = new d4(this.f7575e, a13);
        a.o8 y71Var = new y71(this.f7573c, this.f7574d, this.f7575e, d4Var instanceof u90 ? d4Var : new u90(d4Var), this.f7576f);
        if (!(y71Var instanceof u90)) {
            y71Var = new u90(y71Var);
        }
        this.f7577g = y71Var;
        int i13 = qf2.f10067c;
        List f13 = a.l9.f(1);
        List f14 = a.l9.f(0);
        a.o8 o8Var2 = this.f7577g;
        boolean z13 = pf2.f9667c;
        if (!z13 && o8Var2 == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        f13.add(o8Var2);
        if (!z13 && a.l9.d(f13)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        if (!z13 && a.l9.d(f14)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        this.f7578h = new qf2(f13, f14);
        a.o8 hl2Var = new hl2(f3Var, new j00(this));
        if (!(hl2Var instanceof u90)) {
            hl2Var = new u90(hl2Var);
        }
        this.f7579i = hl2Var;
        a.o8 gl2Var = new gl2(f3Var, new k00(this));
        if (!(gl2Var instanceof u90)) {
            gl2Var = new u90(gl2Var);
        }
        this.f7580j = gl2Var;
        a.o8 il2Var = new il2(f3Var);
        if (!(il2Var instanceof u90)) {
            il2Var = new u90(il2Var);
        }
        this.f7581k = il2Var;
        a.o8 o8Var3 = a.bb.f16g;
        if (!(o8Var3 instanceof u90)) {
            o8Var3 = new u90(o8Var3);
        }
        this.f7582l = o8Var3;
        a.o8 ct2Var = new ct2(o8Var3, this.f7577g);
        if (!(ct2Var instanceof u90)) {
            ct2Var = new u90(ct2Var);
        }
        this.f7583m = ct2Var;
        a.o8 ml2Var = new ml2(this.f7579i, this.f7580j, this.f7581k, ct2Var);
        a.o8 pl2Var = new pl2(this.f7576f, ml2Var instanceof u90 ? ml2Var : new u90(ml2Var), this.f7577g, this.f7575e, this.f7583m);
        if (!(pl2Var instanceof u90)) {
            pl2Var = new u90(pl2Var);
        }
        this.f7584n = pl2Var;
        List f15 = a.l9.f(1);
        List f16 = a.l9.f(0);
        a.o8 o8Var4 = this.f7584n;
        if (!z13 && o8Var4 == null) {
            throw new AssertionError("Codegen error? Null provider");
        }
        f15.add(o8Var4);
        if (!z13 && a.l9.d(f15)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        if (!z13 && a.l9.d(f16)) {
            throw new AssertionError("Codegen error?  Duplicates in the provider list");
        }
        a.o8 bs0Var = new bs0(this.f7578h, new qf2(f15, f16), this.f7583m);
        if (!(bs0Var instanceof u90)) {
            bs0Var = new u90(bs0Var);
        }
        this.f7585o = bs0Var;
        a.o8 o8Var5 = a.bb.f19j;
        if (!(o8Var5 instanceof u90)) {
            o8Var5 = new u90(o8Var5);
        }
        this.f7586p = o8Var5;
        a.o8 cz2Var = new cz2(this.f7573c, this.f7582l, this.f7575e);
        if (!(cz2Var instanceof u90)) {
            cz2Var = new u90(cz2Var);
        }
        this.f7587q = cz2Var;
        a.o8 ko1Var = new ko1(this.f7573c);
        if (!(ko1Var instanceof u90)) {
            ko1Var = new u90(ko1Var);
        }
        this.f7588r = ko1Var;
        a.o8 gr2Var = new gr2(this.f7582l);
        if (!(gr2Var instanceof u90)) {
            gr2Var = new u90(gr2Var);
        }
        this.f7589s = gr2Var;
        a.o8 lx2Var = new lx2(this.f7573c);
        if (!(lx2Var instanceof u90)) {
            lx2Var = new u90(lx2Var);
        }
        this.f7590t = lx2Var;
        a.o8 e4Var = new e4(this.f7575e);
        if (!(e4Var instanceof u90)) {
            e4Var = new u90(e4Var);
        }
        this.f7591u = e4Var;
        a.o8 kdVar = new kd(this.f7573c, this.f7583m, this.f7576f, e4Var);
        if (!(kdVar instanceof u90)) {
            kdVar = new u90(kdVar);
        }
        this.f7592v = kdVar;
    }

    public final a.n5 b() {
        return u90.a(this.f7596z);
    }

    public final i4 c() {
        return this.f7571a;
    }

    public final ol2 d() {
        return (ol2) this.f7584n.get();
    }

    public final bn2 e() {
        return (bn2) this.f7594x.get();
    }

    public final bt2 f() {
        return (bt2) this.f7583m.get();
    }

    public final void g() {
        a.o8 fj0Var = new fj0(this.f7573c, this.f7583m, this.f7591u, this.f7576f);
        Object obj = u90.f11887c;
        if (!(fj0Var instanceof u90)) {
            fj0Var = new u90(fj0Var);
        }
        this.f7593w = fj0Var;
        int i13 = qf2.f10067c;
        a.o8 cn2Var = new cn2(this.f7586p, new pf2(7).a(this.f7586p).a(this.f7587q).a(this.f7588r).a(this.f7589s).a(this.f7590t).a(this.f7592v).a(this.f7593w).a());
        if (!(cn2Var instanceof u90)) {
            cn2Var = new u90(cn2Var);
        }
        this.f7594x = cn2Var;
        a.o8 bVar = new b(this.f7583m);
        if (!(bVar instanceof u90)) {
            bVar = new u90(bVar);
        }
        this.f7595y = bVar;
        a.o8 eb1Var = new eb1(this.f7573c, this.f7583m, bVar, this.f7576f);
        if (!(eb1Var instanceof u90)) {
            eb1Var = new u90(eb1Var);
        }
        this.f7596z = eb1Var;
        a.o8 c4Var = new c4(this.f7573c);
        if (!(c4Var instanceof u90)) {
            c4Var = new u90(c4Var);
        }
        this.A = c4Var;
    }

    public final as0 a() {
        return (as0) this.f7585o.get();
    }
}
