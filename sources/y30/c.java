package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f136737d;

    public c(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f136737d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f136737d, ((c) obj).f136737d);
    }

    public final int hashCode() {
        return this.f136737d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3RecommendedTodayArticlesQuery(__typename="), this.f136737d, ")");
    }
}
