package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w6 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final v6 f133595a;

    public w6(v6 v6Var) {
        this.f133595a = v6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6) && Intrinsics.d(this.f133595a, ((w6) obj).f133595a);
    }

    public final int hashCode() {
        v6 v6Var = this.f133595a;
        if (v6Var == null) {
            return 0;
        }
        return v6Var.hashCode();
    }

    public final String toString() {
        return "Data(v3DeclineOrDeleteBoardCollaboratorInviteMutation=" + this.f133595a + ")";
    }
}
