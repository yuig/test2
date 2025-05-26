package ad2;

import kotlin.jvm.internal.Intrinsics;
import o82.g0;

/* loaded from: classes4.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f2096a;

    public e(g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f2096a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f2096a, ((e) obj).f2096a);
    }

    public final int hashCode() {
        return this.f2096a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f2096a, ")");
    }
}
