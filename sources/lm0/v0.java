package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f83904a;

    public v0(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f83904a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && Intrinsics.d(this.f83904a, ((v0) obj).f83904a);
    }

    public final int hashCode() {
        return this.f83904a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f83904a, ")");
    }
}
