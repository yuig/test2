package v30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f123943d;

    /* renamed from: e, reason: collision with root package name */
    public final m f123944e;

    public n(String __typename, m mVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f123943d = __typename;
        this.f123944e = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f123943d, nVar.f123943d) && Intrinsics.d(this.f123944e, nVar.f123944e);
    }

    public final int hashCode() {
        int hashCode = this.f123943d.hashCode() * 31;
        m mVar = this.f123944e;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "V3UnfollowUserMethodV3UnfollowUserMethodMutation(__typename=" + this.f123943d + ", data=" + this.f123944e + ")";
    }
}
