package dt0;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes5.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f56254a;

    public s(h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f56254a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f56254a, ((s) obj).f56254a);
    }

    public final int hashCode() {
        return this.f56254a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f56254a, ")");
    }
}
