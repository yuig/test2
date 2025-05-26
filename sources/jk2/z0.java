package jk2;

/* loaded from: classes2.dex */
public final class z0 implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76779a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f76780b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f76781c;

    public /* synthetic */ z0(Object obj, int i13) {
        this.f76779a = i13;
        this.f76781c = obj;
    }

    @Override // uj2.v
    public final void a() {
        int i13 = this.f76779a;
        Object obj = this.f76781c;
        switch (i13) {
            case 0:
                ((uj2.v) obj).a();
                break;
            default:
                ((uj2.d) obj).a();
                break;
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        int i13 = this.f76779a;
        Object obj = this.f76781c;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f76780b, cVar)) {
                    this.f76780b = cVar;
                    ((uj2.v) obj).b(this);
                    break;
                }
                break;
            default:
                this.f76780b = cVar;
                ((uj2.d) obj).b(this);
                break;
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        switch (this.f76779a) {
            case 0:
                ((uj2.v) this.f76781c).c(obj);
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f76779a) {
            case 0:
                this.f76780b.dispose();
                break;
            default:
                this.f76780b.dispose();
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f76779a) {
        }
        return this.f76780b.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        int i13 = this.f76779a;
        Object obj = this.f76781c;
        switch (i13) {
            case 0:
                ((uj2.v) obj).onError(th3);
                break;
            default:
                ((uj2.d) obj).onError(th3);
                break;
        }
    }
}
