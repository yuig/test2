package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f5 implements g5 {

    /* renamed from: d, reason: collision with root package name */
    public final String f132374d;

    public f5(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132374d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5) && Intrinsics.d(this.f132374d, ((f5) obj).f132374d);
    }

    public final int hashCode() {
        return this.f132374d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3CreateConversationMutation(__typename="), this.f132374d, ")");
    }
}
