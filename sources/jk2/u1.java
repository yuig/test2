package jk2;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class u1 extends AtomicBoolean implements uj2.v, xj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.v f76709a;

    /* renamed from: b, reason: collision with root package name */
    public final v1 f76710b;

    /* renamed from: c, reason: collision with root package name */
    public final gk2.d2 f76711c;

    /* renamed from: d, reason: collision with root package name */
    public xj2.c f76712d;

    public u1(uj2.v vVar, v1 v1Var, gk2.d2 d2Var) {
        this.f76709a = vVar;
        this.f76710b = v1Var;
        this.f76711c = d2Var;
    }

    @Override // uj2.v
    public final void a() {
        if (compareAndSet(false, true)) {
            this.f76710b.Q(this.f76711c);
            this.f76709a.a();
        }
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f76712d, cVar)) {
            this.f76712d = cVar;
            this.f76709a.b(this);
        }
    }

    @Override // uj2.v
    public final void c(Object obj) {
        this.f76709a.c(obj);
    }

    @Override // xj2.c
    public final void dispose() {
        this.f76712d.dispose();
        if (compareAndSet(false, true)) {
            v1 v1Var = this.f76710b;
            gk2.d2 d2Var = this.f76711c;
            synchronized (v1Var) {
                try {
                    gk2.d2 d2Var2 = v1Var.f76727c;
                    if (d2Var2 != null && d2Var2 == d2Var) {
                        long j13 = d2Var.f65376b - 1;
                        d2Var.f65376b = j13;
                        if (j13 == 0 && d2Var.f65377c) {
                            v1Var.R(d2Var);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // xj2.c
    public final boolean isDisposed() {
        return this.f76712d.isDisposed();
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        if (!compareAndSet(false, true)) {
            lb.l0.R0(th3);
        } else {
            this.f76710b.Q(this.f76711c);
            this.f76709a.onError(th3);
        }
    }
}
