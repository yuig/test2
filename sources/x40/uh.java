package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uh implements yh {

    /* renamed from: d, reason: collision with root package name */
    public final String f133515d;

    public uh(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133515d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh) && Intrinsics.d(this.f133515d, ((uh) obj).f133515d);
    }

    public final int hashCode() {
        return this.f133515d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardResponseV3RemoveBoardCollaboratorsMutationv2(__typename="), this.f133515d, ")");
    }
}
