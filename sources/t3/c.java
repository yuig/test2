package t3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: d, reason: collision with root package name */
    public static c f115862d;

    /* renamed from: e, reason: collision with root package name */
    public static final m4.h f115863e = m4.h.Rtl;

    /* renamed from: f, reason: collision with root package name */
    public static final m4.h f115864f = m4.h.Ltr;

    /* renamed from: c, reason: collision with root package name */
    public b4.m0 f115865c;

    @Override // t3.f
    public final int[] a(int i13) {
        int i14;
        if (d().length() <= 0 || i13 >= d().length()) {
            return null;
        }
        m4.h hVar = f115863e;
        if (i13 < 0) {
            b4.m0 m0Var = this.f115865c;
            if (m0Var == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            i14 = m0Var.f(0);
        } else {
            b4.m0 m0Var2 = this.f115865c;
            if (m0Var2 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            int f13 = m0Var2.f(i13);
            i14 = f(f13, hVar) == i13 ? f13 : f13 + 1;
        }
        b4.m0 m0Var3 = this.f115865c;
        if (m0Var3 == null) {
            Intrinsics.r("layoutResult");
            throw null;
        }
        if (i14 >= m0Var3.f21616b.f21630f) {
            return null;
        }
        return c(f(i14, hVar), f(i14, f115864f) + 1);
    }

    @Override // t3.f
    public final int[] b(int i13) {
        int i14;
        if (d().length() <= 0 || i13 <= 0) {
            return null;
        }
        int length = d().length();
        m4.h hVar = f115864f;
        if (i13 > length) {
            b4.m0 m0Var = this.f115865c;
            if (m0Var == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            i14 = m0Var.f(d().length());
        } else {
            b4.m0 m0Var2 = this.f115865c;
            if (m0Var2 == null) {
                Intrinsics.r("layoutResult");
                throw null;
            }
            int f13 = m0Var2.f(i13);
            i14 = f(f13, hVar) + 1 == i13 ? f13 : f13 - 1;
        }
        if (i14 < 0) {
            return null;
        }
        return c(f(i14, f115863e), f(i14, hVar) + 1);
    }

    public final int f(int i13, m4.h hVar) {
        b4.m0 m0Var = this.f115865c;
        if (m0Var == null) {
            Intrinsics.r("layoutResult");
            throw null;
        }
        int i14 = m0Var.i(i13);
        b4.m0 m0Var2 = this.f115865c;
        if (m0Var2 == null) {
            Intrinsics.r("layoutResult");
            throw null;
        }
        if (hVar != m0Var2.j(i14)) {
            b4.m0 m0Var3 = this.f115865c;
            if (m0Var3 != null) {
                return m0Var3.i(i13);
            }
            Intrinsics.r("layoutResult");
            throw null;
        }
        if (this.f115865c != null) {
            return r6.e(i13, false) - 1;
        }
        Intrinsics.r("layoutResult");
        throw null;
    }

    public final void g(String str, b4.m0 m0Var) {
        this.f115827a = str;
        this.f115865c = m0Var;
    }
}
