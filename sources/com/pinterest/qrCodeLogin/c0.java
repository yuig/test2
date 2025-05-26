package com.pinterest.qrCodeLogin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f50302a;

    public c0(zy.e0 wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f50302a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f50302a, ((c0) obj).f50302a);
    }

    public final int hashCode() {
        return this.f50302a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("PinalyticSideEffectRequest(wrapped="), this.f50302a, ")");
    }
}
