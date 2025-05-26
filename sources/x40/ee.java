package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ee implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final be f132357a;

    public ee(be beVar) {
        this.f132357a = beVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee) && Intrinsics.d(this.f132357a, ((ee) obj).f132357a);
    }

    public final int hashCode() {
        be beVar = this.f132357a;
        if (beVar == null) {
            return 0;
        }
        return beVar.hashCode();
    }

    public final String toString() {
        return "Data(v3InviteBoardCollaboratorEmailMutation=" + this.f132357a + ")";
    }
}
