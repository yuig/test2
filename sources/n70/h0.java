package n70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f89615a;

    public h0(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f89615a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f89615a, ((h0) obj).f89615a);
    }

    public final int hashCode() {
        return this.f89615a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f89615a, ")");
    }
}
