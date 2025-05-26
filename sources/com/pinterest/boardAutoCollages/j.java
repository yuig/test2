package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f44569a;

    public j(o82.g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f44569a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f44569a, ((j) obj).f44569a);
    }

    public final int hashCode() {
        return this.f44569a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f44569a, ")");
    }
}
