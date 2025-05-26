package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k7 implements b7 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132667d;

    /* renamed from: e, reason: collision with root package name */
    public final c7 f132668e;

    public k7(String __typename, c7 c7Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132667d = __typename;
        this.f132668e = c7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return Intrinsics.d(this.f132667d, k7Var.f132667d) && Intrinsics.d(this.f132668e, k7Var.f132668e);
    }

    public final int hashCode() {
        int hashCode = this.f132667d.hashCode() * 31;
        c7 c7Var = this.f132668e;
        return hashCode + (c7Var == null ? 0 : c7Var.hashCode());
    }

    public final String toString() {
        return "V3GetBoardCollaboratorInvitesV3GetBoardCollaboratorInvitesQuery(__typename=" + this.f132667d + ", data=" + this.f132668e + ")";
    }
}
