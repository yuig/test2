package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132595a;

    public j8(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132595a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j8) && Intrinsics.d(this.f132595a, ((j8) obj).f132595a);
    }

    public final int hashCode() {
        return this.f132595a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinnedToBoard(__typename="), this.f132595a, ")");
    }
}
