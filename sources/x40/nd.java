package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nd implements od {

    /* renamed from: d, reason: collision with root package name */
    public final String f132894d;

    public nd(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132894d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd) && Intrinsics.d(this.f132894d, ((nd) obj).f132894d);
    }

    public final int hashCode() {
        return this.f132894d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetConversationQuery(__typename="), this.f132894d, ")");
    }
}
