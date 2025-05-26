package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements q {

    /* renamed from: b, reason: collision with root package name */
    public final String f57410b;

    public r(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57410b = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f57410b, ((r) obj).f57410b);
    }

    public final int hashCode() {
        return this.f57410b.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherNode(__typename="), this.f57410b, ")");
    }
}
