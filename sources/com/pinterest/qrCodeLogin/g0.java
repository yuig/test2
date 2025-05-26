package com.pinterest.qrCodeLogin;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f50309a;

    public g0(k92.m request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f50309a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f50309a, ((g0) obj).f50309a);
    }

    public final int hashCode() {
        return this.f50309a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("WrappedToastSideEffectRequest(request="), this.f50309a, ")");
    }
}
