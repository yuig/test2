package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d1 implements m {

    /* renamed from: d, reason: collision with root package name */
    public final String f57312d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f57313e;

    public d1(String __typename, c1 c1Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57312d = __typename;
        this.f57313e = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.d(this.f57312d, d1Var.f57312d) && Intrinsics.d(this.f57313e, d1Var.f57313e);
    }

    public final int hashCode() {
        int hashCode = this.f57312d.hashCode() * 31;
        c1 c1Var = this.f57313e;
        return hashCode + (c1Var == null ? 0 : c1Var.hashCode());
    }

    public final String toString() {
        return "V3SearchUsersWithStoriesDataConnectionContainerData(__typename=" + this.f57312d + ", connection=" + this.f57313e + ")";
    }
}
