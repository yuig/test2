package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ki implements ji {

    /* renamed from: a, reason: collision with root package name */
    public final String f132683a;

    public ki(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132683a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki) && Intrinsics.d(this.f132683a, ((ki) obj).f132683a);
    }

    public final int hashCode() {
        return this.f132683a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f132683a, ")");
    }
}
