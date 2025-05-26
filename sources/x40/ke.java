package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ke implements je {

    /* renamed from: d, reason: collision with root package name */
    public final String f132678d;

    public ke(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132678d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke) && Intrinsics.d(this.f132678d, ((ke) obj).f132678d);
    }

    public final int hashCode() {
        return this.f132678d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("V3InviteBoardCollaboratorsV3InviteBoardCollaboratorsMutation(__typename="), this.f132678d, ")");
    }
}
