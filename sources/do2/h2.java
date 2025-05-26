package do2;

/* loaded from: classes2.dex */
public final class h2 extends eo2.c {

    /* renamed from: a, reason: collision with root package name */
    public long f55811a;

    /* renamed from: b, reason: collision with root package name */
    public ao2.o f55812b;

    @Override // eo2.c
    public final boolean a(eo2.a aVar) {
        f2 f2Var = (f2) aVar;
        if (this.f55811a >= 0) {
            return false;
        }
        long j13 = f2Var.f55788i;
        if (j13 < f2Var.f55789j) {
            f2Var.f55789j = j13;
        }
        this.f55811a = j13;
        return true;
    }

    @Override // eo2.c
    public final bl2.c[] b(eo2.a aVar) {
        long j13 = this.f55811a;
        this.f55811a = -1L;
        this.f55812b = null;
        return ((f2) aVar).v(j13);
    }
}
