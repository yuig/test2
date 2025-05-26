package q8;

import a7.o0;

/* loaded from: classes3.dex */
public final class g0 implements s {

    /* renamed from: a, reason: collision with root package name */
    public final int f102923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102924b;

    /* renamed from: c, reason: collision with root package name */
    public final String f102925c;

    /* renamed from: d, reason: collision with root package name */
    public int f102926d;

    /* renamed from: e, reason: collision with root package name */
    public int f102927e;

    /* renamed from: f, reason: collision with root package name */
    public u f102928f;

    /* renamed from: g, reason: collision with root package name */
    public k0 f102929g;

    public g0(int i13, int i14, String str) {
        this.f102923a = i13;
        this.f102924b = i14;
        this.f102925c = str;
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        if (j13 == 0 || this.f102927e == 1) {
            this.f102927e = 1;
            this.f102926d = 0;
        }
    }

    @Override // q8.s
    public final int d(t tVar, c0 c0Var) {
        int i13 = this.f102927e;
        if (i13 != 1) {
            if (i13 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        k0 k0Var = this.f102929g;
        k0Var.getClass();
        int e13 = k0Var.e(tVar, 1024, true);
        if (e13 == -1) {
            this.f102927e = 2;
            this.f102929g.a(0L, 1, this.f102926d, 0, null);
            this.f102926d = 0;
        } else {
            this.f102926d += e13;
        }
        return 0;
    }

    @Override // q8.s
    public final void f(u uVar) {
        this.f102928f = uVar;
        k0 D = uVar.D(1024, 4);
        this.f102929g = D;
        a7.q qVar = new a7.q();
        String str = this.f102925c;
        qVar.f1180m = o0.r(str);
        qVar.f1181n = o0.r(str);
        D.b(new androidx.media3.common.b(qVar));
        this.f102928f.A();
        this.f102928f.j(new h0());
        this.f102927e = 1;
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        int i13 = this.f102924b;
        int i14 = this.f102923a;
        bf.b.t((i14 == -1 || i13 == -1) ? false : true);
        d7.d0 d0Var = new d7.d0(i13);
        tVar.s(d0Var.f53806a, 0, i13);
        return d0Var.E() == i14;
    }
}
