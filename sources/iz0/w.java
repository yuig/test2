package iz0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements x {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f73937a;

    public w(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f73937a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f73937a, ((w) obj).f73937a);
    }

    public final int hashCode() {
        return this.f73937a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f73937a, ")");
    }
}
