package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a7 implements b7 {

    /* renamed from: d, reason: collision with root package name */
    public final String f131917d;

    public a7(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f131917d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7) && Intrinsics.d(this.f131917d, ((a7) obj).f131917d);
    }

    public final int hashCode() {
        return this.f131917d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetBoardCollaboratorInvitesQuery(__typename="), this.f131917d, ")");
    }
}
