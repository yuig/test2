package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 implements m0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f21724d;

    public l0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21724d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f21724d, ((l0) obj).f21724d);
    }

    public final int hashCode() {
        return this.f21724d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3HideNewsHubPinMutation(__typename="), this.f21724d, ")");
    }
}
