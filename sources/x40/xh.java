package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xh implements yh {

    /* renamed from: d, reason: collision with root package name */
    public final String f133711d;

    public xh(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133711d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xh) && Intrinsics.d(this.f133711d, ((xh) obj).f133711d);
    }

    public final int hashCode() {
        return this.f133711d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3RemoveBoardCollaboratorsMutationv2(__typename="), this.f133711d, ")");
    }
}
