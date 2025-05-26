package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133131a;

    public r1(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133131a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && Intrinsics.d(this.f133131a, ((r1) obj).f133131a);
    }

    public final int hashCode() {
        return this.f133131a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinnedToBoard(__typename="), this.f133131a, ")");
    }
}
