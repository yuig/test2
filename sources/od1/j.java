package od1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f94133a;

    public j(o82.g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f94133a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f94133a, ((j) obj).f94133a);
    }

    public final int hashCode() {
        return this.f94133a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f94133a, ")");
    }
}
