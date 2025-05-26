package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public final String f131941a;

    public aa(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f131941a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa) && Intrinsics.d(this.f131941a, ((aa) obj).f131941a);
    }

    public final int hashCode() {
        return this.f131941a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinnedToBoard(__typename="), this.f131941a, ")");
    }
}
