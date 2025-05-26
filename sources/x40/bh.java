package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    public final String f132057a;

    public bh(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132057a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh) && Intrinsics.d(this.f132057a, ((bh) obj).f132057a);
    }

    public final int hashCode() {
        return this.f132057a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinnedToBoard(__typename="), this.f132057a, ")");
    }
}
