package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f98743d;

    public k(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98743d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f98743d, ((k) obj).f98743d);
    }

    public final int hashCode() {
        return this.f98743d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserResponseV3EmailFollowUserMutation(__typename="), this.f98743d, ")");
    }
}
