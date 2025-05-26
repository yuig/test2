package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements a0 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133757d;

    public z(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133757d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f133757d, ((z) obj).f133757d);
    }

    public final int hashCode() {
        return this.f133757d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AddConversationPinSeenMutation(__typename="), this.f133757d, ")");
    }
}
