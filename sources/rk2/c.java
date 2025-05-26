package rk2;

import df.j1;
import java.util.concurrent.atomic.AtomicReference;
import uj2.d0;

/* loaded from: classes4.dex */
public abstract class c implements d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f108505a = new AtomicReference();

    public void a() {
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (j1.B1(this.f108505a, cVar, getClass())) {
            a();
        }
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this.f108505a);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f108505a.get() == bk2.c.DISPOSED;
    }
}
