package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class i0 extends AtomicReference implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final long f76499a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f76500b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f76501c;

    /* renamed from: d, reason: collision with root package name */
    public volatile dk2.i f76502d;

    /* renamed from: e, reason: collision with root package name */
    public int f76503e;

    public i0(j0 j0Var, long j13) {
        this.f76499a = j13;
        this.f76500b = j0Var;
    }

    @Override // uj2.v
    public final void a() {
        this.f76501c = true;
        this.f76500b.f();
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.setOnce(this, cVar) && (cVar instanceof dk2.d)) {
            dk2.d dVar = (dk2.d) cVar;
            int requestFusion = dVar.requestFusion(7);
            if (requestFusion == 1) {
                this.f76503e = requestFusion;
                this.f76502d = dVar;
                this.f76501c = true;
                this.f76500b.f();
                return;
            }
            if (requestFusion == 2) {
                this.f76503e = requestFusion;
                this.f76502d = dVar;
            }
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        if (this.f76503e != 0) {
            this.f76500b.f();
            return;
        }
        j0 j0Var = this.f76500b;
        if (j0Var.get() == 0 && j0Var.compareAndSet(0, 1)) {
            j0Var.f76521a.c(obj);
            if (j0Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            dk2.i iVar = this.f76502d;
            if (iVar == null) {
                iVar = new lk2.c(j0Var.f76525e);
                this.f76502d = iVar;
            }
            iVar.offer(obj);
            if (j0Var.getAndIncrement() != 0) {
                return;
            }
        }
        j0Var.g();
    }

    public final void d() {
        bk2.c.dispose(this);
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        pk2.c cVar = this.f76500b.f76528h;
        cVar.getClass();
        if (!pk2.h.a(cVar, th3)) {
            lb.l0.R0(th3);
            return;
        }
        j0 j0Var = this.f76500b;
        if (!j0Var.f76523c) {
            j0Var.e();
        }
        this.f76501c = true;
        this.f76500b.f();
    }
}
