package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class td implements ud {

    /* renamed from: d, reason: collision with root package name */
    public final String f133380d;

    public td(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133380d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof td) && Intrinsics.d(this.f133380d, ((td) obj).f133380d);
    }

    public final int hashCode() {
        return this.f133380d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3HideConversationMutation(__typename="), this.f133380d, ")");
    }
}
