package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f26649a;

    public y0(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f26649a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && Intrinsics.d(this.f26649a, ((y0) obj).f26649a);
    }

    public final int hashCode() {
        return this.f26649a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f26649a, ")");
    }
}
