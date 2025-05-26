package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: b, reason: collision with root package name */
    public final String f21725b;

    public m(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21725b = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f21725b, ((m) obj).f21725b);
    }

    public final int hashCode() {
        return this.f21725b.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f21725b, ")");
    }
}
