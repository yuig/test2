package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements s0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f21743d;

    public r0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21743d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f21743d, ((r0) obj).f21743d);
    }

    public final int hashCode() {
        return this.f21743d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3UpdateObjectSubscriptionsForNotificationsGraphqlMutation(__typename="), this.f21743d, ")");
    }
}
