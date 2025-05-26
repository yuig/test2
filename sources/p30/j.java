package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f98742d;

    public j(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98742d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f98742d, ((j) obj).f98742d);
    }

    public final int hashCode() {
        return this.f98742d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3EmailFollowUserMutation(__typename="), this.f98742d, ")");
    }
}
