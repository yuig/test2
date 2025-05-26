package jk2;

import java.util.Collection;

/* loaded from: classes4.dex */
public final class y2 extends uj2.b0 implements dk2.c {

    /* renamed from: a, reason: collision with root package name */
    public final uj2.t f76770a;

    /* renamed from: b, reason: collision with root package name */
    public final ck2.b f76771b = new ck2.b();

    public y2(uj2.t tVar) {
        this.f76770a = tVar;
    }

    @Override // dk2.c
    public final uj2.q a() {
        return new g2(this.f76770a, this.f76771b, 2);
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        try {
            this.f76770a.d(new x2(d0Var, (Collection) this.f76771b.call(), 1));
        } catch (Throwable th3) {
            bp1.h.H(th3);
            bk2.d.error(th3, d0Var);
        }
    }
}
