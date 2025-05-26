package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public final String f57263b;

    public b(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57263b = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f57263b, ((b) obj).f57263b);
    }

    public final int hashCode() {
        return this.f57263b.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f57263b, ")");
    }
}
