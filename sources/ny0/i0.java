package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f92597a;

    public i0(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f92597a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f92597a, ((i0) obj).f92597a);
    }

    public final int hashCode() {
        return this.f92597a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(wrapped="), this.f92597a, ")");
    }
}
