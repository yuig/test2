package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements u {

    /* renamed from: d, reason: collision with root package name */
    public final String f133283d;

    public t(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133283d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f133283d, ((t) obj).f133283d);
    }

    public final int hashCode() {
        return this.f133283d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AddConversationMessageMutation(__typename="), this.f133283d, ")");
    }
}
