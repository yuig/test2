package ct0;

import kotlin.jvm.internal.Intrinsics;
import o82.g0;

/* loaded from: classes5.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f53154a;

    public k(g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f53154a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f53154a, ((k) obj).f53154a);
    }

    public final int hashCode() {
        return this.f53154a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f53154a, ")");
    }
}
