package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pe implements qe {

    /* renamed from: d, reason: collision with root package name */
    public final String f133042d;

    public pe(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133042d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pe) && Intrinsics.d(this.f133042d, ((pe) obj).f133042d);
    }

    public final int hashCode() {
        return this.f133042d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3LogDeviceScreenStateMutation(__typename="), this.f133042d, ")");
    }
}
