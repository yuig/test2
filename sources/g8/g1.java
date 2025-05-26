package g8;

/* loaded from: classes3.dex */
public final class g1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public int f64269a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f64270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f64271c;

    public g1(i1 i1Var) {
        this.f64271c = i1Var;
    }

    public final void a() {
        if (this.f64270b) {
            return;
        }
        i1 i1Var = this.f64271c;
        i1Var.f64290e.b(a7.o0.j(i1Var.f64295j.f18765o), i1Var.f64295j, 0, null, 0L);
        this.f64270b = true;
    }

    @Override // g8.b1
    public final void b() {
        i1 i1Var = this.f64271c;
        if (i1Var.f64296k) {
            return;
        }
        i1Var.f64294i.b();
    }

    @Override // g8.b1
    public final int i(qq2.c cVar, k7.e eVar, int i13) {
        a();
        i1 i1Var = this.f64271c;
        boolean z13 = i1Var.f64297l;
        if (z13 && i1Var.f64298m == null) {
            this.f64269a = 2;
        }
        int i14 = this.f64269a;
        if (i14 == 2) {
            eVar.e(4);
            return -4;
        }
        if ((i13 & 2) != 0 || i14 == 0) {
            cVar.f104884c = i1Var.f64295j;
            this.f64269a = 1;
            return -5;
        }
        if (!z13) {
            return -3;
        }
        i1Var.f64298m.getClass();
        eVar.e(1);
        eVar.f78456g = 0L;
        if ((i13 & 4) == 0) {
            eVar.p(i1Var.f64299n);
            eVar.f78454e.put(i1Var.f64298m, 0, i1Var.f64299n);
        }
        if ((i13 & 1) == 0) {
            this.f64269a = 2;
        }
        return -4;
    }

    @Override // g8.b1
    public final boolean j() {
        return this.f64271c.f64297l;
    }

    @Override // g8.b1
    public final int o(long j13) {
        a();
        if (j13 <= 0 || this.f64269a == 2) {
            return 0;
        }
        this.f64269a = 2;
        return 1;
    }
}
