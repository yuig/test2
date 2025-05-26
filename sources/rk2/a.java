package rk2;

import df.j1;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public abstract class a implements uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f108503a = new AtomicReference();

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        if (j1.B1(this.f108503a, cVar, getClass())) {
            c();
        }
    }

    public void c() {
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this.f108503a);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f108503a.get() == bk2.c.DISPOSED;
    }
}
