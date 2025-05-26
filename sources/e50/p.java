package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements m {

    /* renamed from: d, reason: collision with root package name */
    public final String f57402d;

    public p(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57402d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f57402d, ((p) obj).f57402d);
    }

    public final int hashCode() {
        return this.f57402d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f57402d, ")");
    }
}
