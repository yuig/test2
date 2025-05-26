package r40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f106133d;

    public c(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f106133d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f106133d, ((c) obj).f106133d);
    }

    public final int hashCode() {
        return this.f106133d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3DeleteAddressBookMutation(__typename="), this.f106133d, ")");
    }
}
