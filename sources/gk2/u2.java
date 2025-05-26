package gk2;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class u2 extends AtomicReference implements uj2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2 f65656a;

    public u2(v2 v2Var) {
        this.f65656a = v2Var;
    }

    @Override // xp2.b
    public final void a() {
        v2 v2Var = this.f65656a;
        ok2.g.cancel(v2Var.f65666c);
        dl2.b.f2(v2Var.f65664a, v2Var, v2Var.f65667d);
    }

    @Override // xp2.b
    public final void c(Object obj) {
        ok2.g.cancel(this);
        a();
    }

    @Override // xp2.b
    public final void d(xp2.c cVar) {
        ok2.g.setOnce(this, cVar, Long.MAX_VALUE);
    }

    @Override // xp2.b
    public final void onError(Throwable th3) {
        v2 v2Var = this.f65656a;
        ok2.g.cancel(v2Var.f65666c);
        dl2.b.h2(v2Var.f65664a, th3, v2Var, v2Var.f65667d);
    }
}
