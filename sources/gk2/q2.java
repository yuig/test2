package gk2;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class q2 extends AtomicReference implements uj2.k, xp2.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65590a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.z f65591b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f65592c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f65593d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65594e;

    /* renamed from: f, reason: collision with root package name */
    public xp2.a f65595f;

    public q2(xp2.b bVar, uj2.z zVar, uj2.h hVar, boolean z13) {
        this.f65590a = bVar;
        this.f65591b = zVar;
        this.f65595f = hVar;
        this.f65594e = !z13;
    }

    @Override // xp2.b
    public final void a() {
        this.f65590a.a();
        this.f65591b.dispose();
    }

    public final void b(long j13, xp2.c cVar) {
        if (this.f65594e || Thread.currentThread() == get()) {
            cVar.request(j13);
        } else {
            this.f65591b.b(new oi.j0(cVar, j13, 4));
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f65590a.c(obj);
    }

    @Override // xp2.c
    public final void cancel() {
        ok2.g.cancel(this.f65592c);
        this.f65591b.dispose();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.setOnce(this.f65592c, cVar)) {
            long andSet = this.f65593d.getAndSet(0L);
            if (andSet != 0) {
                b(andSet, cVar);
            }
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        this.f65590a.onError(th3);
        this.f65591b.dispose();
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            AtomicReference atomicReference = this.f65592c;
            xp2.c cVar = (xp2.c) atomicReference.get();
            if (cVar != null) {
                b(j13, cVar);
                return;
            }
            AtomicLong atomicLong = this.f65593d;
            d7.b.e(atomicLong, j13);
            xp2.c cVar2 = (xp2.c) atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    b(andSet, cVar2);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        xp2.a aVar = this.f65595f;
        this.f65595f = null;
        aVar.b(this);
    }
}
