package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f57435a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f57436b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f57437c;

    public v0(p0 p0Var, r0 r0Var, u0 u0Var) {
        this.f57435a = p0Var;
        this.f57436b = r0Var;
        this.f57437c = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f57435a, v0Var.f57435a) && Intrinsics.d(this.f57436b, v0Var.f57436b) && Intrinsics.d(this.f57437c, v0Var.f57437c);
    }

    public final int hashCode() {
        p0 p0Var = this.f57435a;
        int hashCode = (p0Var == null ? 0 : p0Var.hashCode()) * 31;
        r0 r0Var = this.f57436b;
        int hashCode2 = (hashCode + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
        u0 u0Var = this.f57437c;
        return hashCode2 + (u0Var != null ? u0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Action(button=" + this.f57435a + ", description=" + this.f57436b + ", title=" + this.f57437c + ")";
    }
}
