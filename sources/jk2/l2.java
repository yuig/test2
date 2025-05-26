package jk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l2 extends AtomicReference implements uj2.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2 f76575a;

    public l2(m2 m2Var) {
        this.f76575a = m2Var;
    }

    @Override // uj2.v
    public final void a() {
        m2 m2Var = this.f76575a;
        bk2.c.dispose(m2Var.f76593b);
        dl2.b.e2(m2Var.f76592a, m2Var, m2Var.f76595d);
    }

    @Override // uj2.v
    public final void b(xj2.c cVar) {
        bk2.c.setOnce(this, cVar);
    }

    @Override // uj2.v
    public final void c(Object obj) {
        bk2.c.dispose(this);
        m2 m2Var = this.f76575a;
        bk2.c.dispose(m2Var.f76593b);
        dl2.b.e2(m2Var.f76592a, m2Var, m2Var.f76595d);
    }

    @Override // uj2.v
    public final void onError(Throwable th3) {
        m2 m2Var = this.f76575a;
        bk2.c.dispose(m2Var.f76593b);
        dl2.b.g2(m2Var.f76592a, th3, m2Var, m2Var.f76595d);
    }
}
