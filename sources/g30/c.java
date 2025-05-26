package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: d, reason: collision with root package name */
    public final String f63417d;

    public c(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f63417d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f63417d, ((c) obj).f63417d);
    }

    public final int hashCode() {
        return this.f63417d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3AddDeviceTokenMutation(__typename="), this.f63417d, ")");
    }
}
