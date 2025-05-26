package jk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class p extends a {

    /* renamed from: b, reason: collision with root package name */
    public final long f76623b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76624c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f76625d;

    public p(long j13, uj2.t tVar, uj2.a0 a0Var, TimeUnit timeUnit) {
        super(tVar);
        this.f76623b = j13;
        this.f76624c = timeUnit;
        this.f76625d = a0Var;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        this.f76382a.d(new o(new rk2.d(vVar), this.f76623b, this.f76624c, this.f76625d.a()));
    }
}
