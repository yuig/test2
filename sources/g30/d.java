package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: d, reason: collision with root package name */
    public final String f63418d;

    public d(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f63418d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f63418d, ((d) obj).f63418d);
    }

    public final int hashCode() {
        return this.f63418d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserResponseV3AddDeviceTokenMutation(__typename="), this.f63418d, ")");
    }
}
