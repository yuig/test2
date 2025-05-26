package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f63429d;

    public k(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f63429d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f63429d, ((k) obj).f63429d);
    }

    public final int hashCode() {
        return this.f63429d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserResponseV3RemoveDeviceTokenMutation(__typename="), this.f63429d, ")");
    }
}
