package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements m0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f21721d;

    /* renamed from: e, reason: collision with root package name */
    public final j0 f21722e;

    public k0(String __typename, j0 j0Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21721d = __typename;
        this.f21722e = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return Intrinsics.d(this.f21721d, k0Var.f21721d) && Intrinsics.d(this.f21722e, k0Var.f21722e);
    }

    public final int hashCode() {
        int hashCode = this.f21721d.hashCode() * 31;
        j0 j0Var = this.f21722e;
        return hashCode + (j0Var == null ? 0 : j0Var.f21719a.hashCode());
    }

    public final String toString() {
        return "NewsResponseV3HideNewsHubPinMutation(__typename=" + this.f21721d + ", data=" + this.f21722e + ")";
    }
}
