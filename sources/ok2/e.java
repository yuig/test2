package ok2;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class e extends AtomicInteger implements dk2.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f95470a;

    /* renamed from: b, reason: collision with root package name */
    public final xp2.b f95471b;

    public e(Object obj, xp2.b bVar) {
        this.f95471b = bVar;
        this.f95470a = obj;
    }

    @Override // xp2.c
    public final void cancel() {
        lazySet(2);
    }

    @Override // dk2.i
    public final void clear() {
        lazySet(1);
    }

    @Override // dk2.i
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // dk2.i
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // dk2.i
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f95470a;
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (g.validate(j13) && compareAndSet(0, 1)) {
            Object obj = this.f95470a;
            xp2.b bVar = this.f95471b;
            bVar.c(obj);
            if (get() != 2) {
                bVar.a();
            }
        }
    }

    @Override // dk2.e
    public final int requestFusion(int i13) {
        return 1;
    }
}
