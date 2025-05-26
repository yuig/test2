package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final l82.i0 f82426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82427b;

    public m0(l82.i0 i0Var, String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f82426a = i0Var;
        this.f82427b = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f82426a, m0Var.f82426a) && Intrinsics.d(this.f82427b, m0Var.f82427b);
    }

    public final int hashCode() {
        l82.i0 i0Var = this.f82426a;
        return this.f82427b.hashCode() + ((i0Var == null ? 0 : i0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "DeleteConfirmed(itemVMState=" + this.f82426a + ", draftId=" + this.f82427b + ")";
    }
}
