package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f44547a;

    public b0(k92.n request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f44547a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f44547a, ((b0) obj).f44547a);
    }

    public final int hashCode() {
        return this.f44547a.hashCode();
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("WrappedToastSideEffectRequest(request="), this.f44547a, ")");
    }
}
