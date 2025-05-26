package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f63428d;

    public j(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f63428d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f63428d, ((j) obj).f63428d);
    }

    public final int hashCode() {
        return this.f63428d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3RemoveDeviceTokenMutation(__typename="), this.f63428d, ")");
    }
}
