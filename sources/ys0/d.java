package ys0;

import kotlin.jvm.internal.Intrinsics;
import o82.g0;

/* loaded from: classes5.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f140113a;

    public d(g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f140113a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f140113a, ((d) obj).f140113a);
    }

    public final int hashCode() {
        return this.f140113a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f140113a, ")");
    }
}
