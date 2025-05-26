package hk2;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class c extends uj2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69394a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f69395b;

    public c(Callable callable, int i13) {
        this.f69394a = i13;
        this.f69395b = callable;
    }

    @Override // uj2.l
    public final void g(uj2.m mVar) {
        int i13 = this.f69394a;
        Callable callable = this.f69395b;
        switch (i13) {
            case 0:
                try {
                    Object call = callable.call();
                    ck2.i.b(call, "The maybeSupplier returned a null MaybeSource");
                    ((uj2.l) ((uj2.n) call)).f(mVar);
                    break;
                } catch (Throwable th3) {
                    bp1.h.H(th3);
                    bk2.d.error(th3, mVar);
                    return;
                }
            default:
                mVar.b(bk2.d.INSTANCE);
                try {
                    Object call2 = callable.call();
                    ck2.i.b(call2, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = (Throwable) call2;
                } catch (Throwable th4) {
                    th = th4;
                    bp1.h.H(th);
                }
                mVar.onError(th);
                break;
        }
    }
}
