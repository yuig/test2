package kk2;

import java.util.concurrent.TimeUnit;
import uj2.f0;

/* loaded from: classes4.dex */
public final class x extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f79991a;

    /* renamed from: b, reason: collision with root package name */
    public final long f79992b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f79993c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f79994d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f79995e = null;

    public x(f0 f0Var, long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f79991a = f0Var;
        this.f79992b = j13;
        this.f79993c = timeUnit;
        this.f79994d = a0Var;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        w wVar = new w(d0Var, this.f79995e, this.f79992b, this.f79993c);
        d0Var.b(wVar);
        bk2.c.replace(wVar.f79986b, this.f79994d.c(wVar, this.f79992b, this.f79993c));
        ((uj2.b0) this.f79991a).p(wVar);
    }
}
