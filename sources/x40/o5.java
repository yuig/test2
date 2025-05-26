package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o5 implements p5 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132940d;

    public o5(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132940d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o5) && Intrinsics.d(this.f132940d, ((o5) obj).f132940d);
    }

    public final int hashCode() {
        return this.f132940d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3CreateConversationMutation(__typename="), this.f132940d, ")");
    }
}
