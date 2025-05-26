package s3;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final p f110875a = new p();

    /* renamed from: b, reason: collision with root package name */
    public final p f110876b = new p();

    public final void a(k0 k0Var, boolean z13) {
        p pVar = this.f110876b;
        p pVar2 = this.f110875a;
        if (z13) {
            pVar2.a(k0Var);
            pVar.a(k0Var);
        } else {
            if (pVar2.b(k0Var)) {
                return;
            }
            pVar.a(k0Var);
        }
    }

    public final boolean b(k0 k0Var, boolean z13) {
        boolean b13 = this.f110875a.b(k0Var);
        return z13 ? b13 : b13 || this.f110876b.b(k0Var);
    }

    public final boolean c() {
        return !(this.f110876b.f110861c.isEmpty() && this.f110875a.f110861c.isEmpty());
    }
}
