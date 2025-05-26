package je;

import java.util.List;

/* loaded from: classes3.dex */
public final class j1 implements Cloneable {
    public Boolean A;
    public Boolean B;
    public s1 C;
    public Float D;
    public String E;
    public a1 F;
    public String G;
    public s1 H;
    public Float I;

    /* renamed from: J, reason: collision with root package name */
    public s1 f75641J;
    public Float K;
    public i1 L;
    public e1 M;

    /* renamed from: a, reason: collision with root package name */
    public long f75642a = 0;

    /* renamed from: b, reason: collision with root package name */
    public s1 f75643b;

    /* renamed from: c, reason: collision with root package name */
    public a1 f75644c;

    /* renamed from: d, reason: collision with root package name */
    public Float f75645d;

    /* renamed from: e, reason: collision with root package name */
    public s1 f75646e;

    /* renamed from: f, reason: collision with root package name */
    public Float f75647f;

    /* renamed from: g, reason: collision with root package name */
    public m0 f75648g;

    /* renamed from: h, reason: collision with root package name */
    public c1 f75649h;

    /* renamed from: i, reason: collision with root package name */
    public d1 f75650i;

    /* renamed from: j, reason: collision with root package name */
    public Float f75651j;

    /* renamed from: k, reason: collision with root package name */
    public m0[] f75652k;

    /* renamed from: l, reason: collision with root package name */
    public m0 f75653l;

    /* renamed from: m, reason: collision with root package name */
    public Float f75654m;

    /* renamed from: n, reason: collision with root package name */
    public c0 f75655n;

    /* renamed from: o, reason: collision with root package name */
    public List f75656o;

    /* renamed from: p, reason: collision with root package name */
    public m0 f75657p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f75658q;

    /* renamed from: r, reason: collision with root package name */
    public b1 f75659r;

    /* renamed from: s, reason: collision with root package name */
    public g1 f75660s;

    /* renamed from: t, reason: collision with root package name */
    public h1 f75661t;

    /* renamed from: u, reason: collision with root package name */
    public f1 f75662u;

    /* renamed from: v, reason: collision with root package name */
    public Boolean f75663v;

    /* renamed from: w, reason: collision with root package name */
    public m.h f75664w;

    /* renamed from: x, reason: collision with root package name */
    public String f75665x;

    /* renamed from: y, reason: collision with root package name */
    public String f75666y;

    /* renamed from: z, reason: collision with root package name */
    public String f75667z;

    public static j1 a() {
        j1 j1Var = new j1();
        j1Var.f75642a = -1L;
        c0 c0Var = c0.f75566b;
        j1Var.f75643b = c0Var;
        a1 a1Var = a1.NonZero;
        j1Var.f75644c = a1Var;
        Float valueOf = Float.valueOf(1.0f);
        j1Var.f75645d = valueOf;
        j1Var.f75646e = null;
        j1Var.f75647f = valueOf;
        j1Var.f75648g = new m0(1.0f);
        j1Var.f75649h = c1.Butt;
        j1Var.f75650i = d1.Miter;
        j1Var.f75651j = Float.valueOf(4.0f);
        j1Var.f75652k = null;
        j1Var.f75653l = new m0(0.0f);
        j1Var.f75654m = valueOf;
        j1Var.f75655n = c0Var;
        j1Var.f75656o = null;
        j1Var.f75657p = new m0(12.0f, g2.pt);
        j1Var.f75658q = 400;
        j1Var.f75659r = b1.Normal;
        j1Var.f75660s = g1.None;
        j1Var.f75661t = h1.LTR;
        j1Var.f75662u = f1.Start;
        Boolean bool = Boolean.TRUE;
        j1Var.f75663v = bool;
        j1Var.f75664w = null;
        j1Var.f75665x = null;
        j1Var.f75666y = null;
        j1Var.f75667z = null;
        j1Var.A = bool;
        j1Var.B = bool;
        j1Var.C = c0Var;
        j1Var.D = valueOf;
        j1Var.E = null;
        j1Var.F = a1Var;
        j1Var.G = null;
        j1Var.H = null;
        j1Var.I = valueOf;
        j1Var.f75641J = null;
        j1Var.K = valueOf;
        j1Var.L = i1.None;
        j1Var.M = e1.auto;
        return j1Var;
    }

    public final Object clone() {
        j1 j1Var = (j1) super.clone();
        m0[] m0VarArr = this.f75652k;
        if (m0VarArr != null) {
            j1Var.f75652k = (m0[]) m0VarArr.clone();
        }
        return j1Var;
    }
}
