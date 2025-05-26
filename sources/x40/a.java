package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements e {

    /* renamed from: d, reason: collision with root package name */
    public final String f131893d;

    public a(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f131893d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f131893d, ((a) obj).f131893d);
    }

    public final int hashCode() {
        return this.f131893d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CollaboratorInviteResponseV3AcceptBoardCollaboratorInviteMutation(__typename="), this.f131893d, ")");
    }
}
