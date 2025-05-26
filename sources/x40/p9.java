package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p9 implements q9 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133032d;

    public p9(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133032d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9) && Intrinsics.d(this.f133032d, ((p9) obj).f133032d);
    }

    public final int hashCode() {
        return this.f133032d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3GetConversationsQuery(__typename="), this.f133032d, ")");
    }
}
