package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132373a;

    public f4(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132373a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4) && Intrinsics.d(this.f132373a, ((f4) obj).f132373a);
    }

    public final int hashCode() {
        return this.f132373a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinnedToBoard(__typename="), this.f132373a, ")");
    }
}
