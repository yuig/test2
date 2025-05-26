package gk2;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class b3 extends uj2.b0 implements dk2.b {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.h f65339a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f65340b;

    public b3(f1 f1Var) {
        Callable asCallable = pk2.b.asCallable();
        this.f65339a = f1Var;
        this.f65340b = asCallable;
    }

    @Override // dk2.b
    public final uj2.h c() {
        return new w2(this.f65339a, this.f65340b, 2);
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        try {
            Object call = this.f65340b.call();
            ck2.i.b(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f65339a.l(new c1(d0Var, (Collection) call));
        } catch (Throwable th3) {
            bp1.h.H(th3);
            bk2.d.error(th3, d0Var);
        }
    }
}
