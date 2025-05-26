package rk2;

import df.j1;
import java.util.concurrent.atomic.AtomicReference;
import uj2.v;

/* loaded from: classes2.dex */
public abstract class b implements v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f108504a = new AtomicReference();

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (j1.B1(this.f108504a, cVar, getClass())) {
            d();
        }
    }

    public void d() {
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this.f108504a);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f108504a.get() == bk2.c.DISPOSED;
    }
}
