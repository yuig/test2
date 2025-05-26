package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l7 implements pc.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final b7 f132705a;

    public l7(b7 b7Var) {
        this.f132705a = b7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7) && Intrinsics.d(this.f132705a, ((l7) obj).f132705a);
    }

    public final int hashCode() {
        b7 b7Var = this.f132705a;
        if (b7Var == null) {
            return 0;
        }
        return b7Var.hashCode();
    }

    public final String toString() {
        return "Data(v3GetBoardCollaboratorInvitesQuery=" + this.f132705a + ")";
    }
}
