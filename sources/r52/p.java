package r52;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes4.dex */
public final class p implements w {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f106293a;

    public p(h0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f106293a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f106293a, ((p) obj).f106293a);
    }

    public final int hashCode() {
        return this.f106293a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(nestedEffect="), this.f106293a, ")");
    }
}
