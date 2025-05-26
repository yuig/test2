package nk2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ok2.g;
import uj2.k;

/* loaded from: classes2.dex */
public final class e extends AtomicInteger implements k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f91198a;

    /* renamed from: b, reason: collision with root package name */
    public final pk2.c f91199b = new pk2.c();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f91200c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f91201d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f91202e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f91203f;

    public e(xp2.b bVar) {
        this.f91198a = bVar;
    }

    @Override // xp2.b
    public final void a() {
        this.f91203f = true;
        dl2.b.f2(this.f91198a, this, this.f91199b);
    }

    @Override // xp2.b
    public final void c(Object obj) {
        dl2.b.j2(this.f91198a, obj, this, this.f91199b);
    }

    @Override // xp2.c
    public final void cancel() {
        if (this.f91203f) {
            return;
        }
        g.cancel(this.f91201d);
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (this.f91202e.compareAndSet(false, true)) {
            this.f91198a.d(this);
            g.deferredSetOnce(this.f91201d, this.f91200c, cVar);
        } else {
            cVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f91203f = true;
        dl2.b.h2(this.f91198a, th3, this, this.f91199b);
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (j13 > 0) {
            g.deferredRequest(this.f91201d, this.f91200c, j13);
        } else {
            cancel();
            onError(new IllegalArgumentException(a.a.g("§3.9 violated: positive request amount required but it was ", j13)));
        }
    }
}
