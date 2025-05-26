package gk2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a1 extends uj2.h {

    /* renamed from: b, reason: collision with root package name */
    public final uj2.a0 f65326b;

    /* renamed from: c, reason: collision with root package name */
    public final long f65327c;

    /* renamed from: d, reason: collision with root package name */
    public final long f65328d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f65329e;

    public a1(long j13, long j14, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f65327c = j13;
        this.f65328d = j14;
        this.f65329e = timeUnit;
        this.f65326b = a0Var;
    }

    @Override // uj2.h
    public final void m(xp2.b bVar) {
        z0 z0Var = new z0(bVar);
        bVar.d(z0Var);
        uj2.a0 a0Var = this.f65326b;
        boolean z13 = a0Var instanceof mk2.c0;
        AtomicReference atomicReference = z0Var.f65713c;
        if (!z13) {
            bk2.c.setOnce(atomicReference, a0Var.d(z0Var, this.f65327c, this.f65328d, this.f65329e));
        } else {
            uj2.z a13 = a0Var.a();
            bk2.c.setOnce(atomicReference, a13);
            a13.d(z0Var, this.f65327c, this.f65328d, this.f65329e);
        }
    }
}
