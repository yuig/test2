package ads_mobile_sdk;

import a.f2;

/* loaded from: classes2.dex */
public final class ll2 {

    /* renamed from: a, reason: collision with root package name */
    public final a.n5 f7877a;

    /* renamed from: b, reason: collision with root package name */
    public final a.n5 f7878b;

    /* renamed from: c, reason: collision with root package name */
    public final a.n5 f7879c;

    /* renamed from: d, reason: collision with root package name */
    public final bt2 f7880d;

    public ll2(a.n5 n5Var, a.n5 n5Var2, a.n5 n5Var3, bt2 bt2Var) {
        this.f7877a = n5Var;
        this.f7878b = n5Var2;
        this.f7879c = n5Var3;
        this.f7880d = bt2Var;
    }

    public static /* synthetic */ f2 a(Throwable th3) {
        return null;
    }

    public final com.google.common.util.concurrent.c0 a(r4 r4Var, boolean z13) {
        com.google.common.util.concurrent.c0 a13 = a(r4Var);
        if (!z13 || r4Var == r4.ADSHIELD_VERSION_1) {
            return a13;
        }
        com.google.common.util.concurrent.t z14 = com.google.common.util.concurrent.t.z(a13);
        a.y3 y3Var = new a.y3(1);
        com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
        z14.getClass();
        return com.google.common.util.concurrent.g.B(com.google.common.util.concurrent.a.A(z14, Throwable.class, y3Var, rVar), new kl2(this), rVar);
    }

    public final com.google.common.util.concurrent.c0 a(r4 r4Var) {
        f2 f2Var;
        int ordinal = r4Var.ordinal();
        if (ordinal == 1) {
            f2Var = (f2) this.f7877a.get();
        } else if (ordinal == 2) {
            f2Var = (f2) this.f7878b.get();
        } else if (ordinal == 3) {
            f2Var = (f2) this.f7879c.get();
        } else {
            throw new IllegalArgumentException();
        }
        return com.google.common.util.concurrent.g.A(f2Var.a(), new ok.u(f2Var), com.google.common.util.concurrent.r.INSTANCE);
    }
}
