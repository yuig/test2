package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133241a;

    public s7(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133241a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7) && Intrinsics.d(this.f133241a, ((s7) obj).f133241a);
    }

    public final int hashCode() {
        return this.f133241a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinnedToBoard(__typename="), this.f133241a, ")");
    }
}
