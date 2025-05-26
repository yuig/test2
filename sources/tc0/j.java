package tc0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f117275a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f117276b;

    public j(int i13, n0 n0Var) {
        this.f117275a = i13;
        this.f117276b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f117275a == jVar.f117275a && Intrinsics.d(this.f117276b, jVar.f117276b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f117275a) * 31;
        n0 n0Var = this.f117276b;
        return hashCode + (n0Var == null ? 0 : n0Var.hashCode());
    }

    public final String toString() {
        return "ComponentHeaderDisplayState(description=" + this.f117275a + ", linkDisplayState=" + this.f117276b + ")";
    }
}
