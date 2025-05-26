package com.pinterest.feature.unauth.sba;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f48839a;

    public m(o82.g0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f48839a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f48839a, ((m) obj).f48839a);
    }

    public final int hashCode() {
        return this.f48839a.hashCode();
    }

    public final String toString() {
        return jq.b.i(new StringBuilder("WrappedMultiSectionEvent(wrapped="), this.f48839a, ")");
    }
}
