package ma1;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes5.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f86812a;

    public t(h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f86812a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f86812a, ((t) obj).f86812a);
    }

    public final int hashCode() {
        return this.f86812a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionEffectRequest(wrapped="), this.f86812a, ")");
    }
}
