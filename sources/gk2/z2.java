package gk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class z2 extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final uj2.a0 f65717b;

    /* renamed from: c, reason: collision with root package name */
    public final long f65718c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f65719d;

    public z2(long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f65718c = j13;
        this.f65719d = timeUnit;
        this.f65717b = a0Var;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        y2 y2Var = new y2(bVar);
        bVar.d(y2Var);
        bk2.c.trySet(y2Var, this.f65717b.c(y2Var, this.f65718c, this.f65719d));
    }
}
