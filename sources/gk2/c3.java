package gk2;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class c3 extends AtomicBoolean implements uj2.k, xp2.c {

    /* renamed from: a, reason: collision with root package name */
    public final xp2.b f65365a;

    /* renamed from: b, reason: collision with root package name */
    public final uj2.a0 f65366b;

    /* renamed from: c, reason: collision with root package name */
    public xp2.c f65367c;

    public c3(xp2.b bVar, uj2.a0 a0Var) {
        this.f65365a = bVar;
        this.f65366b = a0Var;
    }

    @Override // xp2.b
    public final void a() {
        if (get()) {
            return;
        }
        this.f65365a.a();
    }

    @Override // xp2.b
    public final void c(Object obj) {
        if (get()) {
            return;
        }
        this.f65365a.c(obj);
    }

    @Override // xp2.c
    public final void cancel() {
        if (compareAndSet(false, true)) {
            this.f65366b.b(new ne0.b(this, 12));
        }
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        if (ok2.g.validate(this.f65367c, cVar)) {
            this.f65367c = cVar;
            this.f65365a.d(this);
        }
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        if (get()) {
            lb.l0.R0(th3);
        } else {
            this.f65365a.onError(th3);
        }
    }

    @Override // xp2.c
    public final void request(long j13) {
        this.f65367c.request(j13);
    }
}
