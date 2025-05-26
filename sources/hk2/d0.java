package hk2;

import lb.l0;

/* loaded from: classes2.dex */
public final class d0 extends ek2.g implements uj2.m {

    /* renamed from: c, reason: collision with root package name */
    public xj2.c f69400c;

    @Override // uj2.m
    public final void a() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f59425a.a();
    }

    @Override // uj2.m
    public final void b(xj2.c cVar) {
        if (bk2.c.validate(this.f69400c, cVar)) {
            this.f69400c = cVar;
            this.f59425a.b(this);
        }
    }

    @Override // ek2.g, xj2.c
    public final void dispose() {
        super.dispose();
        this.f69400c.dispose();
    }

    @Override // uj2.m
    public final void onError(Throwable th3) {
        if ((get() & 54) != 0) {
            l0.R0(th3);
        } else {
            lazySet(2);
            this.f59425a.onError(th3);
        }
    }
}
