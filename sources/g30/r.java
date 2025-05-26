package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r implements s {

    /* renamed from: d, reason: collision with root package name */
    public final String f63438d;

    public r(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f63438d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f63438d, ((r) obj).f63438d);
    }

    public final int hashCode() {
        return this.f63438d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserResponseV3ResendUserEmailMutation(__typename="), this.f63438d, ")");
    }
}
