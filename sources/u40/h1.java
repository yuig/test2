package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 implements t0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f120333d;

    /* renamed from: e, reason: collision with root package name */
    public final g1 f120334e;

    public h1(String __typename, g1 g1Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120333d = __typename;
        this.f120334e = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.f120333d, h1Var.f120333d) && Intrinsics.d(this.f120334e, h1Var.f120334e);
    }

    public final int hashCode() {
        int hashCode = this.f120333d.hashCode() * 31;
        g1 g1Var = this.f120334e;
        return hashCode + (g1Var == null ? 0 : g1Var.hashCode());
    }

    public final String toString() {
        return "V3GetUserHandlerV3GetUserHandlerQuery(__typename=" + this.f120333d + ", data=" + this.f120334e + ")";
    }
}
