package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements s0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f21748d;

    public t0(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f21748d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0) && Intrinsics.d(this.f21748d, ((t0) obj).f21748d);
    }

    public final int hashCode() {
        return this.f21748d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("V3UpdateObjectSubscriptionsForNotificationsGraphqlV3UpdateObjectSubscriptionsForNotificationsGraphqlMutation(__typename="), this.f21748d, ")");
    }
}
