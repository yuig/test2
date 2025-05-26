package g8;

/* loaded from: classes.dex */
public abstract class n1 extends j {

    /* renamed from: k, reason: collision with root package name */
    public final a f64356k;

    public n1(a aVar) {
        this.f64356k = aVar;
    }

    @Override // g8.j
    public final void A(Object obj, a aVar, a7.b1 b1Var) {
        D(b1Var);
    }

    public e0 C(e0 e0Var) {
        return e0Var;
    }

    public abstract void D(a7.b1 b1Var);

    public final void E() {
        B(null, this.f64356k);
    }

    public void F() {
        E();
    }

    @Override // g8.a
    public final a7.b1 i() {
        return this.f64356k.i();
    }

    @Override // g8.a
    public final a7.i0 j() {
        return this.f64356k.j();
    }

    @Override // g8.a
    public final boolean k() {
        return this.f64356k.k();
    }

    @Override // g8.a
    public final void n(g7.a0 a0Var) {
        this.f64302j = a0Var;
        this.f64301i = d7.n0.n(null);
        F();
    }

    @Override // g8.a
    public void w(a7.i0 i0Var) {
        this.f64356k.w(i0Var);
    }

    @Override // g8.j
    public final e0 x(Object obj, e0 e0Var) {
        return C(e0Var);
    }

    @Override // g8.j
    public final long y(Object obj, long j13) {
        return j13;
    }

    @Override // g8.j
    public final int z(int i13, Object obj) {
        return i13;
    }
}
