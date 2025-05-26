package kk2;

import java.util.concurrent.Callable;
import lb.l0;

/* loaded from: classes2.dex */
public final class k extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79955a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f79956b;

    public k(Callable callable, int i13) {
        this.f79955a = i13;
        this.f79956b = callable;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f79955a;
        Callable callable = this.f79956b;
        switch (i13) {
            case 0:
                try {
                    Object call = callable.call();
                    ck2.i.b(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = (Throwable) call;
                } catch (Throwable th3) {
                    th = th3;
                    bp1.h.H(th);
                }
                bk2.d.error(th, d0Var);
                break;
            default:
                xj2.e eVar = new xj2.e(ck2.i.f27922b);
                d0Var.b(eVar);
                if (!eVar.isDisposed()) {
                    try {
                        Object call2 = callable.call();
                        ck2.i.b(call2, "The callable returned a null value");
                        if (!eVar.isDisposed()) {
                            d0Var.onSuccess(call2);
                            break;
                        }
                    } catch (Throwable th4) {
                        bp1.h.H(th4);
                        if (eVar.isDisposed()) {
                            l0.R0(th4);
                        } else {
                            d0Var.onError(th4);
                            return;
                        }
                    }
                }
                break;
        }
    }
}
