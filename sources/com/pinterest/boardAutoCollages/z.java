package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f44603a;

    public z(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f44603a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f44603a, ((z) obj).f44603a);
    }

    public final int hashCode() {
        return this.f44603a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f44603a, ")");
    }
}
