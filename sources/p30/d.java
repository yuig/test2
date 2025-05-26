package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements e {

    /* renamed from: d, reason: collision with root package name */
    public final String f98732d;

    public d(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98732d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f98732d, ((d) obj).f98732d);
    }

    public final int hashCode() {
        return this.f98732d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3EmailClickMutation(__typename="), this.f98732d, ")");
    }
}
