package jk2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class w2 extends uj2.q {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.a0 f76734a;

    /* renamed from: b, reason: collision with root package name */
    public final long f76735b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f76736c;

    public w2(long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f76735b = j13;
        this.f76736c = timeUnit;
        this.f76734a = a0Var;
    }

    @Override // uj2.q
    public final void G(uj2.v vVar) {
        v2 v2Var = new v2(vVar);
        vVar.b(v2Var);
        bk2.c.trySet(v2Var, this.f76734a.c(v2Var, this.f76735b, this.f76736c));
    }
}
