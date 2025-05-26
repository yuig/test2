package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f120348b;

    public j0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120348b = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f120348b, ((j0) obj).f120348b);
    }

    public final int hashCode() {
        return this.f120348b.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f120348b, ")");
    }
}
