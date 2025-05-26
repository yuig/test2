package i50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f71554d;

    public k(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f71554d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f71554d, ((k) obj).f71554d);
    }

    public final int hashCode() {
        return this.f71554d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3PollDownloadIdeaPinQuery(__typename="), this.f71554d, ")");
    }
}
