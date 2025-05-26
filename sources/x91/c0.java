package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f134311a;

    public c0(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f134311a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f134311a, ((c0) obj).f134311a);
    }

    public final int hashCode() {
        return this.f134311a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f134311a, ")");
    }
}
