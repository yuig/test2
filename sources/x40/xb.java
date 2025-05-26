package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xb implements yb {

    /* renamed from: d, reason: collision with root package name */
    public final String f133684d;

    public xb(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133684d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xb) && Intrinsics.d(this.f133684d, ((xb) obj).f133684d);
    }

    public final int hashCode() {
        return this.f133684d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetUserBoardInviteQuery(__typename="), this.f133684d, ")");
    }
}
