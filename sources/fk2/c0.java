package fk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class c0 extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f62419a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f62420b;

    /* renamed from: c, reason: collision with root package name */
    public final uj2.a0 f62421c;

    public c0(long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f62419a = j13;
        this.f62420b = timeUnit;
        this.f62421c = a0Var;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        boolean z13 = false;
        b0 b0Var = new b0(dVar, 0);
        dVar.b(b0Var);
        xj2.c c13 = this.f62421c.c(b0Var, this.f62419a, this.f62420b);
        switch (z13) {
            case false:
                bk2.c.replace(b0Var, c13);
                break;
            default:
                bk2.c.replace(b0Var, c13);
                break;
        }
    }
}
