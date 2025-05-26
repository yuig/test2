package kk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class y extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f79996a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f79997b;

    /* renamed from: c, reason: collision with root package name */
    public final uj2.a0 f79998c;

    public y(long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f79996a = j13;
        this.f79997b = timeUnit;
        this.f79998c = a0Var;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        fk2.b0 b0Var = new fk2.b0(d0Var, 1);
        d0Var.b(b0Var);
        xj2.c c13 = this.f79998c.c(b0Var, this.f79996a, this.f79997b);
        switch (1) {
            case 0:
                bk2.c.replace(b0Var, c13);
                break;
            default:
                bk2.c.replace(b0Var, c13);
                break;
        }
    }
}
