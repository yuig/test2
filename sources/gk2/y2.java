package gk2;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class y2 extends AtomicReference implements xp2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65705a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f65706b;

    public y2(xp2.b bVar) {
        this.f65705a = bVar;
    }

    @Override // xp2.c
    public final void cancel() {
        bk2.c.dispose(this);
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            this.f65706b = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != bk2.c.DISPOSED) {
            if (!this.f65706b) {
                lazySet(bk2.d.INSTANCE);
                this.f65705a.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
            } else {
                this.f65705a.c(0L);
                lazySet(bk2.d.INSTANCE);
                this.f65705a.a();
            }
        }
    }
}
