package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ae implements be {

    /* renamed from: d, reason: collision with root package name */
    public final String f131965d;

    public ae(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f131965d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ae) && Intrinsics.d(this.f131965d, ((ae) obj).f131965d);
    }

    public final int hashCode() {
        return this.f131965d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3InviteBoardCollaboratorEmailMutation(__typename="), this.f131965d, ")");
    }
}
