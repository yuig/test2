package jk2;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class e extends uj2.b0 implements dk2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.t f76440a;

    /* renamed from: b, reason: collision with root package name */
    public final Callable f76441b;

    /* renamed from: c, reason: collision with root package name */
    public final ak2.b f76442c;

    public e(uj2.t tVar, ck2.f fVar, ak2.b bVar) {
        this.f76440a = tVar;
        this.f76441b = fVar;
        this.f76442c = bVar;
    }

    @Override // dk2.c
    public final uj2.q a() {
        return new c(this.f76440a, this.f76441b, this.f76442c, 0);
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        try {
            Object call = this.f76441b.call();
            ck2.i.b(call, "The initialSupplier returned a null value");
            this.f76440a.d(new d(d0Var, call, this.f76442c));
        } catch (Throwable th3) {
            bk2.d.error(th3, d0Var);
        }
    }
}
