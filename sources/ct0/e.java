package ct0;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f53143a;

    public e(h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f53143a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f53143a, ((e) obj).f53143a);
    }

    public final int hashCode() {
        return this.f53143a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f53143a, ")");
    }
}
