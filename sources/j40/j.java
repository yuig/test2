package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: d, reason: collision with root package name */
    public final String f74609d;

    public j(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74609d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f74609d, ((j) obj).f74609d);
    }

    public final int hashCode() {
        return this.f74609d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3OrientationTopicsQuery(__typename="), this.f74609d, ")");
    }
}
