package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f120427a;

    public v(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120427a = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f120427a, ((v) obj).f120427a);
    }

    public final int hashCode() {
        return this.f120427a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherData(__typename="), this.f120427a, ")");
    }
}
