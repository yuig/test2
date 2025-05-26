package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r6 implements v6 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133170d;

    /* renamed from: e, reason: collision with root package name */
    public final q6 f133171e;

    public r6(String __typename, q6 q6Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133170d = __typename;
        this.f133171e = q6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return Intrinsics.d(this.f133170d, r6Var.f133170d) && Intrinsics.d(this.f133171e, r6Var.f133171e);
    }

    public final int hashCode() {
        int hashCode = this.f133170d.hashCode() * 31;
        q6 q6Var = this.f133171e;
        return hashCode + (q6Var == null ? 0 : q6Var.f133107a.hashCode());
    }

    public final String toString() {
        return "CollaboratorInviteResponseV3DeclineOrDeleteBoardCollaboratorInviteMutation(__typename=" + this.f133170d + ", data=" + this.f133171e + ")";
    }
}
