package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132922a;

    public o3(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132922a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3) && Intrinsics.d(this.f132922a, ((o3) obj).f132922a);
    }

    public final int hashCode() {
        return this.f132922a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinnedToBoard(__typename="), this.f132922a, ")");
    }
}
