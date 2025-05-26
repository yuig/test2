package kk2;

import lb.l0;

/* loaded from: classes2.dex */
public final class a0 extends ek2.g implements uj2.d0 {

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f79912c;

    @Override // uj2.d0
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f79912c, cVar)) {
            this.f79912c = cVar;
            this.f59425a.b(this);
        }
    }

    @Override // ek2.g, xj2.c
    public final void dispose() {
        super.dispose();
        this.f79912c.dispose();
    }

    @Override // uj2.d0
    public final void onError(Throwable th3) {
        if ((get() & 54) != 0) {
            l0.R0(th3);
        } else {
            lazySet(2);
            this.f59425a.onError(th3);
        }
    }
}
