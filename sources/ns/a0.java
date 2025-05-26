package ns;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f91897a;

    public a0(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f91897a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f91897a, ((a0) obj).f91897a);
    }

    public final int hashCode() {
        return this.f91897a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f91897a, ")");
    }
}
