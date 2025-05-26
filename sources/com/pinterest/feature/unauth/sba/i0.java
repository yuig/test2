package com.pinterest.feature.unauth.sba;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements j0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.h0 f48832a;

    public i0(o82.h0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f48832a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f48832a, ((i0) obj).f48832a);
    }

    public final int hashCode() {
        return this.f48832a.hashCode();
    }

    public final String toString() {
        return jq.b.j(new StringBuilder("WrappedMultiSectionRequest(wrapped="), this.f48832a, ")");
    }
}
