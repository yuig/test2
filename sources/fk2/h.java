package fk2;

import java.util.concurrent.Callable;
import lb.l0;

/* loaded from: classes4.dex */
public final class h extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62440a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f62441b;

    public h(Callable callable, int i13) {
        this.f62440a = i13;
        this.f62441b = callable;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        int i13 = this.f62440a;
        Callable callable = this.f62441b;
        switch (i13) {
            case 0:
                try {
                    Object call = callable.call();
                    ck2.i.b(call, "The completableSupplier returned a null CompletableSource");
                    ((uj2.b) ((uj2.f) call)).j(dVar);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    bk2.d.error(th3, dVar);
                    return;
                }
            case 1:
                try {
                    Object call2 = callable.call();
                    ck2.i.b(call2, "The error returned is null");
                    th = (Throwable) call2;
                } catch (Throwable th4) {
                    th = th4;
                    bp1.h.H(th);
                }
                bk2.d.error(th, dVar);
                break;
            default:
                xj2.e eVar = new xj2.e(ck2.i.f27922b);
                dVar.b(eVar);
                try {
                    callable.call();
                    if (!eVar.isDisposed()) {
                        dVar.a();
                        break;
                    }
                } catch (Throwable th5) {
                    bp1.h.H(th5);
                    if (eVar.isDisposed()) {
                        l0.R0(th5);
                    } else {
                        dVar.onError(th5);
                        return;
                    }
                }
                break;
        }
    }
}
