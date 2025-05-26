package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class s0 extends AtomicReference implements uj2.d0, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f76688a;

    public s0(r0 r0Var) {
        this.f76688a = r0Var;
    }

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // xj2.c
    public final void dispose() {
        bk2.c.dispose(this);
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return bk2.c.isDisposed((xj2.c) get());
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        r0 r0Var = this.f76688a;
        xj2.b bVar = r0Var.f76668d;
        bVar.c(this);
        pk2.c cVar = r0Var.f76670f;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        if (!r0Var.f76667c) {
            r0Var.f76673i.dispose();
            bVar.dispose();
        }
        r0Var.f76669e.decrementAndGet();
        r0Var.e();
    }

    @Override // uj2.d0
    public final void onSuccess(Object obj) {
        r0 r0Var = this.f76688a;
        r0Var.f76668d.c(this);
        if (r0Var.get() == 0) {
            if (r0Var.compareAndSet(0, 1)) {
                r0Var.f76666b.c(obj);
                boolean z13 = r0Var.f76669e.decrementAndGet() == 0;
                lk2.c cVar = (lk2.c) r0Var.f76672h.get();
                if (!z13 || (cVar != null && !cVar.isEmpty())) {
                    if (r0Var.decrementAndGet() == 0) {
                        return;
                    }
                    r0Var.f();
                }
                pk2.c cVar2 = r0Var.f76670f;
                cVar2.getClass();
                Throwable b13 = pk2.h.b(cVar2);
                if (b13 != null) {
                    r0Var.f76666b.onError(b13);
                    return;
                } else {
                    r0Var.f76666b.a();
                    return;
                }
            }
        }
        lk2.c g13 = r0Var.g();
        synchronized (g13) {
            g13.offer(obj);
        }
        r0Var.f76669e.decrementAndGet();
        if (r0Var.getAndIncrement() != 0) {
            return;
        }
        r0Var.f();
    }
}
