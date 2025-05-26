package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t5 implements x5 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133329d;

    /* renamed from: e, reason: collision with root package name */
    public final s5 f133330e;

    public t5(String __typename, s5 s5Var) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133329d = __typename;
        this.f133330e = s5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return Intrinsics.d(this.f133329d, t5Var.f133329d) && Intrinsics.d(this.f133330e, t5Var.f133330e);
    }

    public final int hashCode() {
        int hashCode = this.f133329d.hashCode() * 31;
        s5 s5Var = this.f133330e;
        return hashCode + (s5Var == null ? 0 : s5Var.f133238a.hashCode());
    }

    public final String toString() {
        return "CollaboratorInviteResponseV3CreateRequestToJoinBoardMutation(__typename=" + this.f133329d + ", data=" + this.f133330e + ")";
    }
}
