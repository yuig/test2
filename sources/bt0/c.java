package bt0;

import kotlin.jvm.internal.Intrinsics;
import o82.g0;

/* loaded from: classes5.dex */
public final class c implements u50.s {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f23862a;

    public c(g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f23862a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f23862a, ((c) obj).f23862a);
    }

    public final int hashCode() {
        return this.f23862a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f23862a, ")");
    }
}
