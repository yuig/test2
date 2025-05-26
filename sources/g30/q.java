package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q implements s {

    /* renamed from: d, reason: collision with root package name */
    public final String f63437d;

    public q(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f63437d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f63437d, ((q) obj).f63437d);
    }

    public final int hashCode() {
        return this.f63437d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherV3ResendUserEmailMutation(__typename="), this.f63437d, ")");
    }
}
