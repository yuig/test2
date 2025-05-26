package jk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class u2 extends a {

    /* renamed from: b, reason: collision with root package name */
    public final long f76713b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76714c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f76715d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.t f76716e;

    public u2(uj2.q qVar, long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        super(qVar);
        this.f76713b = j13;
        this.f76714c = timeUnit;
        this.f76715d = a0Var;
        this.f76716e = null;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        uj2.t tVar = this.f76716e;
        uj2.t tVar2 = this.f76382a;
        uj2.a0 a0Var = this.f76715d;
        if (tVar != null) {
            q2 q2Var = new q2(vVar, this.f76713b, this.f76714c, a0Var.a(), this.f76716e);
            vVar.b(q2Var);
            q2Var.e(0L);
            tVar2.d(q2Var);
            return;
        }
        r2 r2Var = new r2(vVar, this.f76713b, this.f76714c, a0Var.a());
        vVar.b(r2Var);
        xj2.c c13 = r2Var.f76681d.c(new t2(0L, r2Var), r2Var.f76679b, r2Var.f76680c);
        bk2.a aVar = r2Var.f76682e;
        aVar.getClass();
        bk2.c.replace(aVar, c13);
        tVar2.d(r2Var);
    }
}
