package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: d, reason: collision with root package name */
    public final String f132684d;

    public l(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132684d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f132684d, ((l) obj).f132684d);
    }

    public final int hashCode() {
        return this.f132684d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AcceptContactRequestsMutation(__typename="), this.f132684d, ")");
    }
}
