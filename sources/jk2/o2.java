package jk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class o2 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final long f76620b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76621c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f76622d;

    public o2(long j13, uj2.t tVar, uj2.a0 a0Var, TimeUnit timeUnit) {
        super(tVar);
        this.f76620b = j13;
        this.f76621c = timeUnit;
        this.f76622d = a0Var;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        this.f76382a.d(new n2(new rk2.d(vVar), this.f76620b, this.f76621c, this.f76622d.a()));
    }
}
