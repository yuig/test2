package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements e0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f21701d;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f21702e;

    public c0(String __typename, b0 b0Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21701d = __typename;
        this.f21702e = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f21701d, c0Var.f21701d) && Intrinsics.d(this.f21702e, c0Var.f21702e);
    }

    public final int hashCode() {
        int hashCode = this.f21701d.hashCode() * 31;
        b0 b0Var = this.f21702e;
        return hashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    public final String toString() {
        return "NewsResponseV3GetNewsSummaryQuery(__typename=" + this.f21701d + ", data=" + this.f21702e + ")";
    }
}
