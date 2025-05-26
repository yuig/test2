package bt0;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes5.dex */
public final class o implements l82.h {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f23883a;

    public o(h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f23883a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f23883a, ((o) obj).f23883a);
    }

    public final int hashCode() {
        return this.f23883a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f23883a, ")");
    }
}
