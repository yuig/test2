package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f57364a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f57365b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57366c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f57367d;

    public i0(Boolean bool, h0 h0Var, String str, g0 g0Var) {
        this.f57364a = bool;
        this.f57365b = h0Var;
        this.f57366c = str;
        this.f57367d = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.f57364a, i0Var.f57364a) && Intrinsics.d(this.f57365b, i0Var.f57365b) && Intrinsics.d(this.f57366c, i0Var.f57366c) && Intrinsics.d(this.f57367d, i0Var.f57367d);
    }

    public final int hashCode() {
        Boolean bool = this.f57364a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        h0 h0Var = this.f57365b;
        int hashCode2 = (hashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        String str = this.f57366c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        g0 g0Var = this.f57367d;
        return hashCode3 + (g0Var != null ? g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "OneBarFilter(isSelected=" + this.f57364a + ", display=" + this.f57365b + ", entityId=" + this.f57366c + ", action=" + this.f57367d + ")";
    }
}
