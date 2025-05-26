package fk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class j extends uj2.b {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.f f62448a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62449b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f62450c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f62451d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f62452e = false;

    public j(uj2.f fVar, long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f62448a = fVar;
        this.f62449b = j13;
        this.f62450c = timeUnit;
        this.f62451d = a0Var;
    }

    @Override // uj2.b
    public final void k(uj2.d dVar) {
        ((uj2.b) this.f62448a).j(new i(dVar, this.f62449b, this.f62450c, this.f62451d, this.f62452e));
    }
}
