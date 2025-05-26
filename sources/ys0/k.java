package ys0;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes5.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f140120a;

    public k(h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f140120a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f140120a, ((k) obj).f140120a);
    }

    public final int hashCode() {
        return this.f140120a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f140120a, ")");
    }
}
