package gk2;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class n1 extends AtomicLong implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65544a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.e f65545b;

    /* renamed from: c, reason: collision with root package name */
    public xp2.c f65546c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65547d;

    public n1(xp2.b bVar, o1 o1Var) {
        this.f65544a = bVar;
        this.f65545b = o1Var;
    }

    @Override // xp2.b
    public final void a() {
        if (this.f65547d) {
            return;
        }
        this.f65547d = true;
        this.f65544a.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (this.f65547d) {
            return;
        }
        if (get() != 0) {
            this.f65544a.c(obj);
            d7.b.l0(this, 1L);
            return;
        }
        try {
            this.f65545b.accept(obj);
        } catch (Throwable th3) {
            bp1.h.H(th3);
            cancel();
            onError(th3);
        }
    }

    @Override // xp2.c
    public final void cancel() {
        this.f65546c.cancel();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65546c, cVar)) {
            this.f65546c = cVar;
            this.f65544a.d(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (this.f65547d) {
            lb.l0.R0(th3);
        } else {
            this.f65547d = true;
            this.f65544a.onError(th3);
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        if (ok2.g.validate(j13)) {
            d7.b.e(this, j13);
        }
    }
}
