package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p implements k {

    /* renamed from: d, reason: collision with root package name */
    public final String f21735d;

    /* renamed from: e, reason: collision with root package name */
    public final l f21736e;

    public p(String __typename, l lVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21735d = __typename;
        this.f21736e = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f21735d, pVar.f21735d) && Intrinsics.d(this.f21736e, pVar.f21736e);
    }

    public final int hashCode() {
        int hashCode = this.f21735d.hashCode() * 31;
        l lVar = this.f21736e;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "V3GetCurrentUserHandlerV3GetCurrentUserHandlerQuery(__typename=" + this.f21735d + ", data=" + this.f21736e + ")";
    }
}
