package j9;

import d7.d0;
import q8.t;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public f f75072a;

    /* renamed from: b, reason: collision with root package name */
    public long f75073b;

    /* renamed from: c, reason: collision with root package name */
    public long f75074c;

    /* renamed from: d, reason: collision with root package name */
    public int f75075d;

    /* renamed from: e, reason: collision with root package name */
    public int f75076e;

    /* renamed from: k, reason: collision with root package name */
    public boolean f75082k;

    /* renamed from: m, reason: collision with root package name */
    public q f75084m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f75086o;

    /* renamed from: p, reason: collision with root package name */
    public long f75087p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f75088q;

    /* renamed from: f, reason: collision with root package name */
    public long[] f75077f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    public int[] f75078g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f75079h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public long[] f75080i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    public boolean[] f75081j = new boolean[0];

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f75083l = new boolean[0];

    /* renamed from: n, reason: collision with root package name */
    public final d0 f75085n = new d0();

    public final void a(t tVar) {
        d0 d0Var = this.f75085n;
        tVar.readFully(d0Var.f53806a, 0, d0Var.f53808c);
        d0Var.K(0);
        this.f75086o = false;
    }

    public final boolean b(int i13) {
        return this.f75082k && this.f75083l[i13];
    }
}
