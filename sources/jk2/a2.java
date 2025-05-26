package jk2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class a2 extends AtomicInteger implements dk2.d, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76387a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f76388b;

    public a2(Object obj, uj2.v vVar) {
        this.f76387a = vVar;
        this.f76388b = obj;
    }

    @Override // dk2.i
    public final void clear() {
        lazySet(3);
    }

    @Override // xj2.c
    public final void dispose() {
        set(3);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return get() == 3;
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // dk2.i
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // dk2.i
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f76388b;
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        lazySet(1);
        return 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.f76388b;
            uj2.v vVar = this.f76387a;
            vVar.c(obj);
            if (get() == 2) {
                lazySet(3);
                vVar.a();
            }
        }
    }
}
