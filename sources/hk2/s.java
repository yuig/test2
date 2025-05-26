package hk2;

/* loaded from: classes4.dex */
public final class s implements uj2.m, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69436a;

    /* renamed from: b, reason: collision with root package name */
    public xj2.c f69437b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f69438c;

    public /* synthetic */ s(Object obj, int i13) {
        this.f69436a = i13;
        this.f69438c = obj;
    }

    @Override // uj2.m
    public final void a() {
        int i13 = this.f69436a;
        Object obj = this.f69438c;
        switch (i13) {
            case 0:
                this.f69437b = bk2.c.DISPOSED;
                ((uj2.m) obj).a();
                break;
            default:
                this.f69437b = bk2.c.DISPOSED;
                ((uj2.d) obj).a();
                break;
        }
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        int i13 = this.f69436a;
        Object obj = this.f69438c;
        switch (i13) {
            case 0:
                if (bk2.c.validate(this.f69437b, cVar)) {
                    this.f69437b = cVar;
                    ((uj2.m) obj).b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.validate(this.f69437b, cVar)) {
                    this.f69437b = cVar;
                    ((uj2.d) obj).b(this);
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f69436a) {
            case 0:
                this.f69437b.dispose();
                this.f69437b = bk2.c.DISPOSED;
                break;
            default:
                this.f69437b.dispose();
                this.f69437b = bk2.c.DISPOSED;
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f69436a) {
        }
        return this.f69437b.isDisposed();
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        int i13 = this.f69436a;
        Object obj = this.f69438c;
        switch (i13) {
            case 0:
                this.f69437b = bk2.c.DISPOSED;
                ((uj2.m) obj).onError(th3);
                break;
            default:
                this.f69437b = bk2.c.DISPOSED;
                ((uj2.d) obj).onError(th3);
                break;
        }
    }

    @Override // uj2.m
    public final void onSuccess(Object obj) {
        int i13 = this.f69436a;
        Object obj2 = this.f69438c;
        switch (i13) {
            case 0:
                this.f69437b = bk2.c.DISPOSED;
                ((uj2.m) obj2).a();
                break;
            default:
                this.f69437b = bk2.c.DISPOSED;
                ((uj2.d) obj2).a();
                break;
        }
    }
}
