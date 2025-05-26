package gk2;

/* loaded from: classes4.dex */
public final class b1 extends uj2.h implements dk2.g {

    /* renamed from: b, reason: collision with root package name */
    public final Object f65337b;

    public b1(Object obj) {
        this.f65337b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f65337b;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        bVar.d(new ok2.e(this.f65337b, bVar));
    }
}
