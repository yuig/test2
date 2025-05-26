package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements e {

    /* renamed from: d, reason: collision with root package name */
    public final String f21700d;

    public c(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21700d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f21700d, ((c) obj).f21700d);
    }

    public final int hashCode() {
        return this.f21700d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3DeleteNewsHubBadgeMutation(__typename="), this.f21700d, ")");
    }
}
