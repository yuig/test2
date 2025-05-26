package fk2;

import java.util.concurrent.atomic.AtomicInteger;
import lb.l0;

/* loaded from: classes4.dex */
public final class k extends AtomicInteger implements uj2.d, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.d f62453a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.a f62454b;

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f62455c;

    public k(uj2.d dVar, ak2.a aVar) {
        this.f62453a = dVar;
        this.f62454b = aVar;
    }

    @Override // uj2.d
    public final void a() {
        this.f62453a.a();
        c();
    }

    @Override // uj2.d
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f62455c, cVar)) {
            this.f62455c = cVar;
            this.f62453a.b(this);
        }
    }

    public final void c() {
        if (compareAndSet(0, 1)) {
            try {
                this.f62454b.run();
            } catch (Throwable th3) {
                bp1.h.H(th3);
                l0.R0(th3);
            }
        }
    }

    @Override // xj2.c
    public final void dispose() {
        this.f62455c.dispose();
        c();
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f62455c.isDisposed();
    }

    @Override // uj2.d
    public final void onError(Throwable th3) {
        this.f62453a.onError(th3);
        c();
    }
}
