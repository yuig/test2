package gk2;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class e2 extends AtomicBoolean implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65390a;

    /* renamed from: b, reason: collision with root package name */
    public final f2 f65391b;

    /* renamed from: c, reason: collision with root package name */
    public final d2 f65392c;

    /* renamed from: d, reason: collision with root package name */
    public xp2.c f65393d;

    public e2(xp2.b bVar, f2 f2Var, d2 d2Var) {
        this.f65390a = bVar;
        this.f65391b = f2Var;
        this.f65392c = d2Var;
    }

    @Override // xp2.b
    public final void a() {
        if (compareAndSet(false, true)) {
            this.f65391b.o(this.f65392c);
            this.f65390a.a();
        }
    }

    @Override // xp2.b
    public final void c(Object obj) {
        this.f65390a.c(obj);
    }

    @Override // xp2.c
    public final void cancel() {
        this.f65393d.cancel();
        if (compareAndSet(false, true)) {
            f2 f2Var = this.f65391b;
            d2 d2Var = this.f65392c;
            synchronized (f2Var) {
                try {
                    d2 d2Var2 = f2Var.f65407d;
                    if (d2Var2 != null && d2Var2 == d2Var) {
                        long j13 = d2Var.f65376b - 1;
                        d2Var.f65376b = j13;
                        if (j13 == 0 && d2Var.f65377c) {
                            f2Var.p(d2Var);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65393d, cVar)) {
            this.f65393d = cVar;
            this.f65390a.d(this);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (!compareAndSet(false, true)) {
            lb.l0.R0(th3);
        } else {
            this.f65391b.o(this.f65392c);
            this.f65390a.onError(th3);
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        this.f65393d.request(j13);
    }
}
