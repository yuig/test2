package kk2;

import java.util.concurrent.TimeUnit;
import uj2.f0;

/* loaded from: classes2.dex */
public final class e extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f79932a;

    /* renamed from: b, reason: collision with root package name */
    public final long f79933b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f79934c;

    /* renamed from: d, reason: collision with root package name */
    public final uj2.a0 f79935d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f79936e = false;

    public e(f0 f0Var, long j13, TimeUnit timeUnit, uj2.a0 a0Var) {
        this.f79932a = f0Var;
        this.f79933b = j13;
        this.f79934c = timeUnit;
        this.f79935d = a0Var;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        bk2.a aVar = new bk2.a();
        d0Var.b(aVar);
        ((uj2.b0) this.f79932a).p(new d(this, aVar, d0Var));
    }
}
