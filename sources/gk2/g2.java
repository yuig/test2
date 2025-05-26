package gk2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g2 extends AtomicInteger implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.a f65418a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f65419b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f65420c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    public j2 f65421d;

    public g2(uj2.h hVar) {
        this.f65418a = hVar;
    }

    @Override // xp2.b
    public final void a() {
        this.f65421d.cancel();
        this.f65421d.f65471i.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.f65419b.get() != ok2.g.CANCELLED) {
                this.f65418a.b(this.f65421d);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // xp2.c
    public final void cancel() {
        ok2.g.cancel(this.f65419b);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        ok2.g.deferredSetOnce(this.f65419b, this.f65420c, cVar);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f65421d.cancel();
        this.f65421d.f65471i.onError(th3);
    }

    @Override // xp2.c
    public final void request(long j13) {
        ok2.g.deferredRequest(this.f65419b, this.f65420c, j13);
    }
}
