package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f21621a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f21622b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f21623c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f21624d;

    public n0(g0 g0Var, g0 g0Var2, g0 g0Var3, g0 g0Var4) {
        this.f21621a = g0Var;
        this.f21622b = g0Var2;
        this.f21623c = g0Var3;
        this.f21624d = g0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f21621a, n0Var.f21621a) && Intrinsics.d(this.f21622b, n0Var.f21622b) && Intrinsics.d(this.f21623c, n0Var.f21623c) && Intrinsics.d(this.f21624d, n0Var.f21624d);
    }

    public final int hashCode() {
        g0 g0Var = this.f21621a;
        int hashCode = (g0Var != null ? g0Var.hashCode() : 0) * 31;
        g0 g0Var2 = this.f21622b;
        int hashCode2 = (hashCode + (g0Var2 != null ? g0Var2.hashCode() : 0)) * 31;
        g0 g0Var3 = this.f21623c;
        int hashCode3 = (hashCode2 + (g0Var3 != null ? g0Var3.hashCode() : 0)) * 31;
        g0 g0Var4 = this.f21624d;
        return hashCode3 + (g0Var4 != null ? g0Var4.hashCode() : 0);
    }
}
