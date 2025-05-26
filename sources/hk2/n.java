package hk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class n implements uj2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69425a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.d0 f69426b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f69427c;

    public n(uj2.d0 d0Var, AtomicReference atomicReference) {
        this.f69426b = d0Var;
        this.f69427c = atomicReference;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        int i13 = this.f69425a;
        AtomicReference atomicReference = this.f69427c;
        switch (i13) {
            case 0:
                bk2.c.replace(atomicReference, cVar);
                break;
            default:
                bk2.c.setOnce(atomicReference, cVar);
                break;
        }
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        int i13 = this.f69425a;
        uj2.d0 d0Var = this.f69426b;
        switch (i13) {
            case 0:
                d0Var.onError(th3);
                break;
            default:
                d0Var.onError(th3);
                break;
        }
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        int i13 = this.f69425a;
        uj2.d0 d0Var = this.f69426b;
        switch (i13) {
            case 0:
                d0Var.onSuccess(obj);
                break;
            default:
                d0Var.onSuccess(obj);
                break;
        }
    }

    public n(AtomicReference atomicReference, uj2.d0 d0Var) {
        this.f69427c = atomicReference;
        this.f69426b = d0Var;
    }
}
