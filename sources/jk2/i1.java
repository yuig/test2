package jk2;

/* loaded from: classes2.dex */
public final class i1 extends uj2.q implements dk2.g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f76504a;

    public i1(Object obj) {
        this.f76504a = obj;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        a2 a2Var = new a2(this.f76504a, vVar);
        vVar.b(a2Var);
        a2Var.run();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f76504a;
    }
}
