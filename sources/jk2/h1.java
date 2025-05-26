package jk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class h1 extends uj2.q {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.a0 f76489a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76490b;

    /* renamed from: c, reason: collision with root package name */
    public final long f76491c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeUnit f76492d;

    public h1(long j13, long j14, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f76490b = j13;
        this.f76491c = j14;
        this.f76492d = timeUnit;
        this.f76489a = a0Var;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        g1 g1Var = new g1(vVar);
        vVar.b(g1Var);
        uj2.a0 a0Var = this.f76489a;
        if (!(a0Var instanceof mk2.c0)) {
            bk2.c.setOnce(g1Var, a0Var.d(g1Var, this.f76490b, this.f76491c, this.f76492d));
        } else {
            uj2.z a13 = a0Var.a();
            bk2.c.setOnce(g1Var, a13);
            a13.d(g1Var, this.f76490b, this.f76491c, this.f76492d);
        }
    }
}
