package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ie implements je {

    /* renamed from: d, reason: collision with root package name */
    public final String f132572d;

    public ie(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132572d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ie) && Intrinsics.d(this.f132572d, ((ie) obj).f132572d);
    }

    public final int hashCode() {
        return this.f132572d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3InviteBoardCollaboratorsMutation(__typename="), this.f132572d, ")");
    }
}
