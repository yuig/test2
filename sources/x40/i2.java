package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132517a;

    public i2(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132517a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2) && Intrinsics.d(this.f132517a, ((i2) obj).f132517a);
    }

    public final int hashCode() {
        return this.f132517a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinnedToBoard(__typename="), this.f132517a, ")");
    }
}
