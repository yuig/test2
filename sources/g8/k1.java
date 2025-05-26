package g8;

/* loaded from: classes3.dex */
public final class k1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f64327a;

    /* renamed from: b, reason: collision with root package name */
    public final long f64328b;

    public k1(b1 b1Var, long j13) {
        this.f64327a = b1Var;
        this.f64328b = j13;
    }

    @Override // g8.b1
    public final void b() {
        this.f64327a.b();
    }

    @Override // g8.b1
    public final int i(qq2.c cVar, k7.e eVar, int i13) {
        int i14 = this.f64327a.i(cVar, eVar, i13);
        if (i14 == -4) {
            eVar.f78456g += this.f64328b;
        }
        return i14;
    }

    @Override // g8.b1
    public final boolean j() {
        return this.f64327a.j();
    }

    @Override // g8.b1
    public final int o(long j13) {
        return this.f64327a.o(j13 - this.f64328b);
    }
}
