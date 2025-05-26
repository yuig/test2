package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class o1 extends AtomicReference implements xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76619a;

    public o1(uj2.v vVar, p1 p1Var) {
        this.f76619a = vVar;
        lazySet(p1Var);
    }

    @Override // xj2.c
    public final void dispose() {
        p1 p1Var = (p1) getAndSet(null);
        if (p1Var != null) {
            p1Var.d(this);
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == null;
    }
}
