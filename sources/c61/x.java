package c61;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f26647a;

    public x(o82.g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f26647a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f26647a, ((x) obj).f26647a);
    }

    public final int hashCode() {
        return this.f26647a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f26647a, ")");
    }
}
