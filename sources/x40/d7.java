package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d7 implements c7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132213a;

    public d7(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132213a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7) && Intrinsics.d(this.f132213a, ((d7) obj).f132213a);
    }

    public final int hashCode() {
        return this.f132213a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f132213a, ")");
    }
}
