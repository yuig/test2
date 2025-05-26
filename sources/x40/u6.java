package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u6 implements v6 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133416d;

    public u6(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133416d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u6) && Intrinsics.d(this.f133416d, ((u6) obj).f133416d);
    }

    public final int hashCode() {
        return this.f133416d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3DeclineOrDeleteBoardCollaboratorInviteMutation(__typename="), this.f133416d, ")");
    }
}
