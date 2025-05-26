package jk2;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class w0 extends uj2.q implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final Callable f76731a;

    public w0(Callable callable) {
        this.f76731a = callable;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        ek2.g gVar = new ek2.g(vVar);
        vVar.b(gVar);
        if (gVar.isDisposed()) {
            return;
        }
        try {
            Object call = this.f76731a.call();
            ck2.i.b(call, "Callable returned null");
            gVar.d(call);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            if (gVar.isDisposed()) {
                lb.l0.R0(th3);
            } else {
                vVar.onError(th3);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object call = this.f76731a.call();
        ck2.i.b(call, "The callable returned a null value");
        return call;
    }
}
