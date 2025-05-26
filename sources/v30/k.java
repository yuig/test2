package v30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f123937d;

    public k(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f123937d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f123937d, ((k) obj).f123937d);
    }

    public final int hashCode() {
        return this.f123937d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3UnfollowUserMethodMutation(__typename="), this.f123937d, ")");
    }
}
