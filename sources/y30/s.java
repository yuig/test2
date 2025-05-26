package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements u {

    /* renamed from: d, reason: collision with root package name */
    public final String f136766d;

    public s(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f136766d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f136766d, ((s) obj).f136766d);
    }

    public final int hashCode() {
        return this.f136766d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetUserStateQuery(__typename="), this.f136766d, ")");
    }
}
