package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: d, reason: collision with root package name */
    public final String f21703d;

    public d(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21703d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f21703d, ((d) obj).f21703d);
    }

    public final int hashCode() {
        return this.f21703d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserResponseV3DeleteNewsHubBadgeMutation(__typename="), this.f21703d, ")");
    }
}
