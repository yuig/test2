package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f57377d;

    public k(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57377d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f57377d, ((k) obj).f57377d);
    }

    public final int hashCode() {
        return this.f57377d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3SearchUsersWithStoriesQuery(__typename="), this.f57377d, ")");
    }
}
