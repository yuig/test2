package sf;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public f0.h f112448f;

    /* renamed from: l, reason: collision with root package name */
    public int f112454l;

    /* renamed from: m, reason: collision with root package name */
    public int f112455m;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f112461s;

    /* renamed from: g, reason: collision with root package name */
    public final int f112449g = -7829368;

    /* renamed from: h, reason: collision with root package name */
    public final float f112450h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f112451i = -7829368;

    /* renamed from: j, reason: collision with root package name */
    public final float f112452j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float[] f112453k = new float[0];

    /* renamed from: n, reason: collision with root package name */
    public int f112456n = 6;

    /* renamed from: o, reason: collision with root package name */
    public boolean f112457o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f112458p = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f112459q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f112460r = true;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f112462t = true;

    /* renamed from: u, reason: collision with root package name */
    public float f112463u = 0.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f112464v = 0.0f;

    /* renamed from: w, reason: collision with root package name */
    public boolean f112465w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f112466x = false;

    /* renamed from: y, reason: collision with root package name */
    public float f112467y = 0.0f;

    /* renamed from: z, reason: collision with root package name */
    public float f112468z = 0.0f;
    public float A = 0.0f;

    public a() {
        this.f112472d = ag.i.c(10.0f);
        this.f112470b = ag.i.c(5.0f);
        this.f112471c = ag.i.c(5.0f);
        this.f112461s = new ArrayList();
    }

    public final String d(int i13) {
        return (i13 < 0 || i13 >= this.f112453k.length) ? "" : f().E(this.f112453k[i13]);
    }

    public final String e() {
        String str = "";
        for (int i13 = 0; i13 < this.f112453k.length; i13++) {
            String d2 = d(i13);
            if (d2 != null && str.length() < d2.length()) {
                str = d2;
            }
        }
        return str;
    }

    public final f0.h f() {
        f0.h hVar = this.f112448f;
        if (hVar == null || ((hVar instanceof uf.a) && ((uf.a) hVar).f122085c != this.f112455m)) {
            this.f112448f = new uf.a(this.f112455m);
        }
        return this.f112448f;
    }

    public final void g(int i13) {
        this.f112451i = i13;
    }

    public final void h(float f13) {
        this.f112466x = true;
        this.f112467y = f13;
        this.A = Math.abs(f13 - this.f112468z);
    }

    public final void i() {
        this.f112465w = true;
        this.f112468z = 0.0f;
        this.A = Math.abs(this.f112467y - 0.0f);
    }

    public final void j() {
        this.f112459q = false;
    }

    public final void k() {
        this.f112458p = false;
    }

    public final void l(int i13) {
        if (i13 > 25) {
            i13 = 25;
        }
        if (i13 < 2) {
            i13 = 2;
        }
        this.f112456n = i13;
        this.f112457o = true;
    }

    public final void m() {
        this.f112464v = 10.0f;
    }

    public final void n() {
        this.f112463u = 10.0f;
    }

    public final void o(f0.h hVar) {
        if (hVar == null) {
            this.f112448f = new uf.a(this.f112455m);
        } else {
            this.f112448f = hVar;
        }
    }
}
