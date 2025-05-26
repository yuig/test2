package fk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b extends AtomicReference implements uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62411a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62412b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f62413c;

    public /* synthetic */ b(int i13, Object obj, Object obj2) {
        this.f62411a = i13;
        this.f62412b = obj;
        this.f62413c = obj2;
    }

    @Override // uj2.d
    public final void a() {
        int i13 = this.f62411a;
        Object obj = this.f62412b;
        Object obj2 = this.f62413c;
        switch (i13) {
            case 0:
                ((uj2.b) ((uj2.f) obj2)).j(new a(this, (uj2.d) obj, 0));
                break;
            default:
                ((uj2.b0) ((uj2.f0) obj2)).p(new ek2.k(this, (uj2.d0) obj, 0));
                break;
        }
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        int i13 = this.f62411a;
        Object obj = this.f62412b;
        switch (i13) {
            case 0:
                if (bk2.c.setOnce(this, cVar)) {
                    ((uj2.d) obj).b(this);
                    break;
                }
                break;
            default:
                if (bk2.c.setOnce(this, cVar)) {
                    ((uj2.d0) obj).b(this);
                    break;
                }
                break;
        }
    }

    @Override // xj2.c
    public final void dispose() {
        switch (this.f62411a) {
            case 0:
                bk2.c.dispose(this);
                break;
            default:
                bk2.c.dispose(this);
                break;
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        switch (this.f62411a) {
        }
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        int i13 = this.f62411a;
        Object obj = this.f62412b;
        switch (i13) {
            case 0:
                ((uj2.d) obj).onError(th3);
                break;
            default:
                ((uj2.d0) obj).onError(th3);
                break;
        }
    }
}
