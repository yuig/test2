package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements r0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132857d;

    public n0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132857d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f132857d, ((n0) obj).f132857d);
    }

    public final int hashCode() {
        return this.f132857d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CollaboratorInviteResponseV3ApproveBoardCollaboratorInviteMutationv2(__typename="), this.f132857d, ")");
    }
}
