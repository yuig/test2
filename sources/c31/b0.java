package c31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f25571a;

    public b0(o82.h0 nestedEffect) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f25571a = nestedEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f25571a, ((b0) obj).f25571a);
    }

    public final int hashCode() {
        return this.f25571a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("ListSideEffectRequest(nestedEffect="), this.f25571a, ")");
    }
}
