package xj2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f135164a = new AtomicReference();

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this.f135164a);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((c) this.f135164a.get());
    }
}
