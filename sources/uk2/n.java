package uk2;

import java.util.concurrent.atomic.AtomicReference;
import uj2.d0;

/* loaded from: classes4.dex */
public final class n extends AtomicReference implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f122437a;

    public n(d0 d0Var, o oVar) {
        this.f122437a = d0Var;
        lazySet(oVar);
    }

    @Override // xj2.c
    public final void dispose() {
        o oVar = (o) getAndSet(null);
        if (oVar != null) {
            oVar.w(this);
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == null;
    }
}
