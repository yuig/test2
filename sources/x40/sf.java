package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class sf {

    /* renamed from: a, reason: collision with root package name */
    public final String f133273a;

    public sf(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133273a = __typename;
    }

    public final String a() {
        return this.f133273a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf) && Intrinsics.d(this.f133273a, ((sf) obj).f133273a);
    }

    public final int hashCode() {
        return this.f133273a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinnedToBoard(__typename="), this.f133273a, ")");
    }
}
