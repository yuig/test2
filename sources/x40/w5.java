package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w5 implements x5 {

    /* renamed from: d, reason: collision with root package name */
    public final String f133594d;

    public w5(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133594d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5) && Intrinsics.d(this.f133594d, ((w5) obj).f133594d);
    }

    public final int hashCode() {
        return this.f133594d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3CreateRequestToJoinBoardMutation(__typename="), this.f133594d, ")");
    }
}
