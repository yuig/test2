package ad2;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes4.dex */
public final class n implements p {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f2110a;

    public n(h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f2110a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f2110a, ((n) obj).f2110a);
    }

    public final int hashCode() {
        return this.f2110a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedListRequest(wrapped="), this.f2110a, ")");
    }
}
