package jk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class r extends a {

    /* renamed from: b, reason: collision with root package name */
    public final long f76661b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76662c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f76663d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f76664e;

    public r(uj2.t tVar, long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        super(tVar);
        this.f76661b = j13;
        this.f76662c = timeUnit;
        this.f76663d = a0Var;
        this.f76664e = false;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        this.f76382a.d(new q(this.f76664e ? vVar : new rk2.d(vVar), this.f76661b, this.f76662c, this.f76663d.a(), this.f76664e));
    }
}
