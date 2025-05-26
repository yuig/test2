package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: d, reason: collision with root package name */
    public final String f132201d;

    public d(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132201d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f132201d, ((d) obj).f132201d);
    }

    public final int hashCode() {
        return this.f132201d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AcceptBoardCollaboratorInviteMutation(__typename="), this.f132201d, ")");
    }
}
