package hk2;

import java.util.concurrent.Callable;
import lb.l0;

/* loaded from: classes2.dex */
public final class p extends uj2.l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final Callable f69431a;

    public p(Callable callable) {
        this.f69431a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f69431a.call();
    }

    @Override // uj2.l
    public final void g(uj2.m mVar) {
        xj2.e eVar = new xj2.e(ck2.i.f27922b);
        mVar.b(eVar);
        if (eVar.isDisposed()) {
            return;
        }
        try {
            Object call = this.f69431a.call();
            if (eVar.isDisposed()) {
                return;
            }
            if (call == null) {
                mVar.a();
            } else {
                mVar.onSuccess(call);
            }
        } catch (Throwable th3) {
            bp1.h.H(th3);
            if (eVar.isDisposed()) {
                l0.R0(th3);
            } else {
                mVar.onError(th3);
            }
        }
    }
}
