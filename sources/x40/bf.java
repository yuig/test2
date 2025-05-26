package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class bf implements cf {

    /* renamed from: d, reason: collision with root package name */
    public final String f132054d;

    public bf(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132054d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf) && Intrinsics.d(this.f132054d, ((bf) obj).f132054d);
    }

    public final int hashCode() {
        return this.f132054d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3MarkContactRequestReadMutation(__typename="), this.f132054d, ")");
    }
}
