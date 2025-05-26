package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f136738a;

    public f(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f136738a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f136738a, ((f) obj).f136738a);
    }

    public final int hashCode() {
        return this.f136738a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f136738a, ")");
    }
}
