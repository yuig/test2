package t3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public static d f115927e;

    /* renamed from: f, reason: collision with root package name */
    public static final m4.h f115928f = m4.h.Rtl;

    /* renamed from: g, reason: collision with root package name */
    public static final m4.h f115929g = m4.h.Ltr;

    /* renamed from: c, reason: collision with root package name */
    public b4.m0 f115930c;

    /* renamed from: d, reason: collision with root package name */
    public z3.q f115931d;

    @Override // t3.f
    public final int[] a(int i13) {
        int i14;
        if (d().length() <= 0 || i13 >= d().length()) {
            return null;
        }
        try {
            z3.q qVar = this.f115931d;
            if (qVar == null) {
                Intrinsics.r("node");
                throw null;
            }
            int round = Math.round(qVar.f().c());
            if (i13 <= 0) {
                i13 = 0;
            }
            b4.m0 m0Var = this.f115930c;
            if (m0Var == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            int f13 = m0Var.f(i13);
            b4.m0 m0Var2 = this.f115930c;
            if (m0Var2 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            float d2 = m0Var2.f21616b.d(f13) + round;
            b4.m0 m0Var3 = this.f115930c;
            if (m0Var3 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            if (d2 < m0Var3.f21616b.d(r0.f21630f - 1)) {
                b4.m0 m0Var4 = this.f115930c;
                if (m0Var4 == null) {
                    Intrinsics.r("layoutResult");
                    throw null;
                }
                i14 = m0Var4.f21616b.c(d2);
            } else {
                b4.m0 m0Var5 = this.f115930c;
                if (m0Var5 == null) {
                    Intrinsics.r("layoutResult");
                    throw null;
                }
                i14 = m0Var5.f21616b.f21630f;
            }
            return c(i13, f(i14 - 1, f115929g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // t3.f
    public final int[] b(int i13) {
        int i14;
        if (d().length() <= 0 || i13 <= 0) {
            return null;
        }
        try {
            z3.q qVar = this.f115931d;
            if (qVar == null) {
                Intrinsics.r("node");
                throw null;
            }
            int round = Math.round(qVar.f().c());
            int length = d().length();
            if (length <= i13) {
                i13 = length;
            }
            b4.m0 m0Var = this.f115930c;
            if (m0Var == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            int f13 = m0Var.f(i13);
            b4.m0 m0Var2 = this.f115930c;
            if (m0Var2 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            float d2 = m0Var2.f21616b.d(f13) - round;
            if (d2 > 0.0f) {
                b4.m0 m0Var3 = this.f115930c;
                if (m0Var3 == null) {
                    Intrinsics.r("layoutResult");
                    throw null;
                }
                i14 = m0Var3.f21616b.c(d2);
            } else {
                i14 = 0;
            }
            if (i13 == d().length() && i14 < f13) {
                i14++;
            }
            return c(f(i14, f115928f), i13);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int f(int i13, m4.h hVar) {
        b4.m0 m0Var = this.f115930c;
        if (m0Var == null) {
            Intrinsics.r("layoutResult");
            throw null;
        }
        int i14 = m0Var.i(i13);
        b4.m0 m0Var2 = this.f115930c;
        if (m0Var2 == null) {
            Intrinsics.r("layoutResult");
            throw null;
        }
        if (hVar != m0Var2.j(i14)) {
            b4.m0 m0Var3 = this.f115930c;
            if (m0Var3 != null) {
                return m0Var3.i(i13);
            }
            Intrinsics.r("layoutResult");
            throw null;
        }
        if (this.f115930c != null) {
            return r6.e(i13, false) - 1;
        }
        Intrinsics.r("layoutResult");
        throw null;
    }

    public final void g(String str, b4.m0 m0Var, z3.q qVar) {
        this.f115827a = str;
        this.f115930c = m0Var;
        this.f115931d = qVar;
    }
}
