package fk2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class a0 extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.f f62406a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62407b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f62408c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f62409d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.f f62410e = null;

    public a0(uj2.f fVar, long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f62406a = fVar;
        this.f62407b = j13;
        this.f62408c = timeUnit;
        this.f62409d = a0Var;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        xj2.b bVar = new xj2.b();
        dVar.b(bVar);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        bVar.a(this.f62409d.c(new n.g(this, atomicBoolean, bVar, dVar, 12), this.f62407b, this.f62408c));
        ((uj2.b) this.f62406a).j(new k0.a(bVar, atomicBoolean, dVar, 1));
    }
}
