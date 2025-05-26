package v30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f123922d;

    public c(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f123922d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f123922d, ((c) obj).f123922d);
    }

    public final int hashCode() {
        return this.f123922d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3FollowUserMethodMutation(__typename="), this.f123922d, ")");
    }
}
