package fk2;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lb.l0;

/* loaded from: classes4.dex */
public final class t extends AtomicBoolean implements uj2.d {

    /* renamed from: a, reason: collision with root package name */
    public final xj2.b f62473a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.d f62474b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f62475c;

    public t(uj2.d dVar, xj2.b bVar, AtomicInteger atomicInteger) {
        this.f62474b = dVar;
        this.f62473a = bVar;
        this.f62475c = atomicInteger;
    }

    @Override // uj2.d
    public final void a() {
        if (this.f62475c.decrementAndGet() == 0 && compareAndSet(false, true)) {
            this.f62474b.a();
        }
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        this.f62473a.a(cVar);
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        this.f62473a.dispose();
        if (compareAndSet(false, true)) {
            this.f62474b.onError(th3);
        } else {
            l0.R0(th3);
        }
    }
}
