package ads_mobile_sdk;

import a.zb;

/* loaded from: classes2.dex */
public final class bt2 {

    /* renamed from: a, reason: collision with root package name */
    public final a.ee f3595a;

    /* renamed from: b, reason: collision with root package name */
    public final zb f3596b;

    public bt2(zb zbVar, a.ee eeVar) {
        this.f3595a = eeVar;
        this.f3596b = zbVar;
    }

    public final com.google.common.util.concurrent.c0 a(xb0 xb0Var, com.google.common.util.concurrent.c0 c0Var) {
        bs2 bs2Var = new bs2(xb0Var, this.f3596b, this.f3595a);
        bs2Var.b();
        dl2.b.n(c0Var, new at2(bs2Var), com.google.common.util.concurrent.r.INSTANCE);
        return c0Var;
    }

    public final void b(xb0 xb0Var) {
        ((x71) this.f3595a).a(xb0Var.f13581a, -1L, null, null);
    }

    public final bs2 a(xb0 xb0Var) {
        return new bs2(xb0Var, this.f3596b, this.f3595a);
    }
}
